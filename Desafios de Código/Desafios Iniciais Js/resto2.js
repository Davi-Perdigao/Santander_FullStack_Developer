//Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.

let lines = gets().split('\n');
let n = parseInt(lines.shift());

for (let i = 1; i < 10000; i++) {
  if (i % n == 2){
    print(i);
  }
}