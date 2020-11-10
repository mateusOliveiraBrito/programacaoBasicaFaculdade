package exercicio09;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        //variaveis
        int data;
        String dia, mes, ano;

        //leitura
        Scanner s = new Scanner(System.in);
        System.out.print("Informe uma data no formato (DDMMAA): ");
        data = s.nextInt();
        System.out.println("");

        //processa os dados inseridos
        dia = String.valueOf(data).substring(0, 2);
        mes = String.valueOf(data).substring(2, 4);
        ano = String.valueOf(data).substring(4, 6);

        System.out.println("Data no formato DDMMAA: " + dia + mes + ano);
        System.out.println("Data no formato AAMMDD: " + ano + mes + dia);
    }
}
