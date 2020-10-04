package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        //declaracao de variaveis
        double n1, n2, n3;
        String tipo;
        boolean isTriangulo;

        //leitura de dados
        Scanner s = new Scanner(System.in);
        System.out.print("Insira o primeiro número: ");
        n1 = s.nextDouble();
        System.out.print("Insira o segundo número: ");
        n2 = s.nextDouble();
        System.out.print("Insira o terceiro número: ");
        n3 = s.nextDouble();
        System.out.println("");

        //verifica se é triângulo
        if ((n1 < (n2 + n3)) && (n2 < (n1 + n3)) && (n3 < (n1 + n2))) {
            isTriangulo = true;
        } else {
            isTriangulo = false;
        }

        //verifica tipo do triangulo
        if (isTriangulo) {
            System.out.println("Os valores inseridos PODEM representar os lados de um triângulo!");

            if ((n1 == n2) && (n1 == n3) && (n2 == n3)) {
                tipo = "EQUILÁTERO";
            } else if ((n1 == n2) || (n1 == n3) || (n2 == n3)) {
                tipo = "ISÓSCELES";
            } else {
                tipo = "ESCALENO";
            }
            System.out.println("O triângulo é: " + tipo);
        } else {
            System.out.println("Os valores inseridos NÃO podem representar os lados de um triângulo!");
        }
    }
}
