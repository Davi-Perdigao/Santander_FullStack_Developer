package moduloJava.metodos;

public class Carro extends Veiculo {
    private String cor;
    private String modelo;
    private double capacidadeTanque;

    public Carro(String cor, String modelo, double capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public void encherTanque(Carro carro, Combustivel combustivel) {
        double valorParaEncherTanque = combustivel.getValorCombustivel() * carro.getCapacidadeTanque();
        System.out.println("O valor para encher o tanque do " + modelo + " é: " + valorParaEncherTanque);
    }


    public static void main(String[] args) {
        Combustivel combustivel = new Combustivel(6.99);
        Carro carro1 = new Carro("azul", "Hb20", 50d);
        carro1.encherTanque(carro1, combustivel);

    }

}


