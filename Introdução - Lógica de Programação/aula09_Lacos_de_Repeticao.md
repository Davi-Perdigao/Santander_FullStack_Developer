# Aula 09 - Laços de Repetição

_aula ministrada pelo **Professor Denilson Bonatti**_

## Laços de Repetição

Dentro da lógica de programação é uma estrutura que permite executar mais de uma vez o mesmo comando ou um conjunto de comandos, de acordo com uma condição ou com um contador

Vamos ao exemplo, para depois analisá-lo direitinho:

```
programa
{

	funcao inicio()
	{
		inteiro contador, limite, resultado
		contador = 0
		limite = 10

		faca{

			resultado = 9 * contador
			escreva("9 X " + contador + " = " + resultado + "\n")
			contador++ //é o mesmo que escrever contador = contador + 1, só que mais curto!

		}enquanto (contador <= limite)
	}
}

```

O começo do programa não é novidade pra gente, declaramos as 3 variáveis que vamos usar e definimos o valor de duas delas, uma onde o contador vai começar e outra qual o limite que o valor de contador vai receber.

Agora, a estrutura faca (que seria faça, mas devemos lembrar que o ç é um tipo de acentuação, e a gente evita acentos em programação) é composta dos seguintes elementos:

* `faca`: É o comando que vai abrir a nossa estrutura toda. Pense nele como uma tarefa com várias outras tarefas dentro. Tudo o que estiver dentro do `faca` vai ser executado pelo computador de novo e de novo `enquanto` a condição que colocamos não for atendida, isso é, `enquanto` ela for `falsa`
* `enquanto`: Aqui nós colocamos a condição que queremos que o computador teste. `Enquanto` a condição não for atendida, ela será `falsa`, e o computador vai voltar laaaa pro começo da tarefa `faca` e executará ela novamente, até chegar no `enquanto` novamente e refazer o teste, e então retornar outra vez lá para o `faça`. Quando a condição for atendida ela se tornara uma `verdade`, e então o computador entende que o trabalho dessa tarefa está pronto, e ele pode continuar para o resto do código, se houver, ou então finalizar e descansar, se esse for o final!

## Exercício

Nós fizemos a tabuada do 9, mas e se quisermos mudar? Do jeito que o código está agora, temos que mudar manualmente todas as vezes. Nada prático! Crie uma forma de fazer o código poder realizar qualquer tabuada que quisermos, esse é o desafio!

## Resolução

```
programa
{

	funcao inicio()
	{
		inteiro contador, limite, resultado, tabuada
		contador = 0
		limite = 10

		escreva("Digite a tabuada que quer consultar:")
		leia(tabuada)

		faca{

			resultado = tabuada * contador
			escreva(tabuada + " X " + contador + " = " + resultado + "\n")
			contador++ //é o mesmo que escrever contador = contador + 1, só que mais curto!

		}enquanto (contador <= limite)
	}
}
```