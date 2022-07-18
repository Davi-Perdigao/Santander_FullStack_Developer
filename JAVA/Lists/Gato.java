package moduloJava.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gato implements Comparable<Gato> {

    public String nome;
    public Integer idade;
    public String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return gato.nome.compareToIgnoreCase(gato.nome);
    }

    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>() {{
            add(new Gato("jon", 18, "preto"));
            add(new Gato("simba", 6, "amarelo"));
            add(new Gato("jon", 12, "tigrado"));
        }};
        System.out.println(gatos);

        Collections.sort(gatos);
        System.out.println(gatos);


        System.out.println("Ordenaçao por idade:");
        Collections.sort(gatos, new ComparatorIdade());
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("Ordenação por cor:");
        Collections.sort(gatos, new ComparatorCor());
        System.out.println(gatos);
    }
}

class ComparatorIdade implements java.util.Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.idade, gato2.idade);
    }
    }


 class ComparatorCor implements java.util.Comparator<Gato> {

     @Override
     public int compare(Gato gato1, Gato gato2) {
         return gato1.cor.compareToIgnoreCase(gato2.cor);
     }
 }