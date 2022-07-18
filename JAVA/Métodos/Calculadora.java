package moduloJava.metodos;
public class Calculadora {

    public static void soma(double n1, double n2) {
        double resultado = n1 + n2;
        System.out.println("A soma é " +resultado+".");
    }
    public static void subtracao(double n1, double n2){
        double resultado = n1 - n2;
        System.out.println("A subtração é "+resultado+".");
    }
    public static void multiplicacao(double n1, double n2){
        double resultado = n1*n2;
        System.out.println("A multiplicacao é "+resultado+".");
    }
    public static void divisao(double n1, double n2){
        double resultado = n1/n2;
        System.out.println("A divisao é "+resultado+".");
    }
    public static void main(String[] args) {
Calculadora.soma(1,3);
    }
}


