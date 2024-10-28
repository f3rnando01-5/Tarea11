/*
Matriz de ventas aletoriamente
 */
package programas;

  import java.util.Random;
public class Ejercicio1 {
    //entrada de datos
  public static void main(String[] args) {
        Random random = new Random();
        int[][] ventas = new int[4][4];
        int ventaMayor = Integer.MIN_VALUE;
        int ventaMenor = Integer.MAX_VALUE;

        // Matrices
        System.out.println("Matriz de Ventas Aleatorias:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                ventas[i][j] = 10 + random.nextInt(4991); 
                System.out.print(ventas[i][j] + "\t");

                // proceso de datos
                if (ventas[i][j] > ventaMayor) {
                    ventaMayor = ventas[i][j];
                }
                if (ventas[i][j] < ventaMenor) {
                    ventaMenor = ventas[i][j];
                }
            }
            System.out.println();
        }

        
        System.out.println("\nLa venta mayor es: " + ventaMayor);
        System.out.println("La venta menor es: " + ventaMenor);
    }
}

