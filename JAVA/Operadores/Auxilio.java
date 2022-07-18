package moduloJava.operadores;

public class Auxilio {
    private static double salarioAlto;
    public double salarioMensal;
    public int quantidadeDependentes;
    public static double salarioBaixo;

    public static void calculoSalario(double salarioMensal, int quantidadeDependentes) {
        boolean salarioBaixo = salarioMensal < 5000;
        boolean muitoDependente = quantidadeDependentes >= 2;
        if (salarioBaixo && muitoDependente) {
            System.out.println("Recebera o auxilio");
        } else {
            System.out.println("Não apto para receber auxilio");
        }
    }

    public static void main(String[] args) {
        Auxilio.calculoSalario(2000, 3);
    }
}
