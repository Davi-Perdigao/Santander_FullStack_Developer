/*
Você tem em mãos dois cabos circulares de energia. O primeiro cabo tem raio R1 e o segundo raio R2. 
Você precisa comprar um conduite circular (veja a imagem abaixo que ilustra um conduite) de maneira a 
passar os dois cabos por dentro dele: 
Qual o menor raio do conduite que você deve comprar? Em outras palavras, dado dois círculos, 
qual o raio do menor círculo que possa englobar ambos os dois?
*/

import java.io.IOException;
import java.util.Scanner;

public class bobConduite {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();

    for (int i = 0; i < T; i++) {
      int R1 = scan.nextInt();
      int R2 = scan.nextInt();            ;
      System.out.println(R1 + R2);
    }
  }
}