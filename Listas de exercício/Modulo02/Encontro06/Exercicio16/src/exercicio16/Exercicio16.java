package exercicio16;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int idade = 0, sexo = 0, contPessoas = 0, idadeMaior = 0, idadeMenor = 0, contSalario = 0;
        double salario = 0d, total = 0d, media = 0d;
        boolean primeiroLoop = true;

        for (;;) {
            System.out.print("Digite sua idade: ");
            idade = s.nextInt();

            if (idade < 0) {
                break;
            }

            if (primeiroLoop) {
                idadeMenor = idade;
                idadeMaior = idade;
                primeiroLoop = false;
            }

            if (idade > idadeMaior) {
                idadeMaior = idade;
            }

            if (idade < idadeMenor) {
                idadeMenor = idade;
            }

            System.out.print("Digite seu sexo (0:M e 1:F): ");
            sexo = s.nextInt();

            System.out.print("Digite seu salario: ");
            salario = s.nextDouble();
            System.out.println("");
            
            if (sexo == 1 && salario <= 100){
                contSalario++;
            }

            total += salario;
            contPessoas++;
        }

        media = total / contPessoas;

        System.out.println("");
        System.out.println("MÉDIA DO GRUPO: " + media);
        System.out.println("MENOR IDADE DO GRUPO: " + idadeMenor);
        System.out.println("MAIOR IDADE DO GRUPO: " + idadeMaior);
        System.out.println("QUANTIDADE DE MULHERES COM SALÁRIO ATÉ R$ 100,00: " + contSalario);

    }
}
