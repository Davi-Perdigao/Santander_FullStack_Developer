package moduloJava.map;

import java.util.*;

public class Exercicios {

    public static void main(String[] args) {
        //Formas de inicializar maps:
        //Map <String, Double> carros2 = Map.of("gol", 14.4, "uno",15.6,"mobi", 16.1,"hb20", 14.5,"kwid", 15.6);
        Map<String, Double> carros = new HashMap<>() {{
            //put serve para adicionar
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carros);

        //Substituir - não aceita valores iguais entao so usar o put de novo;
        carros.put("gol", 15.2);
        System.out.println(carros);

        //procurar chave
        System.out.println(carros.containsKey("tucson"));

        //procurar valor para chave;
        System.out.println(carros.get("uno"));

        //retornar todas chaves, retorna um set;
        System.out.println(carros.keySet());

        //retornar todos valores, retorna uma collection
        System.out.println(carros.values());

        //maior valor
        Double consumoMaisEficiente = Collections.max(carros.values());
        System.out.println(consumoMaisEficiente);
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String carroMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                carroMaisEficiente = entry.getKey();
                System.out.println("Modelo: " + carroMaisEficiente + " | Consumo: " + consumoMaisEficiente);
            }
        }

        //procurar menor valor
        Double consumoMenosEficiente = Collections.min(carros.values());
        Set<Map.Entry<String, Double>> entries1 = carros.entrySet();
        String carroMenosEficiente = "";
        for (Map.Entry<String, Double> entry : entries1) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                carroMenosEficiente = entry.getKey();
                System.out.println("Modelo: " + carroMenosEficiente + "| Consumo: " + consumoMenosEficiente);
            }
        }

        //soma dos valores
        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        //media dos valores
        double media = soma / carros.size();
        System.out.println(media);

        //remocao de chave por valor
        Iterator<Double> iterator1 = carros.values().iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next.equals(15.6)){
                iterator1.remove();
            }
        }
        System.out.println(carros);

        //exibindo na ordem que foi informado - LinkedHashMap
        Map <String, Double> carros2 = new LinkedHashMap<>();
        carros2.put("gol", 14.4);
        carros2.put("uno", 15.6);
        carros2.put("mobi", 16.1);
        carros2.put("hb20", 14.5);
        carros2.put("kwid", 15.6);
        System.out.println(carros2);

        //exibindo na ordem de chaves -- TreeMap
        Map<String, Double> carros3 = new TreeMap<>(carros2);
        System.out.println(carros3);

        //Apagar tudo
        carros3.clear();
        System.out.println(carros3.isEmpty());
    }
}
