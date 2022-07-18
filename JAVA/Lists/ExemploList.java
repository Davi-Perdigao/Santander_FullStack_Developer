package moduloJava.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List <Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(75d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3d);
        notas.add(6d);
        System.out.println(notas);

        System.out.println(notas.indexOf(75d));

        notas.add(4, 8.0);
        System.out.println(notas);

        notas.set(notas.indexOf(8.5d), 10.0);
        System.out.println(notas);

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);


        List<List<Double>> notas2 = new LinkedList<>();
        notas2.add(notas);
        System.out.println(notas2);
    }


}
