package exercicio55;

import java.util.Scanner;

public class Exercicio55 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe um número: ");
            numeros[i] = s.nextInt();
        }

        //imprime na ordem reversa
        System.out.println("\nNúmeros na ordem inversa à digitação: ");
        for (int i = 9; i >= 0; i--) {
            System.out.println("" + numeros[i]);
        }
    }
}
