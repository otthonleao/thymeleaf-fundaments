# Thymeleaf Engine
O Thymeleaf é um template engine que renderiza páginas HTML no back-end de forma dinâmica com Java e Spring. Sendo assim, permite a incorporação de linguagens de programação no HTML possibilitando o uso de estruturas de condição, repetição, herança e diversos outros recursos.

### Thymeleaf vs JSP
Ambos são template engine para o back-end com Java, porém o Thymeleaf é considerado uma solução mais moderna e flexível do que o JSP que é mais verboso, difícil de trabalhar com padrões de projetos atuais e suporte limitado ao HTML 5 e CSS3.
- Permite os desenvolvedores criarem páginas dinâmicas com HTML 5, CSS3, Bootstrap entre outros</li>
- Iniciantes de HTML, CSS e JS encontram facilidade, pois a unica diferença é a possibilidade de usar uma variável Java para renderizar direto no HTML</li>
- Possui starter oficial no Spring Boot</li>
- Possibilidade de separar a apresentação da regra de negócio, facilitando o uso do MVC</li>
- Não precisa de uma Servlet para abrir a página, assim a equipe de design pode editar o HTML e CSS e verificar os resultados das mudanças</li>

## Como Funciona?
Os navegadores renderizam somente código HTML e o Thymeleaf é a ferramenta que vai traduzir o código Java e incorporar no HTML. Exemplo:
```html
<ul>
  <li th:each="user : ${users}"	>
    <a 
      th:href="/user/{username} (username=${user.username})"
      th:text="${user.firstname} + ' ' + ${user.lastname}"
    ></a>
  </li>
</ul>
```
Após o processamento do template realizado pelo Thymeleaf será gerado um código HTML como o do exemplo abaixo:
```html
<ul>
  <li>
    <a href="/user/joao_silva">João da Silva</a>
  </li>
  <li>
    <a href="/user/maria_luiza">Maria Luiza</a>
  </li>
  <li>
    <a href="/user/jose_ramos">José Ramos</a>
  </li>
  <li>
    <a href="/user/neuza_cristina">Neuza Cristina</a>
  </li>
  <li>
    <a href="/user/geraldo_santos">Geraldo Santos</a>
  </li>
</ul>
```
### Starter do Thymeleaf no `pom.xml`
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-thymeleaf</artifactId>
</dependency>
```

## th:href="@{ ... }" - Referências de Links CSS e outros
Referenciando CSS:
```html
<link rel="stylesheet" th:href="@{https://cdn.jsdelivr.net/npm/@picocss/pico@1.5.10/css/pico.min.css}">
```
Direcionando página ou link:
```html
<a th:href="@{/clients/create}" role="button">Novo Cliente</a>
```
Usando variáveis ou id:
```html
<a th:href="@{/clients/edit/{id} (id=${client.id})}" role="button">Editar Cliente</a>
<a th:href="@{/clients/edit/{id}/{name} (id=${client.id}, ${client.name)}" role="button">Editar Cliente</a>
<a th:href="@{/clients/delete/{id} (id=${client.id})}" onclick="return confirm('Tem certeza que deseja excluir?')" role="button">Excluir Cliente</a>
```
## Injeção de Conteúdo 

```html
<td th:text="${client.name}">Otthon Leão</td>
<td>[[${client.name}]]</td>
```