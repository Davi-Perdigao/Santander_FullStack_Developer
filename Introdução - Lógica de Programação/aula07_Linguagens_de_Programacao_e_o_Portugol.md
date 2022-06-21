# Aula 07 - Linguagens de Programação

_aula ministrada pelo **Professor Denilson Bonatti**_

## O que são linguagens de programação?

Linguagem de Programação é uma linguagem escrita e formal que especifica um conjunto de instruções e regras usadas para gerar programas (software). Um software pode ser desenvolvido para rodar em um computador, dispositivo móvel ou em qualquer equipamento que permita sua execução.

A máquina não entende a nossa linguagem. O que é óbvio para nós, não é para ela. A linguagem de programação é a forma como "explicamos" para a máquina o que queremos que ela faça. Elas são divididas em:

* Alto nível: São linguagens cuja sintaxe se aproxima mais da nossa linguagem, e se distanciam da linguagem da máquina

* Baixo nível: É aquela que se aproxima mais da linguagem de máquina, que requerem o conhecimento direto da arquitetura da computação.

Elas ainda podem ser:

* Compiladas: São executadas diretamente pelo sistema operacional, apos ser traduzido por um processo chamado compilação

* Interpretadas: O código é executado por um programa de computador, que é chamado de compilador, e só depois é executado pelo computador

## Portugol Studio

O `Portugol` é uma _pseudolinguagem_, isso é, não é exatamente uma linguagem de programação, mas sim uma linguagem bem próxima a uma linguagem de programação, mas escrita de forma muito próxima ao português. Isso permite ao programador iniciante focar muito mais na resolução do problema do que na linguagem!

[Baixe aqui](https://github.com/UNIVALI-LITE/Portugol-Studio/releases) o programa Portugol Studio.

Após aberto, nós criamos um novo documento e temos uma tela com um início do programa. Vamos analisar:

```
programa
{

	funcao inicio()
	{
		escreva("Olá Mundo")
	}
}
```

Agora, se lembrarmos das escritas dos nossos pseudocódigos das primeiras aulas e dos nossos fluxogramas, tínhamos sempre o INICIO e o FIM, certo?
Aqui, toooodo o código vai ficar entre os sinais de chave `{}` que estão lá no **Início**, abaixo da palavra `programa` e lá no **Fim**, fechando o código. Percebeu como a estrutura se repete?
Além disso, o comando `funcao inicio()` é uma tarefa inicial do programa. O que colocarmos dentro dela, vai rodar assim que mandarmos o computador executar o código.

## Sintaxe

Sintaxe nada mais é do que a forma de se escrever, o padrão da linguagem de programação. O Portugol tem uma linguagem bem amistosa, pois lembra muito uma escrita comum em português, quase como se "conversássemos" com  máquina.
Lembra do exemplo das médias da nota que fizemos em fluxograma? Aqui está como ela fica em Portugol:

```
programa
{

	funcao inicio()
	{
		real nota1, nota2, nota3, nota4, media
		cadeia aluno

		escreva("Digite o nome do aluno:")
		leia(aluno)
		escreva("Digite a nota 1:")
		leia(nota1)
		escreva("Digite a nota 2:")
		leia(nota2)
		escreva("Digite a nota 3:")
		leia(nota3)
		escreva("Digite a nota 4:")
		leia(nota4)

		media = (nota1+nota2+nota3+nota4)/4

		escreva("A média do aluno " + aluno + " é " + media + ".")
	}
}
```
Se você perceber bem, temos aqui todos os elementos (`variáveis`), com todas as tarefas, seguindo uma ordem `lógica`.

No começo, declaramos as variáveis que vão receber as `notas` e a `média`. Elas são numéricas, e como podem ter números depois da vírgula, fazem parte do conjunto `real`.

Em seguida, a variável `aluno`, que é uma palavra. Uma palavra é composta por várias letras, por uma `cadeia` de letras. Entendeu?

Os comandos abaixo pedem para que computador `escreva` na tela a mensagem que digitamos lá dentro dos parênteses `()`, e depois que ele `leia` o conteúdo que o usuário passou para a variável que está dentro dos parênteses, para poder fazer a `definição` do seu valor.

Após esses processos, a gente vai fazer a `atribuição` do valor da média, com o cálculo que já aprendemos antes.

Por fim vamos mostrar o resultado na tela! Lembra que a concatenação era feita no fluxograma com o `&`? No Portugol, assim como em várias linguagens de programação, utilizamos o `+` para concatenar.

Viu só? Simples simples! É a mesma coisa que a gente fez antes, mas agora escrito em Português! Ops, em *Portugol*.

## Exercício

Vamos refazer o exercício das vendas de um vendedor. Calculando a soma das vendas dos meses de Janeiro, Fevereiro, Março e Abril e também a média de suas vendas.

## Resolução

```
programa
{

	funcao inicio()
	{
		real jan, fev, mar, abr, soma, media

		escreva("Insira o valor das vendas do mês de Janeiro:")
		leia(jan)
		escreva("Insira o valor das vendas do mês de Fevereiro:")
		leia(fev)
		escreva("Insira o valor das vendas do mês de Março:")
		leia(mar)
		escreva("Insira o valor das vendas do mês de Abril:")
		leia(abr)

		soma = jan+fev+mar+abr
		media = soma/4

		escreva("Você vendeu um total de R$" + soma +
		" nesse quadrimestre, mantendo uma média de R$" +
		media)
	}
}
```
