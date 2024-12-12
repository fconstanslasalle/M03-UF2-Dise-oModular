import java.util.Scanner;
public class Calculadora {
    Scanner input = new Scanner(System.in); // variable global

    public static void main(String[] args) {
        Calculadora main = new Calculadora();
        main.init();
    }

    public void init(){
        int result = 0, opcio =0;
        int num1 =0, num2 = 0;

        System.out.println("Entri dos nombres enters:");
        System.out.println("Escriu el numero 1");
        num1 = llegirInt();

        System.out.println("Escriu el numero 2");
        num2 = llegirInt();

        System.out.println("[1] Sumar\n" +
                "[2] Restar\n" +
                "[3] Multiplicar\n" +
                "[4] Dividir");

        opcio = llegirInt();

        switch(opcio){
            case 1:
                result = suma(num1, num2);
                break;
            case 2:
                result = resta(num1, num2);
                break;
            case 3:
                result = multiplicacio(num1, num2);
                break;
            case 4:
                result = divisio(num1, num2);
                break;
            default:
                System.out.println("ERROR: Opci� inv�lida");
                break;
        }
        System.out.println("El resultat de la operaci� es: " + result);
    }

    public int suma(int a, int b){
        int c = 0;
        c = a + b;

        return c;
    }

    public int multiplicacio(int a, int b){
        int c = 0;
        c = a * b;

        return c;
    }

    public int divisio(int a, int b){
        int c = 0;
        boolean esZero = false;

        esZero = comprovarZero(b);

        if(esZero){
            System.out.println("El denominador era 0, no puc dividir!");
        }else{
            c = a / b;
        }
        return c;
    }

    private boolean comprovarZero(int r){
        if(r == 0){
            return true;
        }else{
            return false;
        }
    }

    public int llegirInt(){
        boolean valorCorrecte;
        int x = 0;

        do{
            if(!input.hasNextInt()){
                System.out.println("Escriu un enter, pesat!");
                input.nextLine();
                valorCorrecte = false;
            }else{
                x = input.nextInt();
                input.nextLine();
                valorCorrecte = true;
            }
        }while(!valorCorrecte);

        return x;
    }

    public int resta(int a, int b){
        int z = 0;
        z = a - b;

        return z;
    }
}
