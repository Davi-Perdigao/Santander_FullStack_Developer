package moduloJava.map;

import java.util.*;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class Populacao {
    public static void main(String[] args) {
        Map<String, Integer> populacoes = new HashMap<>();
        populacoes.put("PE", 9616);
        populacoes.put("AL", 3351);
        populacoes.put("CE", 9187);
        populacoes.put("RN", 3534);
        System.out.println(populacoes);
        populacoes.put("RN", 3165);
        System.out.println(populacoes);
        System.out.println(populacoes.containsKey("PB"));
        populacoes.put("PB", 4039);
        System.out.println(populacoes);

        System.out.println("______________");
        Map<String, Integer> populacoes2 = new LinkedHashMap<>();
        populacoes2.put("PE", 9616);
        populacoes2.put("AL", 3351);
        populacoes2.put("CE", 9187);
        populacoes2.put("RN", 3534);
        populacoes2.put("PB", 4039);
        System.out.println(populacoes2);

        System.out.println("_______________");
        Map<String, Integer> populacoes3 = new TreeMap<>(populacoes2);
        System.out.println(populacoes3);

        System.out.println("_________MENOR e MAIOR POPULACAO__________");
        String estadoMenorPopulacao = "";
        String estadoMaiorPopulacao = "";
        Set<Map.Entry<String, Integer>> entries = populacoes.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(Collections.min(populacoes.values()))) {
                estadoMenorPopulacao = entry.getKey();
            }
            if (entry.getValue().equals(Collections.max(populacoes.values()))) {
                estadoMaiorPopulacao = entry.getKey();
            }
        }
        System.out.println(estadoMenorPopulacao + " - " + Collections.min(populacoes.values()));
        System.out.println(estadoMaiorPopulacao + " - " + Collections.max(populacoes.values()));
        
    }
}


