package moduloJava.map;

import java.util.*;

class Livro {
    private String autor;
    private int paginas;

    public Livro(String autor, int paginas) {
        this.autor = autor;
        this.paginas = paginas;
    }


    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return paginas == livro.paginas && autor.equals(livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autor, paginas);
    }

    @Override
    public String toString() {
        return "Livros{" +
                "autor='" + autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

public class Ordenacao {
    public static void main(String[] args) {
        //Ordem aleatoria
        Map<String, Livro> livrosFavoritos = new HashMap<>();
        livrosFavoritos.put("Uma breve historia de amor", new Livro("Stephen Hawing", 256));
        livrosFavoritos.put("O poder do hábito", new Livro("Charles Duigg", 408));
        livrosFavoritos.put("Lições para o século 21", new Livro("Yuval Noah Harari", 432));
        Set<Map.Entry<String, Livro>> entries = livrosFavoritos.entrySet();
        for (Map.Entry<String, Livro> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getAutor());
        }
        //ordem inserção
        Map<String, Livro> livrosFavoritos2 = new LinkedHashMap<>(livrosFavoritos);
        System.out.println(livrosFavoritos2);

        //ordem alfabetica de nome do livro
        Map<String, Livro> livrosFavoritos3 = new TreeMap<>(livrosFavoritos);
        System.out.println(livrosFavoritos3);


    }
}
