package moduloJava.projetobanco;

import java.util.Objects;

public class Cliente {
    private String nome;
    ContaCorrente contaCorrente;
    ContaPoupanca contaPoupanca;

    public Cliente(String nome, ContaCorrente contaCorrente) {
        this.nome = nome;
        this.contaCorrente = contaCorrente;
    }

    public Cliente(String nome, ContaPoupanca contaPoupanca) {
        this.nome = nome;
        this.contaPoupanca = contaPoupanca;
    }

    public Cliente(String nome, ContaCorrente contaCorrente, ContaPoupanca contaPoupanca) {
        this.nome = nome;
        this.contaCorrente = contaCorrente;
        this.contaPoupanca = contaPoupanca;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome) && Objects.equals(contaCorrente, cliente.contaCorrente) && Objects.equals(contaPoupanca, cliente.contaPoupanca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, contaCorrente, contaPoupanca);
    }
}
