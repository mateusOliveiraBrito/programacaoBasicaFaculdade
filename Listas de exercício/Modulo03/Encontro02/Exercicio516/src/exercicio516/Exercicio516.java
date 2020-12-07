package exercicio516;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio516 {

    public static void main(String[] args) {
        //realiza a leitura das notas
        Scanner s = new Scanner(System.in);
        int contMedia = 0, contMenores = 0, contMaiores = 0, contIgual = 0;
        double media = 0d, somatorioMedia = 0d;
        DecimalFormat d = new DecimalFormat("#.##");

        System.out.print("Informe a quantidade de notas que serão inseridas: ");
        int n = s.nextInt();

        double[] notas = new double[n];
        double[] notasMenores = new double[0];
        double[] notasMaiores = new double[0];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite uma nota: ");
            notas[i] = s.nextDouble();
        }

        //calcula a média
        for (int i = 0; i < notas.length; i++) {
            somatorioMedia += notas[i];
            contMedia++;
        }
        media = somatorioMedia / contMedia;

        System.out.println("");
        System.out.println("A média das notas é: " + d.format(media));

        //calcula quantidade de notas maiores, menores e iguais a média
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < media) {
                contMenores++;
            }

            if (notas[i] == media) {
                contIgual++;
            }

            if (notas[i] > media) {
                contMaiores++;
            }
        }

        //verifica se quantidade != zero, instancia arrays, persiste notas em seus arrays correspondentes e imprime resultado
        System.out.println("");
        System.out.println("Quantidade de notas menores que a média: " + contMenores);
        if (contMenores != 0) {
            notasMenores = new double[contMenores];
            int controleMenor = 0;

            for (int i = 0; i < notas.length; i++) {
                if (notas[i] < media) {
                    notasMenores[controleMenor] = notas[i];
                    controleMenor++;
                }
            }

            for (int i = 0; i < notasMenores.length; i++) {
                System.out.println("Nota menor que a média: " + notasMenores[i]);
            }
        }

        System.out.println("");
        System.out.println("Quantidade de notas iguais a média: " + contIgual);

        System.out.println("");
        System.out.println("Quantidade de notas maiores que a média: " + contMaiores);
        if (contMaiores != 0) {
            notasMaiores = new double[contMaiores];
            int controleMaior = 0;

            for (int i = 0; i < notas.length; i++) {
                if (notas[i] > media) {
                    notasMaiores[controleMaior] = notas[i];
                    controleMaior++;
                }
            }

            for (int i = 0; i < notasMaiores.length; i++) {
                System.out.println("Nota maior que a média: " + notasMaiores[i]);
            }
        }
    }
}
