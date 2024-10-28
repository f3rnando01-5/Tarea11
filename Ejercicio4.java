/*
matrices4*4
 */
package programas;
import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
      // Entrada de datos
      Scanner scanner = new Scanner(System.in);
      int[][] compras = new int[4][4];
      int totalCompras = 0;

      // Proceso de datos
      System.out.println("Ingrese el monto de las compras para cada posición de la matriz 4x4:");
      for (int i = 0; i < 4; i++) {
          for (int j = 0; j < 4; j++) {
              System.out.print("Compra en [" + i + "][" + j + "]: ");
              compras[i][j] = scanner.nextInt();
              totalCompras += compras[i][j];
          }
      }

      // matriz 
      System.out.println("\nMatriz de Compras:");
      for (int i = 0; i < 4; i++) {
          for (int j = 0; j < 4; j++) {
              System.out.print(compras[i][j] + "\t");
          }
          System.out.println();
      }  

      // compras
      System.out.println("\nTotal de compras: " + totalCompras);

  
  }  
}
