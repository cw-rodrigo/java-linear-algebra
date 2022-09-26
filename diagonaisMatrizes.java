import java.util.Scanner;

public class diagonaisMatrizes {
    public static void main(String[] args) {
        int maiorElementoDiagonalPrincipal = 0;

        int[] diagonalPrincipal = new int[4];
        int[] diagonalSecundaria = new int[4];
        int[][] matrizEntrada = new int[4][4];

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite 16 valores:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizEntrada[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Matriz de ordem 4 apartir dos 8 valores digitados:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", matrizEntrada[i][j]);

                if (i == j) {
                    diagonalPrincipal[i] = matrizEntrada[i][j];

                    if (matrizEntrada[i][j] > maiorElementoDiagonalPrincipal)
                        maiorElementoDiagonalPrincipal = matrizEntrada[i][j];
                }

                else if (i + j == 3) {
                    diagonalSecundaria[i] = matrizEntrada[i][j];
                }
            }

            System.out.println();
        }

        System.out.println("\nMaior elemento dentro da diagonal principal: " + maiorElementoDiagonalPrincipal + "\n");
        System.out.println("Matriz multiplicada pelo maior elemento encontrado na diagonal principal:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(matrizEntrada[i][j] * maiorElementoDiagonalPrincipal + " ");

            System.out.println();
        }

        System.out.println("\nDiagonal principal");

        for (int i = 0; i < 4; i++) {
            System.out.print(diagonalPrincipal[i] + " ");
        }

        System.out.println("\nDiagonal secundaria");

        for (int i = 0; i < 4; i++) {
            System.out.print(diagonalSecundaria[i] + " ");
        }
    }
}
