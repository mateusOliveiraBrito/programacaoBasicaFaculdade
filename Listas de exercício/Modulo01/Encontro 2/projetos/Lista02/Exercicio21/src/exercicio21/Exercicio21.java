package exercicio21;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        int menor;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1 = s.nextInt();
        System.out.print("Digite um numero: ");
        int n2 = s.nextInt();
        System.out.print("Digite um numero: ");
        int n3 = s.nextInt();
        
        if (n1 < n2 && n1 < n3){
            menor = n1;
        } else if (n2 < n1 && n2 < n3){
            menor = n2;
        } else {
            menor = n3;
        }
        
        System.out.println("Menor: " + menor);
    }
}
