package exercicio512;

import java.util.Scanner;

public class Exercicio512 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        int[][] novaMatriz = new int[3][4];

        //persiste dados na matriz
        for (int i = 0; i < 3; i++) {
            System.out.println("DIGITE OS VALORES DAS COLUNAS DA " + (i + 1) + "° LINHA: \n");
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor da " + (j + 1) + "° coluna da " + (i + 1) + "° linha: ");
                matriz[i][j] = s.nextInt();
            }
            System.out.println("");
        }

        //persiste os dados tratados na nova matriz
        System.out.print("Informe uma constante multiplicativa: ");
        int constante = s.nextInt();
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                novaMatriz[i][j] = matriz[i][j] * constante;
            }
        }
        
        //imprime na forma matricial
        for (int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(novaMatriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
