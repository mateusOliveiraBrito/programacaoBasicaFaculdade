package exercicio517;

import java.util.Scanner;

public class Exercicio517 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double salario = 0d;
        int cont = 0;
        String salarioCompactado = "";

        for (;;) {
            System.out.print("Digite um salário (-1 para encerrar a leitura): ");
            salario = s.nextDouble();

            if (salario == -1) {
                break;
            }

            salarioCompactado += salario + ",";
            cont++;
        }

        String[] auxiliar = salarioCompactado.split(",");
        double[] salarios = new double[cont];

        System.out.println("");
        System.out.print("Informe uma porcentagem para reajuste: ");
        double reajuste = s.nextDouble();

        for (int i = 0; i < auxiliar.length; i++) {
            salarios[i] = Double.parseDouble(auxiliar[i]);
        }

        System.out.println("");
        for (int i = 0; i < salarios.length; i++) {
            System.out.println("Salário " + i + " reajustado: " + (salarios[i] += (salarios[i] * (reajuste / 100))));
        }
    }
}
