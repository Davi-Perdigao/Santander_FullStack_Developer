# Tipos primitivos, Wrappers, não primitivos e tipagem forte e estática

## Tipos

Os tipos são divididos em dois grandes grupos: Primitivos e não primitivos.

### Primitivos

Os tipos primitivos não aceitam receber o valor do tipo NULL e possuem valores padrões (default)

Data Type | Default (para os campos)
--- | ---
byte | 0
short | 0
int | 0
long | 0L
float | 0.0f
double | 0.0d
char | '\u000'
String (ou Objeto) | null
boolean | false

### Não primitivos

São os tipos:

String: Sequencia de caracteres, texto
Number: Classe maior que extende o Integer
Void: Classe vazia
Object: um objeto (aprenderemos mais adiante)
Qualquer outros objetos

Perceba que o Java trata como objetos qualquer outro tipo de variável que não seja do tipo Primitivo. Por isso elas são declaradas com letras maiúsculas, e isso só demosntra o quanto o Java é uma linguagem completamente focada em Programação Orientada a Objetos!

## Wrappers

São objetos que representam os tipos primitivos do Java.

Dentro do Java existem classes que representam cada um dos tipos primitivos. Em alguns casos seu uso é melhor do que o uso do tipo em si, como pro exemplo: Inserir o valor nulo, aproveitar alguns métodos que facilitam o tratamento de dados, etc.

### Auto Boxing

Para declarar um Wrapper ao invés de um tipo, basta colocarmos o nome do tipo em maíusculo. Assim, se digitarmos `boolean` temos uma variável do tipo booleano. Já se digitarmos `Boolean` temos um objeto criado com o Wrapper booleano.

Nós não precisamos declarar New para fazer um objeto Wrappers, por isso falamos que ele é Auto Boxing, pois ele compreende que deve gerar seu próprio objeto

### Unboxing

Caso quisermos, podemos pegar um  Objeto Wrapper e definirmos como o valor de uma variável de tipo primitivo. Esse processo é chamado de unboxing, pois vai ser "tirado da caixa" na qual foi criado, e levado para um tipo primitivo.

## Tipagem forte e estática

O Java é considerado de tipagem estática pois ele está desde o início, ou seja, desde a compilação, checando pelo tipo que está sendo utilizado. Dessa forma, ele está desde o desenvolvimento verificando o tipo, e somos alertados direto de início.

E é considerado de Tipagem forte porque não podemos simplesmente mudar o tipo de uma variável. A partir do momento que criamos e definimos o tipo da variável, está feito!

O Java recentemente ganhou a capacidade de inferir um tipo. Então, se declararmos uma variável utilizando a palavra `var` e em seguida definirmos o valor dela, o Java vai saber lidar com isso e classificar para o tipo apropriado.
