package exercicio13;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double maior = 0d;
        double n = 0d;

        for (;;) {
            System.out.print("Informe um número: ");
            n = s.nextDouble();

            if (n == 9999) {
                break;
            }

            if (n > maior) {
                maior = n;
            }
        }

        System.out.println("");
        System.out.println("MAIOR = " + maior);
    }
}
