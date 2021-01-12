package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe um número: ");
        double n = s.nextDouble();

        System.out.println("O quadrado de " + n + " é: " + quad(n));
    }

    private static double quad(double n) {
        double quadrado = 0d;

        for (int i = 0; i < n; i++) {
            quadrado += ((i * 2) + 1);
        }

        return quadrado;
    }
}
