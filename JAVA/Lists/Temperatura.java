package moduloJava.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        int count = 0;
        while (true) {
            if (count == 6) break;

            System.out.print("Digite a temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("-----------------");
        System.out.println("Exibindo toda lista");
        System.out.println(temperaturas.toString());

        System.out.println("-----------------");
        System.out.println("Calculando média:");
        Double soma = 0d;
        Iterator<Double> iterator = temperaturas.iterator();
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma = soma + next;
        }
        Double media = soma / temperaturas.size();
        System.out.println(media);

        //Faltou exibir só as maiores que 7
        //Iniciou do mes por extenso + temperatura
        for (Double temp:temperaturas)
        {
            if (temp>media){
                int index = temperaturas.indexOf(temp);
                switch (index){
                    case 0:
                        System.out.println((index+1)+"Janeiro"+temp);
                }
            }
        }
    }
}
