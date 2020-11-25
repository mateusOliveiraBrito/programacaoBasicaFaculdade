package exercicio17;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long maiorQ = 0;
        int raizQ = 0, raizQMaior = 0;

        System.out.print("Informe um número inteiro: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            raizQ = (int) Math.pow(i, 2);
            
            if (raizQ > raizQMaior){
                if (raizQ < n){
                    raizQMaior = raizQ;
                }
            }
        }
        System.out.println("Maior quadrado menor que " + n + " = " + raizQMaior);
    }
}
