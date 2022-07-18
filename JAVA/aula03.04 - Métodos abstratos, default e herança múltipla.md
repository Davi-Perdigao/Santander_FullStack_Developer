# Métodos abstratos, default e herança múltipla

## Interfaces

A Interface em Java é um elemento que gera métodos e atributos que serão implementados por outras classes.

É comum encontrarmos referências a Interface como sendo um contrato que uma Classe assume, pois quando ela a implementa, é "forçada" a assumir e atribuir funções para os métodos contidos ali dentro.

### Métodos abstratos

Os métodos abstratos das interfaces devem ser implementados por todos os que a aplicarem e sempre que você adiciona um método abstrato novo, você deve realizar a implementação em todos os herdeiros.

### Métodos default

São métodos herdados a todos que implementam, mas que não são obrigatórios em implementação. Dessa forma, você pode ter um método novo inserido na interface sem quebrar os componentes que as aplicam.

### Herança múltipla

As classes podem ainda herdar mais de uma Interface, a isso chamamos de herança múltipla

## Enum

De forma básica, é um tipo de "dicionário de dados" imutável.

Nós podemos utilizar o Enum para criar listas com nomes, modelos de algo, etc...

Eles não são instanciados como as Classes, mas podem ser chamados para exibir os valores conforme formos pedindo
