package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        int n;
        String resultado;

        Scanner s = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        n = s.nextInt();
        System.out.println("");

        resultado = n % 2 == 0 ? "PAR" : "ÍMPAR";
        
        System.out.println("Número " + n + " é " + resultado);
    }
}
