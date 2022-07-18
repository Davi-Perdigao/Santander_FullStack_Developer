# Strings e o pacote java.lang

## String

String é uma classe contida dentro do pacote `java.lang` e representa uma sequencia de caracteres

```
var nome = "André";
var sobreNome = "Gomes";
final var nomeCompleto = nome + sobreNome;

System.out.println(nome);
System.out.println("Nome do cliente : " + nome);
System.out.println("Nome completo do cliente : " + nomeCompleto);
var string = new String(" Minha  String ");

//charAt() nos retorna o caractere presente na posição desejada. Vale lembrar que o sistema começa a contar a partir do 0
System.out.println("Char na posição : " + string.charAt(5));

//length() nos retorna a quantidade de caracteres da String
System.out.println("Quantidade=" + string.length());

//trim() remove os espaços, os caracteres em branco desnecessários, deixando apenas entre as palavras
System.out.println("Sem Trim [" + string + "]");
System.out.println("Com Trim [" + string.trim() + "]");

//toLowerCase deixa tudo em minúsculo
System.out.println("Lower " + string.toLowerCase());

//toUpperCase deixa tudo em maiúsculo
System.out.println("Upper " + string.toUpperCase());

//contains vai nos retornar verdadeiro ou falso, nos dizendo se um caractere ou até mesmo uma string estão contidos dentro da string
System.out.println("Contém M? " + string.contains("M"));
System.out.println("Contém X? " + string.contains("X"));

//replace serve para substituir um caractere por outro em toda a string
System.out.println("Replace " + string.replace("n", "$"));

//equals serve para comparar strings, retornando true ou false
System.out.println("Equals? " + string.equals(" Minha String "));

//equalsIgnoreCase vai ser como o equal, mas sem distinguir maiúsculas de minúsculas
System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" minha sTrinG "));

//substring "fatia" uma String, retornando para nós apenas o pedaço desejado
System.out.println("Substring(1,6)=" + string.substring(1, 6));
```