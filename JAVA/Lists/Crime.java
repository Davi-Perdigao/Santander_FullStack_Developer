package moduloJava.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> respostasInterrogatorio = new ArrayList<String>();

        System.out.println("Telefonou para a vítima?");
        String s = scanner.nextLine();
        respostasInterrogatorio.add(s);

        System.out.println("Esteve no local do crime?");
        String s1 = scanner.nextLine();
        respostasInterrogatorio.add(s1);

        System.out.println("Mora perto da vítima?");
        String s2 = scanner.nextLine();
        respostasInterrogatorio.add(s2);

        System.out.println("Devia para a vítima?");
        String s3 = scanner.nextLine();
        respostasInterrogatorio.add(s3);


        System.out.println("Já trabalhou com a vítima?");
        String s4 = scanner.nextLine();
        respostasInterrogatorio.add(s4);

        int count = 0;
        Iterator<String> contador = respostasInterrogatorio.iterator();
        while (contador.hasNext()) {
            String next = contador.next();
            if (next.contains("s")) {
                count++;
            }
        }

        System.out.println("Resultado do interrogatorio:");
        switch (count) {
            case 0:
            case 1:
                System.out.println("Inocente");
                break;
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assasina");
                break;
            default:
                System.out.println("Respostas inválidas, responda novamente.");
                break;
        }
    }
}
