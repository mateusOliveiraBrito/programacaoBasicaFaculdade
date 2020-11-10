package exercicio17;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Insira o valor de A: ");
        int a = s.nextInt();
        System.out.print("Insira o valor de B: ");
        int b = s.nextInt();
        System.out.print("Insira o valor de C: ");
        int c = s.nextInt();

        if ((a + b) > c) {
            System.out.println(a + " + " + b + " é maior que " + c);
        } else if ((a + b) == c) {
            System.out.println(a + " + " + b + " é igual que " + c);
        } else {
            System.out.println(a + " + " + b + " é menor que " + c);
        }
    }
}
