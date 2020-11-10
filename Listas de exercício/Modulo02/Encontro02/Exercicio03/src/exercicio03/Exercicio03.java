package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a quantidade de números a serem lidos: ");
        int n = s.nextInt();
        System.out.println();
        
        int cont = 0;

        while (cont < n) {
            System.out.print("Digite um número: ");
            double numero = s.nextDouble();

            System.out.println("Triplo de " + numero + ": " + (numero * 3));
            System.out.println();
            cont++;
        }
    }
}
