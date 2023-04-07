/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
 * traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
 * cambiando sus filas por columnas (o viceversa).
 */
package guia5ej4;

import java.util.Random;

public class Guia5ej4 {

    public static void main(String[] args) {

        int matrizA[][] = new int[4][4];
        RellenarMatriz(matrizA);
        ImprimirMatriz(matrizA);
        MatrizTraspuesta(matrizA);
    }

    private static void MatrizTraspuesta(int[][] matriz) {
        int matrizB[][] = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizB[j][i] = matriz[i][j];
            }
        }
        System.out.println("----------------------Matriz traspuesta---------------------");
        for (int[] matrizB1 : matrizB) {
            for (int j = 0; j < matrizB[0].length; j++) {
                System.out.print("|" + matrizB1[j] + "|");
            }
            System.out.println();
        }
    }

    private static void RellenarMatriz(int[][] matriz) {
        Random rm = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rm.nextInt(10);
            }
        }
    }

    private static void ImprimirMatriz(int[][] matriz) {
        System.out.println("----------------------Matriz-------------------------");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("|" + matriz1[j] + "|");
            }
            System.out.println();
        }
    }
}
