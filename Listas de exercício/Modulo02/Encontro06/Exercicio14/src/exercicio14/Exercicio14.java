package exercicio14;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nova = 0, velha = 0, n = 0;

        System.out.print("Digite uma idade: ");
        n = s.nextInt();
        nova = n;

        do {
            System.out.print("Digite uma idade: ");
            n = s.nextInt();
            if (n == 0) {
                break;
            }

            if (n > velha) {
                velha = n;
            }

            if (n > 0 && n < nova) {
                nova = n;
            }

        } while (n != 0);

        System.out.println("Pessoa mais velha: " + velha);
        System.out.println("Pessoa mais nova: " + nova);

    }
}
