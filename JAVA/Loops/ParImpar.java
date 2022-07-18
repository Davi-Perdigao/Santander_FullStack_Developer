package moduloJava.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int quantidadeNumeros;
        int count = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Digite a quantidade de números: ");
        quantidadeNumeros = scanner.nextInt();
        do {
            System.out.println("Número:");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                quantidadePares ++;
            } else {
                quantidadeImpares ++;
            }
            count++;
        } while (count < quantidadeNumeros);
            System.out.println("Quantidade de números pares: "+quantidadePares);
            System.out.println("Quantidade de números impares: "+quantidadeImpares);
    }
}
