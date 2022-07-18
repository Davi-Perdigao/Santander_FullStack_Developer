/*
Todos os habitantes do Mundo Mágico estão super animados com a abertura do Dragão Berrador World, 
o mais novo parque de diversões do universo bruxo. 

Infelizmente foram impostas algumas restrições no momento da homologação do brinquedo pelo Ministério Bruxo. 
Por questões de segurança, há uma altura mínima e uma altura máxima que as pessoam devem ter para poder passear na montanha-russa.

Para o dia da inauguração do parque, todos os convidados realizaram um pré-cadastro no qual indicaram sua altura. 
Para reduzir filas e otimizar a operação do parque no primeiro dia, você foi contratado pela gerência do Dragão Berrador World 
para fazer um programa que, dado o número de visitantes, altura mínima, altura máxima e as alturas de todos os visitantes, calcule 
quantas pessoas poderão andar na montanha-russa. 
*/

import java.io.IOException;
import java.util.Scanner;

public class dragaoBerradorWorld {
    public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int numberVisitors = input.nextInt();
			int minheight = input.nextInt();
			int maxheight = input.nextInt();
			int count = 0;

			for (int i = 0; i < numberVisitors; i++) {
				int nextEight = input.nextInt();
				if (nextEight >= minheight && nextEight <= maxheight) count++;
			}

			System.out.println(count);
		}
	}
}