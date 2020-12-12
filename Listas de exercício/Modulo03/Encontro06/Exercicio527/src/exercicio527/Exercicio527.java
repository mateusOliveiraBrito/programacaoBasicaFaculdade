package exercicio527;

import java.util.Scanner;

public class Exercicio527 {

    public static void main(String[] args) {
        final int LINHAS = 3;
        final int COLUNAS = 3;

        Tabela tabela = new Tabela(LINHAS, COLUNAS);
        Scanner s = new Scanner(System.in);

        //preenche tabela
        for (int i = 0; i < LINHAS; i++) {
            System.out.print("\nINFORME UM VALOR PARA AS COLUNAS DA LINHA " + (i + 1) + " DA TABELA: \n");
            for (int j = 0; j < COLUNAS; j++) {
                System.out.print("Informe um valor para a coluna " + (j + 1) + " desta linha: ");
                int n = s.nextInt();
                tabela.tabela[i][j] = n;
                tabela.tabelaInicial[i][j] = n;
            }
        }

        System.out.println("\nTabela sem alterações: ");
        tabela.imprimeTabela();

        System.out.println("\nTabela com menores e maiores números das linhas trocados: ");
        tabela.trocaMaiorComMenorPorLinha();
        tabela.imprimeTabela();

        System.out.println("\nTabela com colunas trocadas: ");
        tabela.trocaColunas();
        tabela.imprimeTabela();

        System.out.println("\nTabela com linhas trocadas: ");
        tabela.trocaLinhas();
        tabela.imprimeTabela();

        System.out.println("\nTabela com colunas trocadas pela soma mínima: ");
        tabela.substituiColunasPelaSomaMinima();
        tabela.imprimeTabela();
        
        System.out.println("\nTabela inicial com colunas ordenadas seguindo o critério: ");
        tabela.ordenaTabela();
        tabela.imprimeTabela();
    }
}
