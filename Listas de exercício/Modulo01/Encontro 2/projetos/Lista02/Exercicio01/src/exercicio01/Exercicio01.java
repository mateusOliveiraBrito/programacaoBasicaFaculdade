package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        //declara variável
        double real, modulo;

        //faz a leitura dos dados
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe um número real qualquer: ");
        real = teclado.nextDouble();

        if (real < 0) {
            modulo = Math.abs(real);
            System.out.println("O módulo de " + real + " é: " + modulo);
        } else {
            modulo = real;
            System.out.println("O módulo de " + real + " é: " + modulo);
        }
    }
}
