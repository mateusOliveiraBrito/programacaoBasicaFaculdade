package exercicio10;

public class Exercicio10 {

    public static void main(String[] args) {
        int cont = 1;
        int fator = 1;
        int fatorSubMult = 0, contSubMult = 0, paraMultiplo = 0;

        do {
            if (cont % 2 == 0) {
                System.out.println("===TABUADA DO " + cont + "===");

                do {
                    System.out.println(cont + " + " + fator + " = " + (cont + fator));
                    fator++;
                } while (fator <= 10);
                fator = 1;

                System.out.println("");

                fatorSubMult = cont;
                do {
                    System.out.println(fatorSubMult + " - " + cont + " = " + (fatorSubMult - cont));
                    contSubMult++;
                    fatorSubMult++;
                } while (contSubMult <= 10);
                contSubMult = 0;

                System.out.println("");

                do {
                    System.out.println(cont + " * " + fator + " = " + (cont * fator));
                    fator++;
                } while (fator <= 10);
                fator = 1;

                System.out.println(" ");

                fatorSubMult = cont;
                paraMultiplo = cont;
                do {
                    System.out.println(fatorSubMult + " / " + cont + " = " + (fatorSubMult / cont));
                    contSubMult++;

                    if (fatorSubMult % paraMultiplo == 0) {
                        fatorSubMult += paraMultiplo;
                    }
                } while (contSubMult < 10);
                contSubMult = 0;
                System.out.println("");
            }
            cont++;
        } while (cont <= 10);
    }
}
