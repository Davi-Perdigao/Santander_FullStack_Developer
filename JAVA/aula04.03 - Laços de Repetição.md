# Laços de Repetição

## `for`

Podemos criar uma estrutura de repetição utilizando o comando `for`. Ele serve para analizarmos uma variável dentro de um intervalo de valores, por exemplo.

```
for (int i = 0; i <= 10; i = i + 1) {
    System.out.println("I=" + i);
}
```

Aqui nós criamos uma variável `i` que vai iniciar com o valor 0 (i = 0), definimos que vamos continuar repetindo até que ela seja menor ou igual a 10 (i <= 10) e em seguida dissemos que a cada repetição, a variável `i` vai aumentar seu valor em 1 (1 = i + 1).

## `While`

O `while` é um comando que vai executar _enquanto_ algo for verdadeiro. Podemos realizar ele de duas formas:

```
while (x < 1) {
    System.out.println("Dentro do while...");
    x++;
}
```
Com o `while`, ele vai testar a condição primeiro e depois executar o que está dentro do código.

```
do {
    System.out.println("Dentro do do/while...");
} while (y++ < 1);
```
Já com o `do while` primeiro ele executa o código, e só então testa a condição.