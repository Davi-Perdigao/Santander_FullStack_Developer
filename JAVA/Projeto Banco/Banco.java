package moduloJava.projetobanco;

import moduloJava.projetobanco.Cliente;
import moduloJava.projetobanco.Conta;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    @Override
    public String toString() {
        return "Banco{" +
                "contas=" + contas +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public Banco() {
    }

    public void listarClientes() {

        this.contas.stream()
                .map(Conta::getCliente)
                .distinct()
                .map(Cliente::getNome)
                .forEach(System.out::println);
    }
}
