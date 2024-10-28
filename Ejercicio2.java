/*
Matrices 3*3
ventas entre 1000 a 10000
 */
package programas;
import java.util.Random;

public class Ejercicio2 {
    //entrada de datos
      public static void main(String[] args) {
        Random random = new Random();
        int[][] ventas = new int[3][3];
        int totalVentas = 0;
        int cantidadVentas = 3 * 3; 

        // proceso de datos
        System.out.println("Matriz de Ventas Aleatorias:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ventas[i][j] = 1000 + random.nextInt(9001); 
                System.out.print(ventas[i][j] + "\t");
                totalVentas += ventas[i][j];
            }
            System.out.println();
        }

        //p. ventas
        double promedioVentas = (double) totalVentas / cantidadVentas;

        // Salisa de datos
        System.out.println("\nEl total de las ventas es: " + totalVentas);
        System.out.printf("El promedio de las ventas es: %.2f\n", promedioVentas);
    }
}

