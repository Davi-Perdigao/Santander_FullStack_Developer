package moduloJava.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int soma = 0;
        int maior = 0;
        int count = 0;

        do {
            System.out.println("Número:");
            num = scanner.nextInt();
            soma = soma + num;
            if (num > maior) {
                maior = num;
            }
            count ++;
        }
        while (count < 5);
            System.out.println("O maior número é " + maior);
            System.out.println("A média dos valores é " + soma / 5);
        }
    }
