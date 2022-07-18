package moduloJava.sets;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
public class Arcoiris implements Comparable {
    private String cor;

    public Arcoiris(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arcoiris arcoiris = (Arcoiris) o;
        return cor.equals(arcoiris.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor);
    }

    @Override
    public String toString() {
        return "Arcoiris{" +
                "cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args) {
        Set<String> coresDoArcoiris = new HashSet<>();
        coresDoArcoiris.add("amarelo");
        coresDoArcoiris.add("violeta");
        coresDoArcoiris.add("anil");
        coresDoArcoiris.add("vermelho");
        coresDoArcoiris.add("laranja");
        coresDoArcoiris.add("azul");
        coresDoArcoiris.add("verde");

        for (String cor :
                coresDoArcoiris) {
            System.out.println(cor);
        }

        System.out.println("Quantidade de cores: " + coresDoArcoiris.size());

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> coresDoArcoIris3 = new TreeSet<>(coresDoArcoiris);
        System.out.println(coresDoArcoIris3);

        System.out.println("Ordem reversa:");
        Set<String> coresdDoArcoIris4 = new LinkedHashSet<>(Arrays.asList("violeta", "vermelho", "amarelo", "azul", "anil", "verde", "laranja"));
        List coresDoArcoIrisEmLista = new ArrayList<>(coresdDoArcoIris4);
        Collections.reverse(coresDoArcoIrisEmLista);
        System.out.println(coresDoArcoIrisEmLista);


        System.out.println("Todas as Cores com V:");
        for (String cor : coresDoArcoiris) {
            if (cor.startsWith("v")) {
                System.out.println(cor);
            }
        }
//na resolução foi feito com iterator
        System.out.println("Removendo cores com V");
        for (String cor : coresDoArcoiris) {
            if (cor.startsWith("v")) {
                coresDoArcoiris.remove(cor);
            }
            System.out.println(coresDoArcoiris);
        }
// nao rodou pela exceção acima
        System.out.println("Limpando o conjunto:");
        coresDoArcoiris.clear();
        System.out.println("Verificando se esta limpo:");
        coresDoArcoiris.isEmpty();
    }
}