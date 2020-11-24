package exercicio11;

import com.sun.javafx.binding.StringFormatter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        int n = 0;
        double pi = 0.0;
        DecimalFormat format = new DecimalFormat("#.###");

        Scanner s = new Scanner(System.in);
        System.out.print("Informe o grau de precisão do cálculo: ");
        n = s.nextInt();
        
        for (int k = 0; k <= n; k++){
            pi += Math.pow(-1, k) * (1.0 / ((2 * k) + 1));
            
            System.out.println("Para k=" + k + " : pi=" + format.format(pi));
        }
        
        pi *= 4;
        
        System.out.println("");
        System.out.println("O valor da expressão é: " + format.format(pi));
    }
}
