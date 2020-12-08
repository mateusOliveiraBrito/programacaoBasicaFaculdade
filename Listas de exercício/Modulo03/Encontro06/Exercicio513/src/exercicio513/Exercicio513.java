package exercicio513;

import java.util.Scanner;

public class Exercicio513 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a quantidade de linhas da matriz: ");
        int linhas = s.nextInt();

        System.out.print("Informe a quantidade de colunas da matriz: ");
        int colunas = s.nextInt();

        if (linhas >= 10 || colunas >= 10) {
            System.out.println("\nA ordem da matriz não pode ser maior que 10x10!");
            return;
        } else {
            int[][] matriz = new int[linhas][colunas];

            for (int i = 0; i < linhas; i++) {
                System.out.println("\nINFORME OS VALORES DAS COLUNAS DA LINHA " + (i + 1) + ":\n");
                for (int j = 0; j < colunas; j++) {
                    System.out.print("Informe o valor da coluna " + (j + 1) + "da linha " + (i + 1) + ": ");
                    matriz[i][j] = s.nextInt();
                }
            }
            
            //imprime matriz
            System.out.println("\nMATRIZ:");
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
            }

            int[][] transposta = new int[colunas][linhas];

            for (int i = 0; i < colunas; i++) {
                for (int j = 0; j < linhas; j++) {
                    transposta[i][j] = matriz[j][i];
                }
            }

            //imprime transposta
            System.out.println("\nMATRIZ TRANSPOSTA:");
            for (int i = 0; i < colunas; i++) {
                for (int j = 0; j < linhas; j++) {
                    System.out.print(transposta[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
