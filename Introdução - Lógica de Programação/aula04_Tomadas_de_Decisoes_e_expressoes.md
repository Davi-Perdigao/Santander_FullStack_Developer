# Aula 04 - Tomadas de decisão e expressões

_aula ministrada pelo **Professor Denilson Bonatti**_
## Expressões aritméticas

São expressões que utilizam operadores aritméticos e funões aritméticas, envolvendo constantes e variáveis

São as contas básicas. Somar, dividir, multiplicar, subtrair

### Exemplo
```
50 + 50
ou ainda
total + 50
```
Operação | Símbolo
:---: | :---:
Soma | +
Subtração | -
Multiplicação | *
Divisão | /
Potenciação | ^
Porcentagem | %

## Expressões Literais

São expressões com constantes e/ou variáveis, que tem como resultado valores literais. Iremos utilizar as expressões literais na atribuição de valor para uma variável ou constante, seja ela uma palavra, uma frase, um valor, uma equação, etc...

### Exemplos
```
nome = "José da Silva"
nome <- "José da silva"
media=(nota1+nota2+nota3+nota4)/4
```

## Operadores relacionais

São expressões compostas por outras expressões ou variáveis numéricas com operadores relacionais. As expressões relacionais retornam valores lógicos (verdadeiro/falso)

Símbolo | Nome do Operador | Exemplo | Significado
:---: | :---: | :---: | :---:
\>  |  Maior que | x > y | x é maior que y?
\>= | Maior ou igual a | x >= Y | x é maior ou igual a y?
< | Menor que | x < y | x é menor que y?
<= | Menor ou igual a | x <= y | x é menor ou igual a y?
== | Igualdade | x == y | x é igual a y?
!= | Diferente de | x != y | x é diferente de y?

## Importante!

>A quantidade de sinais de = tem funções diferentes.
>Se nós colocarmos  `a = b`, dizemos que *a recebe b*, ou seja, pedimos para a **variável a** receber o valor da **variável b**

>Agora, se colocarmos `a == b` estamos utilizando o o*perador relacional de igualdade*, e perguntando ao sistema se a **variável a** tem o mesmo valor que a >**variável b**

## Tomadas de decisão

Quando escrevemos programas, geralmente ocorre a necessidade de decdir o que fazer dependendo de alguma condição encontrada durante a execução.

Boa parte da programação é baseada nas tomadas de decisões, quando algo só acontece se uma condição for atendida ou não, **verdadeira** ou **falsa**.

### Exemplo

![Condição de venda via cartões](https://github.com/Davi-Perdigao/Santander_FullStack_Developer/blob/main/Introdu%C3%A7%C3%A3o%20-%20L%C3%B3gica%20de%20Programa%C3%A7%C3%A3o/Imagens/compras_cartao.png)

## Exercício

Declare 4 variáveis com os valores Janeiro, Fevereiro, Março e Abril. Para cada uma delas, você vai atribuir um valor de venda mensal de um vendedor fictício.
Após isso, vai verificar se a média das vendas foi superior que R$5000,00. Caso seja, parabenize o funcionário e diga que ele terá um abono de 10% no salário. Do contrário, avise que o abono será de apenas 3%.

## Resolução

![Resposta do exercício de Abono](https://github.com/Davi-Perdigao/Santander_FullStack_Developer/blob/main/Introdu%C3%A7%C3%A3o%20-%20L%C3%B3gica%20de%20Programa%C3%A7%C3%A3o/Imagens/fluxograma_vendas.png)
