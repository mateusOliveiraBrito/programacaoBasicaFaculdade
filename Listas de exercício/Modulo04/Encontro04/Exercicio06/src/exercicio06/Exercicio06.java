package exercicio06;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o lado do quadrado: ");
        double lado = s.nextDouble();
        System.out.println("Área do quadrado: " + areaQuadrado(lado));

        System.out.println("");
        System.out.print("Informe a base do retângulo: ");
        double base = s.nextDouble();
        System.out.print("Informe a altura do retângulo: ");
        double altura = s.nextDouble();
        System.out.println("Área do retângulo: " + areaRetangulo(base, altura));

        System.out.println("");
        System.out.print("Informe o raio do círculo: ");
        double raio = s.nextDouble();
        System.out.println("Área do círculo: " + areaCirculo(raio));

        System.out.println("");
        System.out.print("Informe a base menor do trapézio: ");
        double baseMenor = s.nextDouble();
        System.out.print("Informe a base maior do trapézio: ");
        double baseMaior = s.nextDouble();
        System.out.print("Informe a altura do trapézio: ");
        altura = s.nextDouble();
        System.out.println("Área do trapézio: " + areaTrapezio(baseMenor, baseMaior, altura));
    }

    private static double areaQuadrado(double lado) {
        return Math.pow(lado, 2);
    }

    private static double areaRetangulo(double base, double altura) {
        return base * altura;
    }

    private static double areaCirculo(double raio) {
        return 3.14 * (Math.pow(raio, 2));
    }

    private static double areaTrapezio(double baseMenor, double baseMaior, double altura) {
        return ((baseMenor + baseMaior) * altura) / 2;
    }
}
