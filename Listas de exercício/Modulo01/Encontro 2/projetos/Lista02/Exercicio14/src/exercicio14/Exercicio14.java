package exercicio14;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.##");

        System.out.print("Informe sua nota em Português: ");
        double n1 = s.nextDouble();
        System.out.print("Informe sua nota em Matemática: ");
        double n2 = s.nextDouble();
        System.out.print("Informe sua nota em Conhecimentos gerais: ");
        double n3 = s.nextDouble();
        System.out.println("");

        double media = (n1 + n2 + n3) / 3;

        String resultado = "";

        if (media > 7) {
            if (n1 >= 5 && n2 >= 5 && n3 >= 5) {
                resultado = "APROVADO (acima da média)";
            } else {
                resultado = "REPROVADO (pelo menos uma prova com nota abaixo de 5)";
            }
        } else {
            resultado = "REPROVADO (abaixo da média)";
        }

        System.out.println("Média: " + d.format(media));
        System.out.println("Resultado: " + resultado);
    }
}
