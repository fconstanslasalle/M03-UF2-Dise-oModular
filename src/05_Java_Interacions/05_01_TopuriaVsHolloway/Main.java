/*
ENTRADA
Para cada una de las rondas se tendrá que indicar:
- La inicial del luchador que hace el golpe (T o H)
- El código del golpe (LK, J, G o KO)
SALIDA:
La salida tiene que mostrar por pantalla 
- El resultado final del combate. 
- Quién ha ganado (WINS) y la puntuación de los dos luchadores, primero la del ganador. 
- Si hay empate, indicar empate (DRAW) y la puntuación) o indicar qué luchador ha ganado por KO (WINS (KO)), en caso de KO.

*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Declaració variabes
    int segons_ronda = 300;
    int puntsH = 0;
    int puntsT = 0;
    int comptador_ronda = 1;
    boolean KO = false;
    String lluitador;
    String cops;

    // Inici escàner
    Scanner lector = new Scanner(System.in);

    // Inici programa
    // Fem un while fins que segons_ronda<0 i comptador ronda=5, o KO=true
    do {
      lluitador = lector.nextLine();
      cops = lector.nextLine();
      // Switch case en funcio de cops
      switch (cops) {
        case "LK": {
          // Depenent de qui el faci, sumem punts
          if (lluitador.equals("T")) {
            puntsT += 2;
          } else if (lluitador.equals("H")) {
            puntsH += 2;
          }
          segons_ronda -= 50; // restem els segons corresponents
          break;
        }
        case "J": {
          if (lluitador.equals("T")) {
            puntsT += 5;
          } else if (lluitador.equals("H")) {
            puntsH += 5;
          }
          segons_ronda -= 150;
          break;
        }
        case "G": {
          if (lluitador.equals("T")) {
            puntsT += 10;
          } else if (lluitador.equals("H")) {
            puntsH += 10;
          }
          segons_ronda -= 200;
          break;
        }
        case "KO": {
          // si estem a partir de la tercera ronda ja compta el KO
          if (comptador_ronda >= 3) {
            if (lluitador.equals("T")) {
              puntsT += 5000;
            }
            if (lluitador.equals("H")) {
              puntsH += 5000;
            }
            KO = true;
          } else { // Si no, es tracta com un default
            if (lluitador.equals("T")) {
              puntsT -= 1;
            } else if (lluitador.equals("H")) {
              puntsH -= 1;
            }
            segons_ronda -= 120;
          }
          break;
        }
        default: {
          if (lluitador.equals("T")) {
            puntsT -= 1;
          } else if (lluitador.equals("H")) {
            puntsH -= 1;
          }
          segons_ronda -= 120;
          break;
        }
      }
      // Si s'ha acabat la ronda
      if (segons_ronda <= 0) {
        segons_ronda = 300;
        comptador_ronda++;
      }
    } while (comptador_ronda <= 5 && KO == false);
    // if else per escriure el guanyador depenent de KO o punts o empat
    if (KO) {
      if (puntsT > puntsH) {
        System.out.println("Topuria WINS (KO)");
      } else if (puntsT < puntsH) {
        System.out.println("Holloway WINS (KO)");
      }
    } else if (puntsT > puntsH) {
      System.out.println("Topuria WINS " + puntsT + " - " + puntsH);
    } else if (puntsT < puntsH) {
      if (puntsT < 0 && puntsH < 0) {
        System.out.println("Holloway WINS " + puntsH + " - " + puntsT);
      } else {
        System.out.println("Holloway WINS " + puntsT + " - " + puntsH);
      }
    } else if (puntsT == puntsH) {
      System.out.println("DRAW " + puntsT + " - " + puntsH);
    }
  }
}
