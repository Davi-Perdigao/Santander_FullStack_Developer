# Aula 03 - Fluxograma e Variáveis

_aula ministrada pelo **Professor Denilson Bonatti**_
## O que é Fluxograma?

Fluxograma é uma ferramenta utilizada para representar graficamente o algoritmo, isto é, a sequência lógica e coerente do fluxo de dados.

Ele é um tipo de diagrama que pode ser entendido como uma representação esquemática de um processo. Podemos entendê-lo, na prática, como a documentação dos passos necessários para a execução de um processo qualquer.

Os blocos possuem formatos diversos, que são feitos para simbolizar um processo ou método específico. Não existe um padrão claro para o fluxograma, portanto é importante que você ofaça de forma clara e de fácil compreensão.

## Variável

Na programação, uma variável é um objeto (uma posição, frequentemente localizada na memória) capaz de reter e representar u valor ou expressão.

A variável é um espaço que será separado, alocado, na memória do computador, e que tem a função de armazenar dados e valores. Esses dados e valores podem ser obtidos tanto pelo usuário colocando um valor quanto pelo programa, que efetua uma operação e retorna pra gente uma resposta, armazenando ela na memória na forma de variável.

Durante o processo de execução do programa, a variável pode ir recebendo diferentes valores, que assumem o lugar do valor anterior, por isso seu nome.

## Declaração de variáveis

```
INÍCIO
    DECLARA nota1: numero
    DECLARA nota2: numero
    DECLARA nota3: numero
    DECLARA nota4: numero
    DECLARA media: numero
    LEIA(nota1)
    LEIA(nota2)
    LEIA(nota3)
    LEIA(nota4)
    media = (nota1+nota2+nota3+nota4)/5
    IMPRIMIR (media)
FIM
```

## Tipos de Variáveis

As variáveis e as constantes podem ser classificadas basicamente de quatro tipos: Numéricas, Caracteres, Alfanuméricas ou Lógicas

## Regras de Variáveis

As variáveis seguem algumas regras básicas de nomeação:

* Não utilizar espaço no nome
* Iniciar por letras, e não números
* Evitar ao máximo acentuação

## O que é uma constante

As constantes são valores imutáveis e não são alteradosdurante a vida útil do programa. Se comportam como as variáveis, porém o seu valor não pode ser alterado.

```
INICIO
    DECLARA pi=3,14
    DECLARA raio: numero
FIM
```
No exemplo acima, `pi` é uma `constante`, um valor que nunca irá mudar. Já o `raio` é um valor que será atribuído depois, e poderá sofrer alterações. Isso faz dele uma `Variável`

## Fluxograma na prática

Vamos acessar o site do [Flowgorithm](http://www.flowgorithm.org) e fazer o download do programa que utilizaremos para a construção dos nossos fluxogramas.

Além de nos permitir criar um fluxograma, o Flowgorithm ainda nos permite executar o código criado a partir dele!

## Exercício

Criar um fluxograma recebendo as quatro notas, exibir o total da soma e calcular a média

## Resolução

![solucaodaatividade](https://github.com/Davi-Perdigao/Santander_FullStack_Developer/blob/main/Introdu%C3%A7%C3%A3o%20-%20L%C3%B3gica%20de%20Programa%C3%A7%C3%A3o/Imagens/fluxograma_soma_medias.png)
