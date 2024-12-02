import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        pintar_menu();// Métode per pintar el menu i que ens retorni la opció que ha introduit el
                      // usuari

    }

    public static int pintar_menu() {

        // Inici_Variables_locals
        Scanner Llegir_opcio = new Scanner(System.in);
        int opcio = 0;
        boolean Error = false;
        // Final_Variables_locals

        // Inici_programa
        System.out.println("Benvingut a la calculadora");
        System.out.println("Opció 1: Sumar");
        System.out.println("Opció 2: Restar");
        System.out.println("Opció 3: Multiplicar");
        System.out.println("Opció 4: Dividir");

        do {
            Error = Llegir_opcio.hasNextInt();// Activació control de errors!

            if (Error != true) {
                System.out.println("Opció incorrecte, torna a introduir un opció válida");
            } else {
                opcio = Llegir_opcio.nextInt();
            }
        } while (Error != true);
        return (opcio);
        // Final_programa
    }

    public static int Sumar(int a, int b) {
        // Método para sumar dos números
        int resultado = 0;
        resultado = a + b;
        return resultado;
    }

    public static int Restar(int a, int b) {
        // Metodo para restar dos números
        int resultado = 0;
        resultado = a - b;
        return resultado;
    }

    public static int Multiplicar(int a, int b) {
        // Método para multiplicar dos números
        int resultado = 0;
        resultado = a * b;
        return resultado;
    }

}
