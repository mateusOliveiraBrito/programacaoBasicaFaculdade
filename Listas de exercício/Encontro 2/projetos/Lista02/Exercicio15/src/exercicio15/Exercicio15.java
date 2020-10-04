package exercicio15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        double venda1, venda2, venda3, total;
        double comissao1, comissao2, comissao3;
        DecimalFormat d = new DecimalFormat("#.##");

        Scanner s = new Scanner(System.in);
        System.out.print("Informe a venda do corretor 1: ");
        venda1 = s.nextDouble();
        System.out.print("Informe a venda do corretor 2: ");
        venda2 = s.nextDouble();
        System.out.print("Informe a venda do corretor 3: ");
        venda3 = s.nextDouble();
        System.out.println("");

        total = venda1 + venda2 + venda3;

        //primeiro corretor
        if (venda1 > 50000) {
            comissao1 = venda1 * (12.0 / 100);
        } else if (venda1 >= 30000 && venda1 <= 50000) {
            comissao1 = venda1 * (9.5 / 100);
        } else {
            comissao1 = venda1 * (7.0 / 100);
        }

        //segundo corretor
        if (venda2 > 50000) {
            comissao2 = venda2 * (12.0 / 100);
        } else if (venda2 >= 30000 && venda2 <= 50000) {
            comissao2 = venda2 * (9.5 / 100);
        } else {
            comissao2 = venda2 * (7.0 / 100);
        }

        //terceiro corretor
        if (venda3 > 50000) {
            comissao3 = venda3 * (12.0 / 100);
        } else if (venda3 >= 30000 && venda3 <= 50000) {
            comissao3 = venda3 * (9.5 / 100);
        } else {
            comissao3 = venda3 * (7.0 / 100);
        }

        //relatorio
        System.out.println("===RELATÓRIO===");
        System.out.println("CORRETOR 1:");
        System.out.println("Venda: R$" + d.format(venda1));
        System.out.println("Comissão: R$" + d.format(comissao1));
        System.out.println("");
        
        System.out.println("CORRETOR 2:");
        System.out.println("Venda: R$" + d.format(venda2));
        System.out.println("Comissão: R$" + d.format(comissao2));
        System.out.println("");
        
        System.out.println("CORRETOR 3:");
        System.out.println("Venda: R$" + d.format(venda3));
        System.out.println("Comissão: R$" + d.format(comissao3));
        System.out.println("");
    }
}
