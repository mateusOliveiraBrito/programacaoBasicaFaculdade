package exercicio04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        //leitura de dados
        System.out.print("Informe um valor qualquer: ");
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        
        //declaracao de variavel
        boolean resultado;
        
        //formatador 
        DecimalFormat d = new DecimalFormat("#.##");
        
        if (n == 0){
            resultado = false;
        } else {
            resultado = true;
        }
        
        System.out.println("Valor: " + d.format(n));
        System.out.println(resultado);
    }
}
