package moduloJava.projetobanco;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato da Conta Corrente ***");
        imprimirDadosConta();
    }
}
