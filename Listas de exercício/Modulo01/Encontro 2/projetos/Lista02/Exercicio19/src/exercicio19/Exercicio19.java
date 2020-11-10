package exercicio19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        int numero, codigo;
        double saldo, valor;
        String operacao;

        DecimalFormat d = new DecimalFormat("#.##");

        Scanner s = new Scanner(System.in);
        System.out.print("Informe o número da conta: ");
        numero = s.nextInt();
        System.out.print("Informe o saldo da conta: ");
        saldo = s.nextDouble();
        System.out.println("");

        System.out.println("Número da conta: " + numero);
        System.out.println("Saldo da conta: " + d.format(saldo));
        System.out.println("");

        System.out.println("Informe o código da operação que você deseja: \n1-Depósito \n2-Saque");
        System.out.print("Opção: ");
        codigo = s.nextInt();
        System.out.println("");

        switch (codigo) {
            case 1:
                operacao = "Depósito";
                System.out.print("Informe um valor de " + operacao + ": ");
                valor = s.nextDouble();
                saldo += valor;
                break;
            case 2:
                operacao = "Saque";
                System.out.print("Informe um valor de " + operacao + ": ");
                valor = s.nextDouble();
                saldo -= valor;
                break;
            default:
                System.out.println("Opção inválida!");
        }

        System.out.println("Novo saldo da conta: ");
        System.out.println("Saldo da conta: " + d.format(saldo));

        if (saldo < 0) {
            System.out.println("Conta estourada!");
        }
    }
}
