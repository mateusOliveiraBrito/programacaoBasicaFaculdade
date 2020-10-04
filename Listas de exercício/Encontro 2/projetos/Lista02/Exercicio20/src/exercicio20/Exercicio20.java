package exercicio20;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio20 {
    
    public static void main(String[] args) {
        double valorTotal = 0.0, totalServicos = 0.0;
        DecimalFormat f = new DecimalFormat("#.##");
        
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o número de diárias: ");
        int diarias = s.nextInt();
        
        valorTotal = 60 * diarias;
        
        if (diarias > 15) {
            totalServicos = 5.50 * diarias;
        } else if (diarias == 15) {
            totalServicos = 6.00 * diarias;
        } else if (diarias < 15) {
            totalServicos = 8.00 * diarias;
        }
        
        valorTotal += totalServicos;
        
        System.out.println("Total da Conta: R$" + f.format(valorTotal));
    }
}
