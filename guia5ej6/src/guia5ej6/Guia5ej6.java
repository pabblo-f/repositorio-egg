/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
 * suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
 * permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
 * El programa deberá comprobar que los números introducidos son correctos, es decir,
 * están entre el 1 y el 9.
 */
package guia5ej6;

import java.util.Scanner;


public class Guia5ej6 {

    
    
     public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        RellenarMatriz(matriz);
        ImprimirMatriz(matriz);
        if (CuadradoMagico(matriz))
            System.out.println("Es un cuadrado magico wachin!!");
        else
            System.out.println("Cualquiera");
    }

    private static void RellenarMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese valor para la posición [" + i + "] [" + j + "]");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    private static void ImprimirMatriz(int[][] matriz) {
        System.out.println("----------------------Matriz-------------------------");
         for (int[] matriz1 : matriz) {
             for (int j = 0; j < matriz.length; j++) {
                 System.out.print("|" + matriz1[j] + "|");
             }
             System.out.println();
         }
    }

    private static boolean CuadradoMagico(int[][] matriz) {
        int fil = 0, col = 0, diag = 0, j = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][j] + matriz[i][j + 1] + matriz[i][j + 2] == 15)
                fil++;
            if (matriz[j][i] + matriz[j + 1][i] + matriz[j + 2][i] == 15)
                col++;
            if (matriz[0][0] + matriz[1][1] + matriz[2][2] == 15
                    || matriz[2][0] + matriz[1][1] + matriz[0][2] == 15)
                diag++;
            System.out.println(col + " " + fil + " " + diag);
        }
        return diag == 3 && col == 3 && fil == 3;
    }
}   
    
    

