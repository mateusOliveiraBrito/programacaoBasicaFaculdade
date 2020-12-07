package exercicio51;

import java.util.Scanner;

class Registro {

    long codigo = 0;
    String nome = "";
    int periodo = 0;

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Período: " + periodo;
    }
}

public class Exercicio51 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Registro[] registros = new Registro[3];

        for (int i = 0; i < 3; i++) {
            Registro r = new Registro();
            System.out.print("Informe o código da " + (i + 1) + "° disciplina: ");
            r.codigo = s.nextLong();

            System.out.print("Informe o nome da " + (i + 1) + "° disciplina: ");
            r.nome = s.next();

            System.out.print("Informe o período da " + (i + 1) + "° disciplina: ");
            r.periodo = s.nextInt();
            
            registros[i] = r;
            System.out.println("");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Registro - " + i + ": " + registros[i].toString());
        }
    }
}
