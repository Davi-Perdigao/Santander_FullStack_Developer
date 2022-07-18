# Modificadores de Acesso

## O que são

São responsáveis por habilitar ou não a visualização de um método ou atributo por outras partes do projeto.

### Public
Public pode ser acessado de qualquer lugar por qualquer entidade que possa visualizar a classe a que ela pertence.

### Private
Os métodos e atributos de uma classe que forem definidos como privados serão acessados apenas por ela.

### Protected
Torna eles acessíveis ao mesmo pacote E através de herança das classes.

### Default
Por padrão, um método ou atributo definido sem modificador de acesso será public, mas apenas para dentro do mesmo pacote

### Abstract
Não pode ser usado em variáveis, apenas classes e métodos.Uma classe abstrata não pode ser instanciada, ela será um "modelo" para outras classes herdarem.

Um método abstrato só pode ser criado dentro de uma classe abstrata.

### Static
Utilizado para a criação de uma variável comum a todos os objetos. Isso é, se eu modificar o valor dessa variável em um objeto de uma classe, TODOS os objetos dessa mesma classe sofrerão a modificação nessa variável.

Da mesma forma, um método que for declarado como Static pode ser chamado sem criarmos um objeto para ele, sem instanciar.

### Final
Final quando utilizado em Classe significa que ela não pode ser herdadda por ninguém.

Final em um Método protege ele contra alterações por Classes que herdaram esse método.

E por fim, Final utilizado em um atributo impede que ele tenha seu valor alterado!
