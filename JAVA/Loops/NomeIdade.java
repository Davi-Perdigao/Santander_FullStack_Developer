package moduloJava.loops;

import java.util.Scanner;
/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/

public class NomeIdade {
    public static void leituraDoNomeEIdade() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String nome;
            int idade;
            System.out.println("Insira o nome:");
            nome = scanner.next();

            if (nome.equals("0")) {
                System.out.println("Programa finalizado.");
                break;
            }
            System.out.println("Insira a idade:");
            idade = scanner.nextInt();


        }
    }

    public static void main(String[] args) {
        leituraDoNomeEIdade();
    }
}
