package moduloJava.sets;

import java.util.*;

public class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer duracaoDoEpisodio;

    public Serie(String nome, String genero, Integer duracaoDoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.duracaoDoEpisodio = duracaoDoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getDuracaoDoEpisodio() {
        return duracaoDoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", duracaoDoEpisodio=" + duracaoDoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && duracaoDoEpisodio.equals(serie.duracaoDoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, duracaoDoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        return Integer.compare(this.getDuracaoDoEpisodio(), serie.duracaoDoEpisodio);
    }

    public static void main(String[] args) {
        System.out.println("Ordem Aleatória:");
        Set<Serie> series = new HashSet<>() {{
            add(new Serie("GOT", "fantasia", 60));
            add(new Serie("Brooklyn Nine Nine", "comédia", 22));
            add(new Serie("Stranger Things", "ficção", 85));
        }};
        for (Serie serie : series) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracaoDoEpisodio());
        }

        System.out.println("____________________________");
        System.out.println("Ordem de inserção:");
        Set<Serie> series1 = new LinkedHashSet<>() {{
            add(new Serie("GOT", "fantasia", 60));
            add(new Serie("Brooklyn Nine Nine", "comédia", 22));
            add(new Serie("Stranger Things", "ficção", 85));
        }};
        for (Serie serie : series1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracaoDoEpisodio());
        }

        System.out.println("____________________________");
        System.out.println("Ordem natural:");
        Set<Serie> series2 = new TreeSet<>(series1);
        for (Serie serie : series2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracaoDoEpisodio());
        }

        System.out.println("____________________________");
        System.out.println("Ordem de desempate:");
        Set<Serie> series3 = new TreeSet<>(new ComparatorNomeGeneroDuracao());
        series3.addAll(series);
        for (Serie serie : series3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getDuracaoDoEpisodio());
        }
    }

}

class ComparatorNomeGeneroDuracao implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareToIgnoreCase(s2.getNome());
        if (nome != 0) {
            return nome;
        }
        int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
        if (genero != 0) {
            return genero;
        }
        return Integer.compare(s1.getDuracaoDoEpisodio(), s2.getDuracaoDoEpisodio());
    }
}