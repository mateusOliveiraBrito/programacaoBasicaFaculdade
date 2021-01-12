package exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe um índice: ");
        int indice = s.nextInt();
        calculaFibonacci(indice);
    }

    private static void calculaFibonacci(int indice) {

        if (indice < 2) {
            System.out.println(indice);
            return;
        }

        int nAtual = 1;
        int nAnterior = 0;

        System.out.println("fibonacci(0) = " + nAnterior);
        System.out.println("fibonacci(1) = " + nAtual);

        for (int i = 1; i < indice; i++) {
            nAtual += nAnterior;
            nAnterior = nAtual - nAnterior;
            System.out.println("fibonacci(" + (i + 1) + ") = " + nAtual);
        }
    }
}
