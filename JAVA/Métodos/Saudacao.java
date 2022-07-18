package moduloJava.metodos;

public class Saudacao {
    public static void mensagem(int hora) {
        switch (hora) {
            case 0, 1, 2, 3, 4, 18, 19, 20, 21, 22, 23 -> System.out.println("boa noite!");
            case 5, 6, 7, 8, 9, 10, 11, 12 -> System.out.println("bom dia!");
            case 13, 14, 15, 16, 17 -> System.out.println("boa tarde ");
            default -> System.out.println("hora inválida");
        }
    }

    public static void main(String[] args) {
        Saudacao.mensagem(11);
        Saudacao.mensagem(60);
    }
}
