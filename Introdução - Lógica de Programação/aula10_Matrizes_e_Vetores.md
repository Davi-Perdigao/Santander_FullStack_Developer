# Aula 10 - Matrizes e Vetores

_aula ministrada pelo **Professor Denilson Bonatti**_

## Matriz

É uma coleção de variáveis de mesmo tipo, acessíveis com um único nome e armazenados contiguamente na memória.

Pense em uma matriz como uma tabela contendo várias variáveis, cada uma em um campo.

## Vetores

Os vetores, por sua vez, são matrizes de uma só dimensão.

Pense nos vetores como uma lista de variáveis, cada uma em um campo.

A individualização de cada variável de um vetor é feita através do uso de índices.

## Exemplo

```
programa
{

	funcao inicio()
	{
		cadeia frutas[4]
		inteiro contador = 0

		frutas[0] = "Maçã"
		frutas[1] = "Pera"
		frutas[2] = "Uva"
		frutas[3] = "Jaca"

		faca{
			escreva(frutas[contador] + "\n")
			contador++
		}enquanto (contador<=3)
	}
}
```

Primeiro de tudo, nós criamos o `vetor` frutas, que é do tipo `cadeia`(cadeia de caracteres, ou seja, frases, lembra?) e que tem 4 posições, ou seja, tem 4 `variáveis` dentro dele.

Após isso, nós colocamos um valor dentro de cada uma das 4 variáveis do nosso vetor. Importante ter noção de que, em programação, na maioria das vezes começamos a contar do número **0**, e não do **1**, por isso o vetor que tem 4 posições, na verdade tem as posições **0, 1, 2 e 3**, e não **1, 2, 3, e 4**, como poderíamos imaginar.

É legal perceber aqui que para exibir uma única variável, como a uva, por exemplo, escreveríamos apenas o comando `escreva(frutas[2])`. Aqui a gente utilizou a estrutura de repetição e substituiu o número dentro dos colchetes`[]` pela variável contador para podermos exibir todos os números, já que a nossa estrutura de repetição nos dá os valores de 0 a 3 para a variável contador. Elegante né? Melhor que ficar escrevendo os números de um em um!

---
Vamos ver agora um exemplo de matriz:
```
programa
{

	funcao inicio()
	{
		cadeia cesta[][]={{"Pera","100"},{"Jaca","200"},{"Maçã","900"},{"Uva","89"}}

		escreva("Produto: ")
		escreva(cesta[1][0])
		escreva(". Quantidade: ")
		escreva(cesta[1][1])
	}
}
```

Aqui, na declaração da matriz, temos um elemento interessante. Nós não declaramos a quantidade de linhas e nem de colunas dentro dos colchetes. Podemos declarar normalmente, mas o computador é capaz de ver os dados que colocamos dentro da matriz e definir, por si mesmo, qual a quantidade de linhas e de colunas.

Para colocarmos os valores dentro da matriz, novamente vamos imaginar ela como uma tabela. Ao colocarmos os valores, vamos abrir e fechar chaves`{}` uma vez. Tudo o que estiver dentro dessa grande chave, vai ser entendido como se estivesse dentro da tabela. Então, imagine essa chave como sendo a tabela.

Após isso, temos que inserir nossas linhas na tabela, certo? Cada linha, vai ser sinalizada como uma nova chave que vai dentro da chave maior da tabela. No nosso exemplo, temos uma chave grande, com 4 outras chaves dentro, uma para cada linha. Dessa forma, a nossa tabela terá 4 linhas. Mas e os valores?

Os valores vão ser colocados dentro de aspas`""`. Tudo o que estiver dentro das aspas, será um valor a ser colocado em um campo. O primeiro valor de uma linha, vai na primeira coluna desta linha. O segundo valor, na segunda linha e assim por diante!

Vale lembrar ainda que cada valor deve ser separado do outro por uma vírgula `,` e cada linha deve ser separada da outra por uma vírgula também.

Pode parecer complexo de início, mas se pegarmos o comando `cadeia cesta[][]={{"Pera","100"},{"Jaca","200"},{"Maçã","900"},{"Uva","89"}}` do nosso exemplo e transformarmos em uma tabela utilizando o que foi explicado logo acima, podemos visualizar uma tabela assim:

Tabela | 0 | 1
:---: | :---: | :---:
0 | Pera | 100
1 | Jaca | 200
2 | Maçã | 900
3 | Uva | 89

Visualizando desse jeito, fica fácil pedirmos um valor de um campo específico. Se quisermos pegar as informaões da segunda linha (que é a linha de valor 1, lembra que começamos a contar do 0?), basta pedirmos para que o computador escreva o que temos na linha 1 e coluna 0 e depois que escreva o que temos na linha 1 e coluna 1. *Jaca, 200*. Viu só?

E se quisermos exibir todos os itens? Aí é só fazer o uso da nossa amiga, a função `faca`:

```
faca{
    escreva("Produto: " + cesta[contador][0] + " Quantidade: " + cesta [contador][1] + "\n")
    contador++
}enquanto(contador<=3)
```

## Exercício

Crie uma matris para armazenar e exibir as seguintes informações:

Nome | Cidade | Telefone
:---: | :---: | :---:
João | São Paulo | (11) 9999-5241
Maria | Ribeirão Preto | (16) 9999-8596
Ana | Manaus | (92) 9999-8574

Após isso, exiba todas as informações dessa matriz.

## Resolução

```
programa
{

	funcao inicio()
	{
		cadeia pessoas[][] = {{"João", "São Paulo", "(11) 9999-5241"},{"Maria","Ribeirão Preto", "(16) 9999-8596"},{"Ana","Manaus","(92) 9999-8574"}}
	}
}
```

```
programa
{

	funcao inicio()
	{
		cadeia pessoas[][] = {{"João", "São Paulo", "(11) 9999-5241"},{"Maria","Ribeirão Preto", "(16) 9999-8596"},{"Ana","Manaus","(92) 9999-8574"}}
		inteiro contador = 0

		faca{
			escreva("Nome: " + pessoas[contador][0] + "; Cidade: " + pessoas[contador][1] + "; Telefone: " + pessoas[contador][2]+ "\n")
			contador++
		}enquanto(contador<3)
	}
}
```