package moduloJava.exceptions;

import javax.swing.*;

public class Unchecked {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog(("Numerador:"));
        String b = JOptionPane.showInputDialog(("Denominador:"));
        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println(resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida, o denonimador não pode ser zero.");
        }
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
