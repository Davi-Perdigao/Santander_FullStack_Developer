# Introdução a Condicionais

## `IF`

O `IF` é uma estrutura que analiza uma condição, e executa uma instrução caso ela seja verdadeira.

Repare no uso da palavra Verdadeira. Isso significa que a condição analizada deve retornar um valor booleano, como verdadeiro ou falso.

Juntamente com o `IF`, podemos utilizar o `ELSE`, que vai dizer ao código o que fazer caso a condição seja Falsa.

```
if (condicao) {
System.out.println("A condição é verdadeira");
} else {
System.out.println("A condição é falsa");
}
```

Caso a nossa condição conte apenas com o `if`, sem o uso do `else`, podemos escrever ela em uma linha única, de forma simplificada:

```
if (condicao)
    System.out.println("Uma única linha...");
```

Podems ainda utilizar o operador ternário, que é uma forma bem mais simplificada do `if else` para analizarmos uma expressão:

```
final var ternario = condicao ? "é verdadeira" : "é falsa";
```

O que está depois do sinal de = é a condição, o que vem depois do sinal ? é o resultado caso seja verdadeiro e o que vem depois de : é o resultado caso a condição seja falsa.

## Operadores

Os operadores são divididos em subcategorias:

### Igualdade

* **==** Igual a
* **!=** Não igual a
* **.equals()** Igual a (para comparar strings)
* **!.equals()** Não igual a (para comparar Strings)

Repare que o ponto de exclamação **!** inserido a direita da expressão serve para negar uma igualdade, ou seja, se a igualdade daria verdadeiro, ele vai gerar o resultado falso, e se fosse dar o resultado falso, ele vai inverter para verdadeiro

### Matemáticos

* **+** Adição
* **-** Subtração
* __*__ Multiplicação
* **/** Divisão
* **%** Resto da divisão

### Relacionais

Servem para estabelecer relações, comparações entre os números:

* **>** Maior que
* **>=** Maior ou igual que
* **<** Menor que
* **<=** Menor ou igual que

```
final var numero = 6;

if (numero > 20) {
    System.out.println("O número é maior que 20");
} else if (numero >= 10) {
    System.out.println("O número é maior ou igual a 10");
} else if (numero <= 5) {
    System.out.println("O número é menor ou igual que 5");
} else {
    System.out.println("nenhuma da anteriores");
}
```

### Condicionais

* **&&** *E* Lógico
* **||** *OU* Lógico

Verificam de forma lógica um código, se ambas as condicões são verdadeiras OU se uma delas é.

### Incremento

* **++** Adiciona um a variável
* **--** Diminui um a variável

Se adicionarmos os sinais a esquerda da variável, primeiro faremos a operação e depois analizamos a variável.

Caso adicionemos o sinal a direita, primeiro vamos analizar a variável e ao final faremos a operação.