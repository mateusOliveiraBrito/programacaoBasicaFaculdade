package exercicio519;

import java.util.Scanner;

public class Exercicio519 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] n1 = new int[10];
        int[] n2 = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe um valor para a posição " + (i + 1) + " do 1° vetor: ");
            n1[i] = s.nextInt();
            System.out.print("Informe um valor para a posição " + (i + 1) + " do 2° vetor: ");
            n2[i] = s.nextInt();
            System.out.println("");
        }

        System.out.println("\nIntersecção dos conjuntos: ");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (n1[i] == n2[j]) {
                    System.out.println("Faz parte dos dois vetores: " + n1[i]);
                }
            }
        }
    }
}
