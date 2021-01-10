package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe um número: ");
        double n = s.nextDouble();
        System.out.print("Informe um expoente: ");
        double exp = s.nextDouble();
        
        System.out.println("A potência " + n + " ^ " + exp + " é: " + calculePotencia(n, exp));
    }
    
    private static double calculePotencia(double n, double exp){
        double numero = 1;
        
        for (int i = 0; i < exp; i++){
            numero *= n;
        }
        return numero;
    }
}
