package moduloJava.operadores;

public class Semana {
    public String diaSemana;

    public static void definirDia(String diaSemana){
        switch (diaSemana){
            case "Segunda":
                System.out.println(1);
                break;
            case "Terça":
                System.out.println(2);
                break;
            case "Quarta":
                System.out.println(3);
                break;
            case "Quinta":
                System.out.println(4);
                break;
            case "Sexta":
                System.out.println(5);
                break;
            case "Sábado":
                System.out.println(6);
                break;
            case "Domingo":
                System.out.println(7);
                break;
            default:
                System.out.println("Formato inválido");
        }
    }

    public static void main(String[] args) {
        Semana.definirDia("Segunda");
    }
}

