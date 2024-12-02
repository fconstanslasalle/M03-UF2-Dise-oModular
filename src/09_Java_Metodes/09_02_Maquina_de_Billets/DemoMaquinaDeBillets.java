import java.util.Scanner;

public class DemoMaquinaDeBillets {
    private static boolean ModeManteniment; //Variable global per activar mode manteniment
    public static void main(){  
      //Declarem una matriu de dos dimensions.
      int[][]Billets;
      Billets = new int[3][2]; //La Dimensionem 3 x 2
      int NumBillets=0;
      int TipusDeBillet=0;
      int NumeroDeZona=0;
      while(!ModeManteniment){
        System.out.println("Benvingut a TMB");
        do{
            TipusDeBillet=DemanarTipusDeBillet();
            Billets[NumBillets][0]= TipusDeBillet;
            NumeroDeZona=DemanarZona(NumBillets);
            Billets[NumBillets][1]= NumeroDeZona;
            NumBillets=NumBillets+1;

        }while((NumBillets<3)||(!ModeManteniment));
        
        if(!ModeManteniment){
          ImprimirTicket(Billets);
        }
        NumBillets=0;
      }       
    }

    private static void ImprimirTicket(int[][] billets) {
      /*Aquest métode calcula e imprimeix el ticket. Rep com a parametre la matriu Billets i no retorna res */
      /*INICI declaració variables */
      Scanner LlegirResposta = new Scanner(System.in);
      String Resposta="";
      double ImportTotal=0.0f;
      /*FINAL declaració variables */

      System.out.println("Vols imprimir ticket?");
      Resposta=LlegirResposta.next();
      if(Resposta.equals("Si")){
        ImportTotal=CalcularImportTotal(billets);
        System.out.println("El import total de la venta dels teus billets es: "+ImportTotal);
        }
      else{
        System.out.println("Compra finalitzada correctament. Tornant al menú principal");
        }
    }

    private static double CalcularImportTotal(int[][] billets) {
      /*Aquest mètode només calcula el import total a pagar per els billets seleccionats*/
      /*Com a paràmetre rebem la matriu Billets amb l´informació introduida per el usuari */
      /*INICI Declaració variables */
      double ImportTotal=0.0f;
      /*FINAL Declaració variables */
      for(int i=0; i<3; i++){
        switch (billets[i][0]){
          case 1://Billet Sencill
            if (billets[i][1]==1){
              ImportTotal = ImportTotal + 2.40;
            }
            else if (billets[i][1]==2) {
              ImportTotal=ImportTotal + (2.40*1.31);
            }
            else{
              ImportTotal=ImportTotal + (2.49*1.84);
            }
            break;
          case 2://Billet T- Casual
            if (billets[i][1]==1){
              ImportTotal = ImportTotal + 11.35;
            } 
            else if (billets[i][1]==2) {
              ImportTotal=ImportTotal + (11.35*1.31);
            }
            else{
              ImportTotal=ImportTotal + (11.35*1.84);
            }
            break;
          case 3://Billet T-Usual
            if (billets[i][1]==1){
              ImportTotal = ImportTotal + 40;
            }
            else if (billets[i][1]==2) {
              ImportTotal=ImportTotal + (40*1.31);
            }
            else{
              ImportTotal=ImportTotal + (40*1.84);
            }
            break;
          case 4://Billet T-Familiar
            if (billets[i][1]==1){
              ImportTotal = ImportTotal + 10;
            }
            else if (billets[i][1]==2) {
              ImportTotal=ImportTotal + (10*1.31);
            }
            else{
              ImportTotal=ImportTotal + (10*1.84);
            }
            break;
          case 5://Billet T-Jove
            if (billets[i][1]==1){
              ImportTotal =ImportTotal + 11.35;
            }
            else if (billets[i][1]==2) {
              ImportTotal=ImportTotal + (11.35*1.31);
            }
            else{
              ImportTotal=ImportTotal + (11.35*1.84);
            }
            break;
            }
        }
    return ImportTotal;//Retornem el import total del cost de tots els billets
    }

    private static int DemanarZona(int NumBillets) {
      /*Aquest mètode només demana al usuari quina zona ha de aplicar al billet seleccionat previmant */
      /*Rebem a través de un parametre el número de billet que estem demanant, saben que com a màxim podrán ser 3*/
      /*INICI Declaració variables*/
      int NumeroZona=0;
      Scanner LlegirZona= new Scanner(System.in);
      /*FINAL Declaració de variables*/

      System.out.println("Si us plau, introdueix la zona del billet:"+NumBillets);
      NumeroZona=LlegirZona.nextInt();
      if (NumeroZona==4321){
          ModeManteniment=true;
      }
      return NumeroZona;//Retornem la zona que ens ha introduit el usuari

    }

    private static int DemanarTipusDeBillet() {
        //
        Scanner LlegirOpcio = new Scanner(System.in);
        int TipusBillet=0;

        System.out.println("Sisplau, escull quins tipus de billet vols?");
        System.out.println("1. Billet Senzill");
        System.out.println("2. T-Casual");
        System.out.println("3. T-Usual");
        System.out.println("4. T-Familiar");
        System.out.println("5. T-Jove");
        TipusBillet =LlegirOpcio.nextInt();
        if (TipusBillet==4321){
            ModeManteniment=true;
        }
    return TipusBillet;
   }
}
