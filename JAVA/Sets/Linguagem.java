package moduloJava.sets;
/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção ---> linked hashset
b) Ordem natural(nome); ---> treeset
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

import java.util.*;

public class Linguagem implements Comparable<Linguagem> {
    private String nome;
    private Integer anoCriação;
    private String IDE;

    public Linguagem(String nome, Integer anoCriação, String IDE) {
        this.nome = nome;
        this.anoCriação = anoCriação;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoCriação() {
        return anoCriação;
    }

    public String getIDE() {
        return IDE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linguagem linguagem = (Linguagem) o;
        return nome.equals(linguagem.nome) && anoCriação.equals(linguagem.anoCriação) && IDE.equals(linguagem.IDE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoCriação, IDE);
    }

    @Override
    public String toString() {
        return "Linguagem{" +
                "nome='" + nome + '\'' +
                ", anoCriação=" + anoCriação +
                ", IDE='" + IDE + '\'' +
                '}';
    }

    @Override
    public int compareTo(Linguagem linguagem) {
        return this.nome.compareToIgnoreCase(linguagem.nome);
    }

    public static void main(String[] args) {
        System.out.println("Exibindo em ordem de inserção:");
        Set<Linguagem> minhasLinguagens = new LinkedHashSet<>();
        minhasLinguagens.add(new Linguagem("moduloJava", 1991, "Visual Studio Code"));
        minhasLinguagens.add(new Linguagem("JavaScript", 1995, "IntelliJ"));
        minhasLinguagens.add(new Linguagem("Python", 1991, "Pycharm"));
        for (Linguagem linguagem : minhasLinguagens) {
            System.out.println(linguagem.getNome() + "-" + linguagem.getAnoCriação() + "-" + linguagem.getIDE());
        }

        System.out.println("---------------");
        System.out.println("Exibindo em ordem natural: ");
        Set<Linguagem> minhasLinguagens2 = new TreeSet<>(minhasLinguagens);
        for (Linguagem linguagem : minhasLinguagens2) {
            System.out.println(linguagem);
        }

        System.out.println("---------------");
        System.out.println("Exibindo em ordem de IDE: ");
        Set<Linguagem> minhasLinguagens3 = new TreeSet<Linguagem>(new ComparatorIDE());
        minhasLinguagens3.addAll(minhasLinguagens);
        for (Linguagem linguagem : minhasLinguagens3) {
            System.out.println(linguagem);
        }

        System.out.println("---------------");
        System.out.println("Exibindo em ordem de Ano de Criação e Nome: ");
        Set<Linguagem> minhasLinguagens4 = new TreeSet<Linguagem>(new ComparatorCriaçãoENome());
        minhasLinguagens4.addAll(minhasLinguagens);
        for (Linguagem linguagem : minhasLinguagens4) {
            System.out.println(linguagem);
        }

        System.out.println("---------------");
        System.out.println("Exibindo em ordem de Nome, Ano de Criação e IDE: ");
        Set<Linguagem> minhasLinguagens5 = new TreeSet<Linguagem>(new ComparatorNomeAnoIDE());
        minhasLinguagens5.addAll(minhasLinguagens);
        for (Linguagem linguagem : minhasLinguagens5) {
            System.out.println(linguagem);
        }
    }
}
    class ComparatorIDE implements Comparator<Linguagem> {
        @Override
        public int compare(Linguagem l1, Linguagem l2) {
            return l1.getIDE().compareToIgnoreCase(l2.getIDE());
        }
    }

    class ComparatorCriaçãoENome implements Comparator<Linguagem> {
        @Override
        public int compare(Linguagem l1, Linguagem l2) {
            int ano = l1.getAnoCriação().compareTo(l2.getAnoCriação());
            if (ano!=0) return ano;
            return l1.getNome().compareToIgnoreCase(l2.getNome());
        }
    }

class ComparatorNomeAnoIDE implements Comparator<Linguagem> {
    @Override
    public int compare(Linguagem l1, Linguagem l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if(nome!=0) return nome;
        int ano = l1.getAnoCriação().compareTo(l2.getAnoCriação());
        if (ano!=0) return ano;
        return l1.getIDE().compareToIgnoreCase(l2.getIDE());
    }
}

