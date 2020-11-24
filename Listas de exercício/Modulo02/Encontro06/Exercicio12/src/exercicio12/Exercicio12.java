package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        int cont = 0;
        long soma = 0, numero = 0;
        double media = 0d;
        Scanner s = new Scanner(System.in);

        //loop infinito
        for (;;) {
            System.out.print("Digite um número: ");
            numero = s.nextLong();
            if (numero == 9999) {
                break;
            }

            soma += numero;
            cont++;
        }
        media = soma / cont;

        System.out.println("");
        System.out.println("SOMA = " + soma);
        System.out.println("MÉDIA = " + media);

    }
}
