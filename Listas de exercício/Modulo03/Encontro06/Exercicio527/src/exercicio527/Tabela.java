package exercicio527;

import java.util.Arrays;

public class Tabela {

    private int linhas;
    private int colunas;
    public int[][] tabela;
    private int[][] tabelaAuxiliar;
    public int[][] tabelaInicial;
    private int[] indicesLinhas;

    public Tabela(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.tabela = new int[this.linhas][this.colunas];
        this.tabelaAuxiliar = new int[this.linhas][this.colunas];
        this.tabelaInicial = new int[this.linhas][this.colunas];
        this.indicesLinhas = new int[this.linhas];
    }

    public void imprimeTabela() {
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                System.out.print(tabela[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void zeraTabelaAuxiliar() {
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                tabelaAuxiliar[i][j] = 0;
            }
        }
    }

    public void trocaMaiorComMenorPorLinha() {
        int maior = 0;
        int menor = 0;
        int linhaMenor = 0, colunaMenor = 0;
        int linhaMaior = 0, colunaMaior = 0, aux = 0;
        boolean primeiroLoop = true;

        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                if (primeiroLoop) {
                    primeiroLoop = false;
                    menor = tabela[i][j];
                    maior = tabela[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                    linhaMenor = i;
                    colunaMenor = j;
                }

                if (tabela[i][j] > maior) {
                    maior = tabela[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }

                if (tabela[i][j] < menor) {
                    menor = tabela[i][j];
                    linhaMenor = i;
                    colunaMenor = j;
                }

                if (j == this.colunas - 1) {
                    tabela[linhaMenor][colunaMenor] = maior;
                    tabela[linhaMaior][colunaMaior] = menor;
                }
            }
            primeiroLoop = true;
            menor = 0;
            maior = 0;
        }
    }

    public void trocaColunas() {
        boolean primeiroLoop = true;
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {

                if (primeiroLoop) {
                    primeiroLoop = false;
                    tabelaAuxiliar[i][j] = tabela[i][colunas - 1];
                }

                if (j <= colunas - 2) {
                    tabelaAuxiliar[i][j + 1] = tabela[i][j];
                }
            }
            primeiroLoop = true;
        }

        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                tabela[i][j] = tabelaAuxiliar[i][j];
            }
        }
    }

    public void trocaLinhas() {
        zeraTabelaAuxiliar();
        boolean primeiroLoop = true;
        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {

                if (primeiroLoop) {
                    primeiroLoop = false;
                    if (i <= linhas - 2) {
                        tabelaAuxiliar[i][j] = tabela[i + 1][j];
                    } else {
                        tabelaAuxiliar[i][j] = tabela[i][j];
                    }
                }

                if (i <= linhas - 2) {
                    tabelaAuxiliar[i][j] = tabela[i + 1][j];
                } else {
                    tabelaAuxiliar[i][j] = tabela[i][j];
                }

                if (i == linhas - 1) {
                    tabelaAuxiliar[linhas - 1][j] = tabela[0][j];
                }
            }
            primeiroLoop = true;
        }

        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                tabela[i][j] = tabelaAuxiliar[i][j];
            }
        }
        zeraTabelaAuxiliar();
    }

    public void substituiColunasPelaSomaMinima() {
        int soma = 0;
        int menorSoma = 0;
        int indiceMenor = 0;
        boolean primeiroLoop = true;

        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                if (primeiroLoop) {
                    for (int k = 0; k < this.colunas; k++) {
                        soma += tabela[i][k];
                        menorSoma = soma;
                        primeiroLoop = false;
                    }
                } else {
                    soma = 0;
                    soma += tabela[i][j];
                }
            }

            if (soma < menorSoma) {
                menorSoma = soma;
                indiceMenor = i;
            }
        }

        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                tabelaAuxiliar[i][j] = tabela[indiceMenor][j];
            }
        }

        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                tabela[i][j] = tabelaAuxiliar[i][j];
            }
        }
    }

    public void ordenaTabela() {
        int[] linhaTemporaria = new int[this.colunas];

        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                if (tabelaInicial[i][0] > tabelaInicial[j][0]) {
                    for (int k = 0; k < this.colunas; k++) {
                        linhaTemporaria[k] = tabelaInicial[i][k];
                    }

                    for (int k = 0; k < this.colunas; k++) {
                        tabelaInicial[i][k] = tabelaInicial[j][k];
                    }

                    for (int k = 0; k < this.colunas; k++) {
                        tabelaInicial[j][k] = linhaTemporaria[k];
                    }
                }
            }
        }

        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                tabela[i][j] = tabelaInicial[i][j];
            }
        }
    }

    public int[] retornaValoresMaioresIndicesOrdenados(int[][] matriz) {
        int maior = 0;
        String indicesCompactados = "";
        for (int i = 0; i < this.linhas; i++) {
            indicesCompactados += matriz[i][0] + ",";
        }

        String[] indices = indicesCompactados.split(",");

        int[] indicesOrdenadosCrescente = new int[indices.length];
        int[] indicesOrdenadosDecrescentes = new int[indices.length];

        for (int i = 0; i < this.linhas; i++) {
            for (int j = 0; j < this.colunas; j++) {
                this.indicesLinhas[i] = i;
            }
        }

        for (int i = 0; i < indices.length; i++) {
            indicesOrdenadosCrescente[i] = Integer.parseInt(indices[i]);
        }

        Arrays.sort(indicesOrdenadosCrescente);

        int cont = indices.length;
        for (int numero : indicesOrdenadosCrescente) {
            indicesOrdenadosDecrescentes[cont - 1] = numero;
            cont--;
        }

        return indicesOrdenadosDecrescentes;
    }
}
