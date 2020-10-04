package exercicio03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        //declara as variáveis
        double raio, base, altura, areaCirculo, areaTriangulo, diferenca;
        
        //declara objeto que formata valores decimais
        DecimalFormat format = new DecimalFormat("#.##");

        //solicita a entrada de dados
        Scanner dado = new Scanner(System.in);
        System.out.print("Digite o valor do raio do círculo: ");
        raio = dado.nextDouble();
        System.out.print("Digite o valor da base do triângulo: ");
        base = dado.nextDouble();
        System.out.print("Digite o valor da altura do triângulo: ");
        altura = dado.nextDouble();
        System.out.println("");

        //realiza os calculos solicitados
        areaCirculo = Math.PI * Math.pow(raio, 2);
        areaTriangulo = (base * altura) / 2;
        diferenca = areaTriangulo - areaCirculo;

        //imprime os dados no console
        System.out.println("Área do círculo: " + format.format(areaCirculo));
        System.out.println("Área do triângulo: " + format.format(areaTriangulo));
        System.out.println("A diferença entre a área do triângulo pela área do círculo é: " + format.format(diferenca));

    }

}
