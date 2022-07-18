# Java - Criação de Projetos

## Inicialização por Spring

Quando formos utilizar o framework Spring Boot, devemos acessar o site [start.spring.io](https://start.spring.io/) e definir o Group, o Artifact, a versão do Java, se o projeto vai ser em Maven ou Gradle e adicionar as dependências, de acordo com o passo a passo do professor.

Mais tarde entraremos em detalhes sobre o que é o Spring Boot em si.

No nosso caso, vamos adicionar a dependência Spring Web e fazer o download do nosso projeto inicial utlizando o botão Generate.

Faremos dois projetos semelhantes, porém um com Gradle e um com Maven.

### mvnw

Esse arquivo é o que vai fazer o Wrap do Maven. Com ele criado por padrão pelo Spring Boot e com o Maven "colocado" de forma padrão no projeto, isso resolve o problema de cada desenvolvedor do time ter uma versão diferente do Maven, pois esse arquivo Wrapper "amarra" unificando as versões de forma padronizada no projeto.

### pom.xml

É o principal arquivo onde as configurações do projeto e identificações estão armazenadas.

Nele temos a identificação do projeto, a versão do Spring Boot que vai ser utilizado, as dependências do projeto, o ambiente de teste, plugins... etc.

De certa forma, ele dá as informações do projeto e define como e em qual versão os arquivos serão executados.

### gitignore

É um arquivo que diz para o Git o que ignorar no nosso documento e não commitar. Existem alguns arquivos de configuração do projeto que não precisam ser commitados, pois são inalterados, ou outros motivos mais tecnicos.

### Pasta Src

Onde nosso projeto propriamente dito ficará, com todo o código.

Dentro da pasta Main nós iremos produzir o projeto, contando já também com a classe principal iniciada.
