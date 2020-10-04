package exercicio16;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        //leitura de dados
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o dia de nascimento: ");
        int dia = s.nextInt();
        System.out.print("Informe o mês de nascimento: ");
        int mes = s.nextInt();;
        System.out.print("Informe o ano de nascimento: ");
        int ano = s.nextInt();

        //pega data atual
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String dataAtual = formatador.format(data);

        int diaAtual = Integer.parseInt(dataAtual.split("/")[0]);
        int mesAtual = Integer.parseInt(dataAtual.split("/")[1]);
        int anoAtual = Integer.parseInt(dataAtual.split("/")[2]);

        int idadeAnos = anoAtual - ano - 1;
        long idadeEmDias = ((12 - mes) * 30) + (30 - dia + 1 + diaAtual);
        idadeEmDias += (idadeAnos * 360) + ((mesAtual - 1) * 30);

        System.out.println("Sua idade em dias é: " + idadeEmDias);
    }
}
