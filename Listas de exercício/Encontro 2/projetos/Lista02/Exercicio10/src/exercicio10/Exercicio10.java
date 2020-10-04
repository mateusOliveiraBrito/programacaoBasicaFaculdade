package exercicio10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        //variaveis
        double v1, v2, maior;
        
        //formatador
        DecimalFormat f = new DecimalFormat("#.##");

        //leitura
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        v1 = s.nextDouble();
        System.out.print("Informe o segundo valor: ");
        v2 = s.nextDouble();

        //verifica o maior
        if (v1 > v2) {
            maior = v1;
        } else {
            maior = v2;
        }
        
        System.out.println("O maior número é: " + f.format(maior));
    }
}
