package moduloJava.metodos;

public class Quadrilateros {
    public static void calcularArea(double largura, double altura) {
        double area = largura * altura;
        System.out.println(area);
    }

    public static void calcularArea(double baseMaior, double baseMenor, double altura) {
        double area = (baseMaior + baseMenor) * altura / 2;
        System.out.println(area);
    }

    public static void main(String[] args) {
        calcularArea(5,10,10);
    }
}
