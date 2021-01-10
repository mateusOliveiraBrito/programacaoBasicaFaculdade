package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe um número: ");
        long n = s.nextLong();

        System.out.println("O fatorial de " + n + " é : " + calculeFatorial(n));
    }

    private static long calculeFatorial(long n) {
        long fatorial = n;

        while (n > 1) {
            fatorial = fatorial * (n - 1);
            n--;
        }
        return fatorial;
    }
}
