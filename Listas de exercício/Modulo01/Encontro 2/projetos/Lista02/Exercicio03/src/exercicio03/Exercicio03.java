package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        int n;
        
        System.out.print("Informe o número de erros do processo: ");
        Scanner t = new Scanner(System.in);
        n = t.nextInt();
        
        if (n == 1){
            System.out.println(n + " erro detectado!");
        } else if (n > 1){
            System.out.println(n + " erros detectados!");
        }
    }
}
