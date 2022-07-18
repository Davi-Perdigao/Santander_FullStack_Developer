package moduloJava.operadores;

import static java.lang.System.*;

public class Mes {
    public int numeroMes;

    public static void definirMes(int numeroMes) {
        if (numeroMes == 1) {
            out.println("Janeiro");
        } else if (numeroMes == 2) {
            out.println("Fevereiro");
        } else if (numeroMes == 3) {
            out.println("Março");
        } else if (numeroMes == 4) {
            out.println("Abril");
        } else if (numeroMes == 5) {
            out.println("Maio");
        } else if (numeroMes == 6) {
            out.println("Junho");
        } else if (numeroMes == 7) {
            out.println("Julho");
        } else if (numeroMes == 8) {
            out.println("Agosto");
        } else if (numeroMes == 9) {
            out.println("Setembro");
        } else if (numeroMes == 10) {
            out.println("Outubro");
        } else if (numeroMes == 11) {
            out.println("Novembro");
        } else if (numeroMes == 12) {
            out.println("Dezembro");
        }
    }

    public static void definirFerias(int numeroMes){
        if (numeroMes == 1 || numeroMes == 7 || numeroMes == 12){
            out.println("Férias");
        } else {
            out.println("Trabalhando");
        }
    }
    public static void main(String[] args) {
        Mes.definirMes(12);
        Mes.definirFerias(5);
    }
}
