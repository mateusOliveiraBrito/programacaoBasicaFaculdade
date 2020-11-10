package exercicio02;

public class Exercicio02 {

    public static void main(String[] args) {
        //declara as variáveis utilizadas
        int numero, unidade, dezena, centena, milhar;
        double x;

        //gera o numero aleatório no intervalo de 1000 e 9999
        numero = (int) (1000 + Math.random() * (9000));

        //imprime o valor de numero no console
        System.out.println("O número aleatório gerado foi: " + numero);
        System.out.println("");

        //subdivide o numero gerado
        unidade = numero % 10;
        numero = (int) numero / 10;
        dezena = numero % 10;
        numero = (int) numero / 10;
        centena = numero % 10;
        milhar = (int) numero / 10;

        //imprime os dcomponentes de numero no console
        System.out.println("Seus componentes são:"
                + "\nUnidade: " + unidade
                + "\nDezena: " + dezena
                + "\nCentena: " + centena
                + "\nMilhar: " + milhar);
        System.out.println("");

        //calcula o valor de x
        x = (unidade + ((int) Math.random() * (milhar * 10))) / (Math.sqrt(centena) + Math.pow(2, dezena));

        //imprime o valor de x no console
        System.out.println("O valor de x é: " + x);
    }

}
