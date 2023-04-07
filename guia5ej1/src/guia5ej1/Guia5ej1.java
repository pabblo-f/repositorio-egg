/*Consigna:
Realizar un algoritmo que llene un vector con los 100
primeros numeros enteros y los muestre por pantalla
en orden descendente.
 */
package guia5ej1;

import java.util.Scanner;

public class Guia5ej1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[] vector = new int[100];
        int longitud = vector.length;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = longitud;
            System.out.println("vector " + (i + 1) + " = " + vector[i]);
            longitud -= 1;
        }

    }
}
