package exercicio04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        //declara as variáveis 
        int votoDocCand, votoDocente, votoDisCand, votoDiscente;
        double votoCand;

        //formatador de decimais
        DecimalFormat formatador = new DecimalFormat("#.##");

        //entrada de dados
        Scanner d = new Scanner(System.in);
        System.out.print("Votos válidos do segmento docente ao candidato: ");
        votoDocCand = Integer.parseInt(d.next());
        System.out.print("Votos válidos dos docentes: ");
        votoDocente = Integer.parseInt(d.next());
        System.out.print("Votos válidos do segmento discente ao candidato: ");
        votoDisCand = Integer.parseInt(d.next());
        System.out.print("Votos válidos dos discentes: ");
        votoDiscente = Integer.parseInt(d.next());
        System.out.println("");
        
        //calculos
        votoCand = ((2.0 * votoDocCand) / (3.0 * votoDocente)) + ((1.0 * votoDisCand) / (3.0 * votoDiscente));

        //imprime dados no console
        System.out.println("Votos válidos obtidos pelo candidato é: " + formatador.format(votoCand));
    }

}
