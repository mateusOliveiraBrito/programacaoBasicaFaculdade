package exercicio04;

public class Exercicio04 {

    public static void main(String[] args) {
        int inicio = 100;
        int limite = 200;
        long soma = 0;

        while (inicio <= limite) {
            System.out.println(inicio);
            soma += inicio;
            inicio++;
        }

        System.out.println("SOMA: " + soma);
    }
}
