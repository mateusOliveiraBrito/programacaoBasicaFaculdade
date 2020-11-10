package exercicio08;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        //variaveis
        String data, dia, mes, ano, perfil = "";
        int primeiraEtapaSoma, segundaEtapaSoma, terceiraEtapaResto;

        //leitura de dados
        System.out.print("Informe sua data de nascimento no padrão (DD/MM/AA): ");
        Scanner s = new Scanner(System.in);
        data = s.next();
        System.out.println("");

        //fragmentando a data através do método split, que quebra a string onde houver o caractere informado no parâmetro
        dia = data.split("/")[0];
        mes = data.split("/")[1];
        ano = data.split("/")[2];

        //realiza a primeira etapa da verificação: a de soma entra (dia + mes) + ano
        int termo1 = Integer.parseInt(dia + mes);
        int termo2 = Integer.parseInt(ano);
        primeiraEtapaSoma = termo1 + termo2;

        /*realiza a segunda etapa da verificação: a de adição entre a fragmentação da soma obtida na etapa anterior
          a fragmentação ocorre através do método substring que quebra a string a partir de um determinado ponto de origem e de limite*/
        termo1 = Integer.parseInt(String.valueOf(primeiraEtapaSoma).substring(0, 2));
        termo2 = Integer.parseInt(String.valueOf(primeiraEtapaSoma).substring(2, 4));
        segundaEtapaSoma = termo1 + termo2;

        terceiraEtapaResto = segundaEtapaSoma % 5;

        if (terceiraEtapaResto == 0) {
            perfil = "Tímido";
        } else if (terceiraEtapaResto == 1) {
            perfil = "Sonhador";
        } else if (terceiraEtapaResto == 2) {
            perfil = "Paquerador";
        } else if (terceiraEtapaResto == 3) {
            perfil = "Atraente";
        } else if (terceiraEtapaResto == 4) {
            perfil = "Irresistível";
        }

        System.out.println("Com base na data de nascimento, seu perfil é: " + terceiraEtapaResto + " - " + perfil);
    }
}
