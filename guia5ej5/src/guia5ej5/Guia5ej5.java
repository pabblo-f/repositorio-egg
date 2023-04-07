package guia5ej5;

public class Guia5ej5 {

    public static void main(String[] args) {
        int A[][] = {{1, 4, 6}, {9, 8, 2}, {1, 4, 6}};	//Se crea la matriz
        int AT[][] = new int[3][3];
        boolean band = true;	//Se crea una variable bandera
        boolean band2 = true;	//Se crea una variable bandera 2

        //Imprimir la matriz
        System.out.println("La matriz es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //Determinar si es simétrica
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j] != A[j][i]) {
                    band = false;
                    i = 3;
                    break;
                }
            }
        }

        //Determinar si es antisimetrica
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[j][i] = (-1) * A[j][i];
                AT[i][j] = A[j][i];
                A[j][i] = (-1) * A[j][i];
                if (AT[i][j] != A[i][j]) {
                    band2 = false;
                    i = 3;
                    break;
                }
            }
        }

        //Mostrar si es simétrica o no
        if (band) {
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz NO es simetrica");
        }

        //Mostrar si es antisimetrica o no
        if (band2) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz NO es antisimetrica");
        }

    }
}
