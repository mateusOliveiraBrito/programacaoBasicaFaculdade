package br.edu.ifgoiano.exercicio01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        //Objeto que permite que o usuário faça a inserção de dados através do teclado (leitura de dados no console)
        Scanner entrada = new Scanner(System.in);

        //declaração de variáveis
        double catAdjacente, catOposto, hipotenusa, seno, cosseno, tangente;

        //leitura de dados a partir do usuário do programa
        System.out.print("Informe o cateto adjacente: ");
        catAdjacente = entrada.nextDouble();
        System.out.print("Informe o cateto oposto: ");
        catOposto = entrada.nextDouble();

        //cálculo da hipotenusa
        hipotenusa = Math.sqrt(Math.pow(catAdjacente, 2) + Math.pow(catOposto, 2));

        //cálculo das razões trigonométricas
        seno = catOposto / hipotenusa;
        cosseno = catAdjacente / hipotenusa;
        tangente = catOposto / catAdjacente;

        //define formatação de apenas duas casas decimais para os valores calculados
        DecimalFormat formatador = new DecimalFormat("#.##");

        //imprime os cálculos realizados no console
        String resultado = "\nRESULTADOS:"
                + "\nHipotenusa: " + formatador.format(hipotenusa)
                + "\nSeno: " + formatador.format(seno)
                + "\nCosseno: " + formatador.format(cosseno)
                + "\nTangente: " + formatador.format(tangente);
        System.out.println(resultado);
    }
}
