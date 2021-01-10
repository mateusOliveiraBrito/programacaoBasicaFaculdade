package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        System.out.println(listaImagens());
    }

    private static String listaImagens() {
        Scanner s = new Scanner(System.in);
        int[] idades = new int[11];

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe uma idade: ");
            idades[i] = s.nextInt();
        }

        System.out.println("");
        System.out.print("Informe uma idade para buscar na lista de idades registradas: ");
        int idade = s.nextInt();

        for (int i = 0; i < 10; i++) {
            if (idades[i] == idade) {
                return "ACHEI";
            }
        }

        return "NÃO ACHEI";
    }
}
