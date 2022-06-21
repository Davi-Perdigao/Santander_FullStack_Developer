# Aula 08 - Desvios Condicionais e Comentários

_aula ministrada pelo **Professor Denilson Bonatti**_

## Desvios Condicionais

### `SE`

É utilizada a palavra reservada `se`, a condição a ser testada entre parênteses e as instruções que devem ser executadas entre chaves caso o desvio seja `verdadeiro`.

Lembra do nosso exercício de médias? Vamos contar pro aluno que ele foi aprovado, caso a média seja maior ou igual a sete.

```
se(media>=7){
    escreva("\n" + "Parabéns!! Você foi aprovado!")
}
```

A condição `se` vai servir para criar esse bloco especial que será executado apenas **se** a **condição** dentro dos parênteses for verdadeira. **Senão**, o código vai ignorar ele e seguir adiante.

Ah, e perceba o comando `\n` colocado antes da frase. Ele é um comando especial que diz para o computador pular uma linha, criar uma **nova** linha. Por isso o **n**, entendeu?

### `SE-SENAO`

Agora vamos imaginar que se a condição for falsa, um outro conjunto de comandos deve ser executado.

Como no exemplo anterior, se a média for menor que sete, temos que dar a notícia não tão boa para o aluno. Vamos lá!

```
se(media>=7){
    escreva ("Parabéns, você foi aprovado!")
}
senao {
    escreva("Infelizmente você foi reprovado.")
}
```

Pronto, agora temos as duas situações. *Se a média for maior ou igual a sete, dê os parabéns e diga que o aluno foi aprovado, senão, diga que infelizmente ele foi reprovado.* Viu só? Programar é como dizer para o computador o que ele vai fazer, mas em uma língua que ele entenda!

## Comentários

Nosso cérebro não é como o computador, que lembra de tudo eternamente, com todas as informações armazenadas bonitinhas na caixola.

Vamos supor que você vai pegar um programa que escreveu láaaaaa atrás, como esses exemplos do começo da nossa jornada como programadores de sucesso. Ou então que você vai pegar um programa gigante que outra pessoa escreveu, você vai conseguir entender tudo perfeitamente bem só de ler? Ou seria legal se a pessoa deixasse uns comentários para te ajudar a decifrar para que as coisas servem?

Na programação, nós temos códigos especiais que nos permitem fazer comentários, que são linhas digitadas dentro do programa que não vão ser lidas pelo computador na hora de executar o código, é uma mensagem sua para o seu futuro ou então para a pessoa que vai pegar o código que você escreveu!

em Portugol, assim como em diversas linguagens de programação, os comentários podem ser feitos utilizando o comando `//`.

```
//verifica se a média é maior ou igual a sete
se(media>=7){
    escreva ("Parabéns, você foi aprovado!")
}
//caso a média seja menor que 7
senao {
    escreva("Infelizmente você foi reprovado.")
}
```

## Desvio Condicional `Caso`

Este comando é similar aos comandos se e senão, e reduz a complexidade na escolha de diversas opções. Apesar de suas similaridades com o se, ele possui algumas diferenças. Neste comando não é possivel o uso de operadores lógicos, ele apenas trabalha com valores definidos. Vamos a um exemplo prático.

```
programa
{
	funcao inicio()
	{
		escreva("1 - Abrir Netflix, 2 - Abrir Amazon Prime, 3 - Abrir HBO GO, 4 - Sair \n")
		inteiro menu = 0
		escreva("Digite sua opção: \n")
		leia(menu)

		escolha(menu){
			caso 1: //testa se valor é igual a 1
			escreva("Abrindo Netflix...")
			pare

			caso 2: //testa se valor é igual a 2
			escreva("Abrindo Amazon Prime...")
			pare

			caso 3: //testa se valor é igual a 3
			escreva("Abrindo HBO GO...")
			pare

			caso 4: //testa se valor é igual a 4
			escreva("Saindo...")
            pare

			caso contrario: //caso não seja qualquer outro valor
			escreva("Voce deve escolher entre as opções 1, 2  ou 3.")
		}
	}
}
```

Perceba que temos aqui pra estrutura `caso` várias palavras chave que são comandos dessa função:

* `escolha`: Serve para abrir o comando todo, e dar todas as opções, ou seja, serve para que o computador `escolha` o `caso` que corresponde ao valor da variável
* `caso`: Vai dizer ao computador o que fazer `caso` a variável tenha o valor igual ao valor que colocarmos logo em frente da palavra caso
* `caso contrario`: você pode colocar quantos casos quiser no seu comando, o usuário sempre vai dar um jeito de escrever um caso que não atende a nenhum deles! Para isso serve o caso contrario. Ele vai falar o que o computador deve fazer se nenhum dos casos for igual a variável
* `pare`: O `pare` é essencial por uma única questão: Se não colocarmos ele, o computador vai executar o caso que seja igual a variável e também toooodos os outros abaixo dele, seguindo a sequência que o computador costuma seguir nos nossos programas. O pare diz para o computador parar de procurar novos casos, pois ele já encontrou e já executou o que precisa, pode sair de tooooodo o comando `escolha` e partir pro resto do código