package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int soma = 0, cont = 1;

        System.out.print("Digite um número inteiro maior que zero: ");
        double n = s.nextInt();

        if (n > 0) {

            do {
                if (cont % 5 == 0) {
                    soma += cont;
                }
                cont++;
            } while (cont <= n);

            System.out.println("Soma dos numeros multiplos de 5 no intervalo {1.0, " + n + "} é: " + soma);
        } else {
            System.out.println("O número informado é inválido!");
        }
    }
}
