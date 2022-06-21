# Aula 05 - Concatenação

_aula ministrada pelo **Professor Denilson Bonatti**_

## O que é concatenação?

Concatenação é um termo usado em computação para designar a operação de unir o conteúdo de duas strings.

>Relembrando, string é uma sequência de caracteres, seja uma frase que você quer que o computador exiba ou uma variável que precise ser exibida juntamente com algo.

Em outras palavras, é o agrupamento de duas ou mais células que, incluindo fórmulas, textos ou outras informaçoes contida no seu interior, dá origem a um único resultado.

Realizar uma concatenação é bem simples, mas requer atenção. Isso porque nós vamos formar uma frase unindo vários pedacinhos separados, juntando eles por um sinal que vai indicar que queremos uní-los.

Nos nossos exemplos no programa Flowgorithm, o sinal é o `&`, mas em outras linguagens esse sinal pode variar pelo `.` ou ainda pelo `+`.

### Exemplo

Vamos supor que temos três variáveis, `nome` com o valor **José**, `sobrenome` com o valor **Silva** e `idade` com o valor **40** e queremos exibir isso tudo em uma única frase. Para isso, nós fazemos uso da concatenação.
```
"Seu nome é " & nome & " " & sobrenome ". Você tem " & idade " anos."

saída:
Seu nome é José Silva. Você tem 40 anos.
```

Observe que temos que colocar o sinal de `&` entre todas as frases ou variáveis (o termo correto é string) que vamos unir.

Vale ficar atento também para os espaços. Ao colocar uma variável na concatenação, ela vem sem espaços antes e depois dela, então nas strings do tipo frase que colocarmos, temos que lembrar de adicionar esses espaços. Perceba que ali, entre as variáveis `nome` e `sobrenome`, colocamos uma string a mais apenas para adicionar o espaço, e evitar que o nome saia todo grudado!

## Exercício

Vamos utilizar aquele exercício das médias e utilizar a concatenação. Pergunte o nome do aluno, peça as notas que ele tirou, e exiba uma frase pra ele, falando qual a média que o aluno tirou.

## Resolução

![atividade](https://github.com/Davi-Perdigao/Santander_FullStack_Developer/blob/main/Introdu%C3%A7%C3%A3o%20-%20L%C3%B3gica%20de%20Programa%C3%A7%C3%A3o/Imagens/fluxograma_soma_medias_concatenacao.png)
