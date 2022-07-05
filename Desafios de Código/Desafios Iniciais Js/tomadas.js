/*Finalmente, o time da Universidade conseguiu a classificação para a Final Nacional da Maratona 
de Programação da SBC. Os três membros do time e o técnico estão ansiosos para bem representar a Universidade, 
e além de treinar muito, preparam com todos os detalhes a sua viagem a São Paulo, onde será realizada a Final Nacional.

Eles planejam levar na viagem todos os seus vários equipamentos eletrônicos: celular, tablet, notebook, ponto de acesso 
wifi, câmeras, etc, e sabem que necessitarão de várias tomadas de energia para conectar todos esses equipamentos. Eles 
foram informados de que ficarão os quatro no mesmo quarto de hotel, mas já foram alertados de que em cada quarto há apenas 
uma tomada de energia disponível.

Precavidos, os três membros do time e o técnico compraram cada um uma régua de tomadas, permitindo assim ligar vários 
aparelhos na única tomada do quarto de hotel; eles também podem ligar uma régua em outra para aumentar ainda mais o número 
de tomadas disponíveis. No entanto, como as réguas têm muitas tomadas, eles pediram para você escrever um programa que, dado 
o número de tomadas em cada régua, determine o número máximo de aparelhos que podem ser conectados à energia num mesmo instante.*/

let lines = gets().split("\n");

let line = lines.shift().split('');
let soma = 0

for (var i = 0; i < line.length; i++){
  let transfor = parseInt(line[i])
  if(transfor >= 2 && transfor <= 6){
    soma = soma + transfor
  }
}
print(soma-3)