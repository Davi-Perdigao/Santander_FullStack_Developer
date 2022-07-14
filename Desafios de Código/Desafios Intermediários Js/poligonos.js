/*
Na geometria Euclidiana, um polígono regular é um polígono em que todos os ângulos são iguais 
e todos os lados tem o mesmo comprimento. Um polígono simples é aquele cujos segmentos de reta 
não se interceptam. Abaixo pode-se ver vários mosaicos feitos por polígonos regulares.

Você deve escrever um programa que, dados o número e o comprimento dos lados de um polígono regular, mostre seu perímetro.
*/

let entrada = gets().split(" ")

console.log(+entrada[0] * +entrada[1])