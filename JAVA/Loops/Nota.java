package moduloJava.loops;

import java.util.Scanner;

/*Faça um programa que peça notas, entre zero e dez. Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.*/
public class Nota {
    public static void darNota(){
        Scanner scanner = new Scanner(System.in);
        double nota;
        System.out.println("Digite aqui sua nota:");
        nota = scanner.nextDouble();

            while(nota<0 || nota > 10){
                System.out.println("Valor inserido inválido, digite um novo valor:");
                scanner.nextDouble();

            }
        }
    public static void main(String[] args) {
        darNota();
    }
}
