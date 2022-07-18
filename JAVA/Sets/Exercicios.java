package moduloJava.sets;

import java.util.*;

public class Exercicios {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println(notas.contains(5d));
        System.out.println(Collections.min(notas));
        System.out.println(Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma = soma + next;
        }
        System.out.println("Media: " + soma / notas.size());

        notas.remove(0.0);
        System.out.println(notas.toString());

        System.out.println("__________________");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7.0) {
                iterator1.remove();
            }
        }
        System.out.println(notas);


    }

}
