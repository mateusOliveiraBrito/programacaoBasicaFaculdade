package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        //variaveis
        String sexo;
        double altura, pesoIdeal = 0.0;

        //leitura 
        Scanner s = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        altura = s.nextDouble();
        System.out.print("Informe seu sexo com (M/F): ");
        sexo = s.next();
        System.out.println("");

        //calculos
        if (sexo.equalsIgnoreCase("M")) {
            pesoIdeal = 72.7 * altura - 58;
        } else if (sexo.equalsIgnoreCase("F")) {
            pesoIdeal = 62.1 * altura - 44.7;
        }

        System.out.println("Sexo: " + sexo.toUpperCase());
        System.out.println("Altura: " + altura);
        System.out.println("Peso ideal: " + pesoIdeal);
    }
}
