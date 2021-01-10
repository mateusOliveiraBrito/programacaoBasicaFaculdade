package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o número de linhas da matriz: ");
        int linhas = s.nextInt();
        System.out.print("Informe o número de colunas da matriz: ");
        int colunas = s.nextInt();
        System.out.println("");

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Informe o valor da coluna " + j + " da linha " + i + ": ");
                matriz[i][j] = s.nextInt();
            }
            System.out.println("");
        }

        verificaLinhasEColunasNulas(matriz, linhas, colunas);
    }

    private static void verificaLinhasEColunasNulas(int[][] matriz, int linhas, int colunas) {
        int contLinhasNulas = 0;
        int contColunasNulas = 0;
        int contElementosLinha = 0;
        int contElementosColuna = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {

                if (matriz[i][j] == 0) {
                    contElementosLinha++;
                }

                if (i == 0) {
                    for (int k = 0; k < linhas; k++) {
                        if (matriz[k][j] == 0) {
                            contElementosColuna++;
                        }
                    }

                    if (contElementosColuna == linhas) {
                        contColunasNulas++;
                    }
                    contElementosColuna = 0;
                }
            }

            if (contElementosLinha == colunas) {
                contLinhasNulas++;
            }
            contElementosLinha = 0;
        }

        System.out.println("LINHAS NULAS: " + contLinhasNulas);
        System.out.println("COLUNAS NULAS: " + contColunasNulas);
    }
}
