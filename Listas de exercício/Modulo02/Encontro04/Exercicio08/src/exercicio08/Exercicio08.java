package exercicio08;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0, b = 0, c = 0, eleitor = 0;

        do {
            System.out.println("Informe sua intenção de voto de acordo com uma das opções abaixo:"
                    + "\nA- Candidato A;"
                    + "\nB- Candidato B;"
                    + "\nC- Indeciso;");
            System.out.println();
            System.out.print("Opção: ");
            String opcao = s.next();

            if (opcao.equalsIgnoreCase("A") || opcao.equalsIgnoreCase("B") || opcao.equalsIgnoreCase("C")) {

                if (opcao.equalsIgnoreCase("A")) {
                    a++;
                } else if (opcao.equalsIgnoreCase("B")) {
                    b++;
                } else {
                    c++;
                }

            } else {
                System.out.println("Opção inválida!");
            }
            eleitor++;

            System.out.println();
        } while (eleitor < 20);

        System.out.println("Porcentagem candidato A: " + (a * 100) / 20 + "%");
        System.out.println("Porcentagem candidato B: " + (b * 100) / 20 + "%");
        System.out.println("Porcentagem indecisão: " + (c * 100) / 20 + "%");
    }
}
