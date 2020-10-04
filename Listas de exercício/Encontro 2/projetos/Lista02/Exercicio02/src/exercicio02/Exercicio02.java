package exercicio02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        //declara variaveis 
        double salario, aumentoPercentual;
        
        //formatador de decimais
        DecimalFormat d = new DecimalFormat(".##");
        
        //lê os dados
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu salário: ");
        salario = teclado.nextDouble();
        System.out.println("");
        System.out.println("Seu salário era de: R$ " + d.format(salario));
        
        aumentoPercentual = (salario * (5.0 / 100.0));
        System.out.println("O aumento com base no percentual de 5% é: R$ " + d.format(aumentoPercentual));
        
        if (salario <= 750.0){
            salario += aumentoPercentual;
            salario += 100;
        } else {
            salario += aumentoPercentual;
        }
        
        System.out.println("Seu salário após o reajuste é: R$ " + d.format(salario));
    }
}
