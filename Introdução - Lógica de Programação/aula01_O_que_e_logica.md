# Aula 01 - Entendendo o que é lógica

_aula ministrada pelo **Professor Denilson Bonatti**_

## O que é lógica de programação?

Programar não é saber escrever código, mas sim saber resolver problemas.

O programador deve saber analisar uma situação, um problema. Saber extrair as informações disponíveis, raciocinar, de forma lógica, as operações necessárias para se resolver o problema, e só então colocar a mão na massa, transformando essa solução imaginada em um código concreto.

Segundo o dicionário Aurélio:
>Lógica é a coerência de raciocínio, de ideias. Uma Sequência coerente, regular e necessária de acontecimentos, coisas.

Lógica de programação significa apenas contextualizar a lógica na programação de computadores, buscando a melhor sequência de ações para solucionar um problema.

Essa sequência de ações são o que conhecemos como Algoritmo, e vamos aprender mais sobre ele nas próximas aulas.

## Abstração

A abstração é a habilidade de concentrar nos aspectos essenciais de um contexto qualquer, ignorando características menos importantes ou acidentais.


## Exercício final

Crie um mapa mental para resolver um determinado problema, por exemplo, calcular a média aritmética de 4 notas, sabendo que as notas são as seguintes:

1. Nota 1: 5
2. Nota 2: 7
3. Nota 3: 10
4. Nota 4: 3

Após resolvido, faça um exercício de Abstração da sua resolução. É possível simplificar o método que você utilizou? É o mais eficiente?

---

### Respostas

Sabemos que a média é a soma de todos os valores de um intervalo, dividido pela quantidade de valores dentro deste intervalo.

```
Primeiro, vamos somar todos os valores
5 + 7 + 10 + 3 = 25

Depois, vamos dividir pela quantidade de valores
25 / 4 = 6,25

Dessa forma, chegamos na média de 6,25
```

Nota 1 | Nota 2 | Nota 3 | Nota 4 | Total de Notas | Soma das Notas | Média
:---: | :---: | :---: | :---: | :---: | :---: | :---:
5 | 7 | 10 | 3 | 4 | 25 | 6,25

Sendo assim, nós tivemos como informação 4 números, fizemos a soma deles, e depois a divisão por 4.

O pensamento está certo, o valor foi obtido. Mas, será que dá para simplificarmos mais a nossa forma de resolver o problema? Eliminar informações em excesso? Em outras palavras, será que dá para **_Abstrair_** ainda mais nossa solução?

Podemos sim! Nós não precisamos calcular o valor da soma de forma separada e só depois dividir pela quantidade de valores. Podemos utilizar uma única fórmula que vai fazer todo o trabalho e nos retornar a média, que é o nosso objetivo.

```
Vamos somar todos os valores e já dividir pela quantidade total deles, assim:
(5 + 7 + 10 + 3) / 4 = 6,25

Dessa forma, também chegamos na média de 6,25
```

Nota 1 | Nota 2 | Nota 3 | Nota 4 | Média
:---: | :---: | :---: | :---: | :---:
5 | 7 | 10 | 3 | 6,25

A abstração nos permitiu resolvermos o problema de forma que conseguimos deixar apenas as informações relevantes disponíveis, e nos fazendo trabalhar apenas com as etapas necessárias para chegarmos a resposta que presisávamos, nada mais.