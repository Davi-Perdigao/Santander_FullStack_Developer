# Convenções de Nomes

## Conceito de Camel Case

O Camel Case é um conceito de nomeação de Classes, Métodos, Variáveis, Objetos e demais itens detro da programação.

Ele recebe esse nome justamente por se assemelhar as costas de um camelo, com a relação de letras maiúsculas e minúsculas conforme as corcóvas do camelo também se elevam das suas costas.

## Nomes de Classes

Nomes de classes sempre se iniciam com letra maiúscula:

`class Caneta`

Da mesma forma, se o nome for composto, cada primeira letra de cada palavra do nome deve ser também em maiúscula:

`class CanetaBicDeCorPreta`

## Nomes de Métodos

Os nomes de métodos sempre vão se iniciar com letra minúscula:

`private static boolean destampar()`

Caso o nome seja composto, daí sim cada nova palavra nele deve ter sua primeira letra em maiúscula, mas a primeira letra da palavra se manterá em minúscula:

`private static boolean destamparCanetaBicPreta()`

Vale observar também que sempre que nos referimos ao método, colocamos os parênteses no final, pois existem métodos que recebem parâmetros de entrada, e esses serão colocados dentro destes parênteses. Caso não necessite de parâmetros, o método não terá nada dentro, mas ainda sim adicionamos eles.

Além disso, não colocamos caracteres especiais, como por exemplo  ` &, _, *`

## Nomes de variáveis

Os nomes de variáveis também se iniciam em minúsculo, mas devem ser o mais suscintos possíveis:

`final var cor = preta;`

`final var marca =Bic;`
