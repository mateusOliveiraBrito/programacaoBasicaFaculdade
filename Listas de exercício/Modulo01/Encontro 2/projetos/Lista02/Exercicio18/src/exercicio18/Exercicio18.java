package exercicio18;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o valor da compra: ");
        double compra = s.nextDouble();
        System.out.print("Informe o valor a ser pago: ");
        double pagamento = s.nextDouble();
        System.out.println("");
        System.out.println("Valor da compra: R$" + compra);

        compra = (int) compra;
        pagamento = (int) pagamento;

        double troco = pagamento - compra;
        System.out.println("Valor do troco: R$" + troco);

        int c = (int) troco / 100;
        troco = troco % 100;
        int d = (int) troco / 10;
        troco = troco % 10;
        int u = (int) troco / 1;

        System.out.println("NOTAS:");
        System.out.println(c + " -  notas de R$100,0");
        System.out.println(d + " -  notas de R$10,0");
        System.out.println(u + " -  notas de R$1,0");
    }
}
