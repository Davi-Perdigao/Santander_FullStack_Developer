/*
Guilherme adora brincar com pipas, pipas de várias cores, formas e tamanhos. Ele tem percebido 
que para as pipas possuírem maior estabilidade, e dessa forma voarem mais alto, elas devem possuir 
um barbante bem esticado ligando todos os pares de pontas não vizinhas.

Apesar de ser uma criança bastante criativa e astuta, Guilherme não sabe como determinar a quantidade 
de barbantes que ele terá que utilizar para tornar uma pipa de n lados, estável. Você pode ajudá-lo?.
*/

let lines = gets().split("\n");

let N = parseInt(lines.shift());

let resposta = (N * (N - 3)) / 2;

print(resposta);