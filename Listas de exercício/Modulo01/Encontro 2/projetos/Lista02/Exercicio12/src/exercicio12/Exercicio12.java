package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        System.out.print("Informe um valor: ");
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();

        String resultado = "";

        if (n <= 10) {
            resultado = "F1";
        } else if (n > 10 && n <= 100) {
            resultado = "F2";
        } else if (n > 100) {
            resultado = "F3";
        }
        
        System.out.println(resultado);
    }
}
