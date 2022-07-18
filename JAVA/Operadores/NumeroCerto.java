package moduloJava.operadores;

public class NumeroCerto {
    public int i;

    public static void definirNumero(int i){
        switch (i){
            case 1:
            case 2:
            case 3:
                System.out.println("Numero Certo");
                break;
            case 4:
                System.out.println("Numero Errado");
            case 5:
                System.out.println("Talvez");
            default:
                System.out.println("Formato inválido");
        }
    }

    public static void main(String[] args) {
        NumeroCerto.definirNumero(7);
    }
}
