# Paradigma em Orientação a Objetos

## O Paradigma

>"A programação Orientada a Objetos impõe disciplina sobre a transferênccia indireta do controle." **_Robert "Uncle Bob" Martin_, Arquitetura Limpa**

>"...a **pilha de chamadas de funções**... poderia ser **movida** para **HEAP** (área de memória não necessariamente ordenada - diferente da stack) possibilitando que as variáveis locais declaradas por uam função existissem muito depois que a função retornasse..." **_Robert "Uncle Bob" Martin_, Arquitetura Limpa**

>"A diferença entre um Código Procedural e um O.O é bem simples. **Em códigos procedurais** (...) escolher o melhor **algoritmo é o mais importante** (...) Já em linguagens **orientadas a objetos** (...) pensar no **projeto de classes** (...) como se encaixam (...) e como serão estendidas **é o que mais importa.**." **_Maurício Aniche_, Orientação a Objetos e SOLID para Ninjas**

## Classe

Uma classe funciona como uma espécie de molde que iremos utilizar para construir coisas, objetos que serão feitos baseados nesse molde, nesse projeto.

```
public class Pessoa{
    private String nome = "Marco";

    public String getNome() {
        return nome;
    }
}
```

## Objeto

Quando temos uma classe, um modelo, podemos criar um objeto utilizando ele.

O objeto é como algo construído seguindo os moldes que a classe fornece, mas que vai ter suas características, suas propriedades únicas de cada objeto.

Quando utilizamos uma classe para criar um objeto, dizemos que estamos _Instanciando um Objeto daquela Classe_. Isso é o mesmo que dizer que estamos criando um objeto dessa classe. Podemos criar vários objetos simultaneamente baseado em uma mesma classe, e cada objeto será uma Instância

```
public class ExemploPessoa {
    public static void main (String [] args) {
        Pessoa pessoa = new Pessoa();

        System.out.println(pessoa.getNome());
    }
}
```

## Atributos

O atributo é uma característica que uma Classe e um Objeto possuem.

A Classe pode ter vários atributos, cada um representando uma característica do que esse molde chamado classe representa.

No nosso exemplo, a Classe Pessoa tem o atributo nome, pois toda pessoa tem um nome. Cada Objeto Instanciado terá um valor diferente para o atributo, da mesma forma que cada Pessoa tem um Nome.

## Métodos

Além das características, cada Classe tem diversos comportamentos, diversas ações. Essas ações são os Métodos.

Da mesma forma, toda Classe pode ter diversos métodos. E os Objetos criados a partir dessa Classe modelo também terá essas ações, esses métodos.

Uma Pessoa por exemplo anda, fala, respira, nos diz qual seu nome. E da mesma forma que na vida real, a respiração é um Método comum para todo mundo, apenas executamos. Enquanto se perguntarmos o nome de alguém, cada Pessoa vai responder qual é o seu próprio Nome. A ação, o Método Dizer Nome vai buscar a característica individual deste Objeto e nos dar a resposta, de acordo com o valor do Atributo.

## Exercício

Crie uma classe Carro. nessa classe você deverá ter a quantidade de pessoas que estão dentro do carro. E também é preciso que tenha uma forma de adicionar e remover pessoas de dentro do carro.

---

## Resolução

```
public class Carro {
    public int pessoas;

    public addPessoas(){
        pessoas +=
    }

    public removePessoas(){
        pessoas -=
    }
}
```
