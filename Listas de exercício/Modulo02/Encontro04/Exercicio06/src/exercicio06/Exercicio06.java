package exercicio06;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contPar = 0, contImpar = 0, n = 0;

        do {
            System.out.print("Digite um número: ");
            double numero = s.nextDouble();

            if (numero % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }

            n++;
        } while (n < 10);

        System.out.println();
        System.out.println("PARES: " + contPar);
        System.out.println("ÍMPARES: " + contImpar);

    }
}
