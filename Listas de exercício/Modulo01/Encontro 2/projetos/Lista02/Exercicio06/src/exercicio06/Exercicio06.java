package exercicio06;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        //variaveis
        double n1, n2, media;
        String situacao = "";

        //leitura
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        n1 = s.nextDouble();
        System.out.print("Digite a nota 2: ");
        n2 = s.nextDouble();
        System.out.println("");
        
        //calculo de media e verificação de situação
        media = (n1 + n2) / 2;
        
        if (media < 3){
            situacao = "REPROVADO";
        } else if (media >= 3 && media < 7){
            situacao = "RECUPERAÇÃO";
        } else if (media >= 7){
            situacao = "APROVADO";
        }
        
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }
}
