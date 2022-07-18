package moduloJava.metodos;

public class Funcionario {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Estefany");
        Funcionario vendedor = new Vendedor("Bruna");
        Funcionario faxineiro = new Faxineiro("Lucia");
    }
}

