package exercicio04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o tempo em Horas: ");
        double tempo = s.nextDouble();
        System.out.print("Informe a velocidade média em Km/h: ");
        double velocidade = s.nextDouble();

        calculeLitrosCombustivel(tempo, velocidade);
    }

    private static void calculeLitrosCombustivel(double tempo, double velocidade) {
        int quilometragemPorLitro = 12;
        double distancia = tempo * velocidade;
        double litrosUtilizados = distancia / quilometragemPorLitro;
        DecimalFormat format = new DecimalFormat("#.##");

        System.out.println("");
        System.out.println("-VELOCIDADE MÉDIA: " + velocidade + " Km/h;");
        System.out.println("-TEMPO GASTO: " + tempo + " Horas;");
        System.out.println("-DISTÂNCIA PERCORRIDA: " + distancia + " Km;");
        System.out.println("-QUANTIDADE DE LITROS: " + format.format(litrosUtilizados) + " L;");
    }
}
