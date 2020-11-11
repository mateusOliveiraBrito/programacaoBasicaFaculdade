package exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0, maior = 0, lido = 0, cont = 0;

        System.out.print("Informe um número inteiro de partida: ");
        n = s.nextInt();

        do {
            System.out.print("Digite um número: ");
            lido = s.nextInt();

            if (lido > maior) {
                maior = lido;
            }

            cont++;
        } while (cont < n);
        
        System.out.println();
        System.out.println("Maior número lido: " + maior);
    }
}
