package exercicio08;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos: ");
        int quantidade = s.nextInt();
        calculaBoletim(quantidade);
    }

    private static void calculaBoletim(int qtdAlunos) {
        Scanner t = new Scanner(System.in);
        int linhas = qtdAlunos;
        int colunas = 4;
        double[][] boletim = new double[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {

                if (j == 3) {
                    double media = (boletim[i][0] * 0.1) + (boletim[i][1] * 0.35) + (boletim[i][2] * 0.55);
                    boletim[i][j] = media;
                } else {
                    System.out.print("Insira a nota da Prova " + (j + 1) + " do Aluno " + (i + 1) + ": ");
                    double nota = t.nextDouble();
                    boletim[i][j] = nota;
                }
            }
            System.out.println("");
        }

        //calcula a média aritmética das notas finais
        double nota = 0d;
        double mediaAritmeticaNF = 0d;
        int contMedia = 0;

        for (int i = 0; i < linhas; i++) {
            nota += boletim[i][3];
            contMedia++;
        }

        mediaAritmeticaNF = nota / contMedia;

        //verifica quantidade de P1 acima de 6,5
        int contP1 = 0;

        for (int i = 0; i < linhas; i++) {
            if (boletim[i][0] > 6.5) {
                contP1++;
            }
        }

        //verifica maior nota da P2
        double maiorP2 = 0d;
        for (int i = 0; i < linhas; i++) {
            if (boletim[i][1] > maiorP2) {
                maiorP2 = boletim[i][1];
            }
        }

        //verifica maior nota da P3
        double maiorP3 = 0d;
        for (int i = 0; i < linhas; i++) {
            if (boletim[i][2] > maiorP3) {
                maiorP3 = boletim[i][2];
            }
        }

        //imprime relatório
        System.out.println("");
        System.out.println("A Média Aritmética Final da turma é: " + mediaAritmeticaNF);
        System.out.println("A quantidade de P1 acima de 6,5 é: " + contP1);
        System.out.println("A maior nota da P2: " + maiorP2);
        System.out.println("A maior nota da P3: " + maiorP3);
    }
}
