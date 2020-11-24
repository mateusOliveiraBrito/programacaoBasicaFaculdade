package exercicio15;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double preco = 0d, total = 0d, desconto = 0d;

        for (;;) {
            System.out.print("Digite o preço de um produto: ");
            preco = s.nextDouble();

            if (preco == 0) {
                break;
            }

            total += preco;
        }

        if (total <= 50) {
            desconto = 0.05;
        } else if (total > 50 && total <= 100) {
            desconto = 0.1;
        } else if (total > 100 && total <= 200) {
            desconto = 0.15;
        } else if (total > 200) {
            desconto = 0.2;
        }

        System.out.println("");
        System.out.println("TOTAL: R$ " + total);
        System.out.println("COM DESCONTO: R$ " + (total -= (total * desconto)));

    }
}
