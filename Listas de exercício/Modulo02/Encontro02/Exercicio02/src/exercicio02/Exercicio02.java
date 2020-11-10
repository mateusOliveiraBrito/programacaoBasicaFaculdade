package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor maior que zero: ");
        int n = teclado.nextInt();

        System.out.println("Contagem regressiva: ");

        if (n > 0) {

            while (n >= 0) {
                System.out.println(n);
                n--;
            }
        } else {
            System.out.println("O valor informado é inválido!");
        }
    }
}
