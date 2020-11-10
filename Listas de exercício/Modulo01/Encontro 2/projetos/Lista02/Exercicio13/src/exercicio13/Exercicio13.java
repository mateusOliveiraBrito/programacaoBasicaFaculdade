package exercicio13;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        double n1, n2, n3, menor, medio, maior;
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.##");

        System.out.print("Digite o 1° valor: ");
        n1 = s.nextDouble();
        System.out.print("Digite o 2° valor: ");
        n2 = s.nextDouble();
        System.out.print("Digite o 3° valor: ");
        n3 = s.nextDouble();

        if (n1 > n2 && n1 > n3) {
            maior = n1;

            if (n2 > n3) {
                medio = n2;
                menor = n3;
            } else {
                medio = n3;
                menor = n2;
            }
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;

            if (n1 > n3) {
                medio = n1;
                menor = n3;
            } else {
                medio = n3;
                menor = n1;
            }
        } else {
            maior = n3;

            if (n1 > n2) {
                medio = n1;
                menor = n2;
            } else {
                medio = n2;
                menor = n1;
            }
        }

        System.out.print("Os números em ordem crescente são: ");
        System.out.print(d.format(menor) + ", ");
        System.out.print(d.format(medio) + ", ");
        System.out.print(d.format(maior) + ";");

    }
}
