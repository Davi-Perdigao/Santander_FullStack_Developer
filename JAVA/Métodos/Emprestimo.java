package moduloJava.metodos;

public class Emprestimo {
    public static void calcularEmprestimo(double valorEmprestado, int numeroParcelas){
        if (numeroParcelas >= 2 && numeroParcelas <= 10) {
            double valorFinal = valorEmprestado + (valorEmprestado* 0.2);
            System.out.println(valorFinal);
        } if (numeroParcelas >10){
            double valorFinal = valorEmprestado +(valorEmprestado * 0.5);
            System.out.println(valorFinal);
        }
    }

    public static void main(String[] args) {
        calcularEmprestimo(1000, 5);
        calcularEmprestimo(1000,11 );
    }
}
