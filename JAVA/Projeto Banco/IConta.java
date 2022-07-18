package moduloJava.projetobanco;

public interface IConta {
    void transferir(double valor, Conta contaDestino);

    void depositar(double valor);

    void sacar(double valor);

    void imprimirExtrato();
}
