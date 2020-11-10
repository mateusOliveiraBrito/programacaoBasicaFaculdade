package exercicio22;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        String conceito = "";

        Scanner s = new Scanner(System.in);
        System.out.print("Informe sua nota: ");
        int nota = s.nextInt();
        System.out.println("");

        if (nota >= 0 && nota <= 49) {
            conceito = "Insuficiente";
        } else if (nota >= 50 && nota <= 64) {
            conceito = "Regular";
        } else if (nota >= 65 && nota <= 84) {
            conceito = "Bom";
        } else if (nota >= 85 && nota <= 100) {
            conceito = "Ótimo";
        }

        System.out.println("A nota é: " + nota + "\nO conceito é: " + conceito);
    }
}
