package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;
        int cont = 3;
        String resultado = "";
        
        System.out.print("Informe um número maior que 3: ");
        int n = s.nextInt();
        System.out.println();
        
        if (n >= 3){
            
            while (cont <= n){
                
                if (cont == 3){
                    resultado = primeiro + ", " + segundo + ", ";
                }
                
                proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
                
                if ((cont) < n){
                    resultado += proximo + ", ";
                } else {
                    resultado += proximo + " ";
                }
                cont++;
            }
            
            System.out.println("SEQUÊNCIA DE FIBONACCI:");
            System.out.print(resultado);
        } else {
            System.out.println("Número informado inválido!");
        }
    }
}
