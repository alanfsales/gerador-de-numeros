# Gerador de Números Aleatórios

<p align="center">
  <img align="center" alt="Java" height="30" src="https://github.com/alanfsales/assets/blob/main/Java.png">
  <img align="center" alt="Spring" height="30" src="https://github.com/alanfsales/assets/blob/main/Spring.png">
  <img align="center" alt="SpringBoot" height="30" src="https://github.com/alanfsales/assets/blob/main/SpringBoot.jpeg">
  <img align="center" alt="Swagger" height="30" src="https://github.com/alanfsales/assets/blob/main/Swagger.png">
  <img align="center" alt="Maven" height="30" src="https://github.com/alanfsales/assets/blob/main/maven.png">
</p>

## Descrição do projeto 

Este projeto tem como objetivo aprimorar o meu conhecimento e aprendizado em backend, Java e Spring, e também faz parte do meu portfólio.

Esta API gera números aleatórios de 0 a 99. Podendo retornar até 100 números.

Ela possui um único endpoint: "/sorteador/{quantidade}", onde {quantidade} representa a quantidade de números que serão gerados.

>Um exemplo que retorna 6 números 

![exemploPostman](https://github.com/alanfsales/assets/blob/main/sorteador/exemploPostmam.png)

## Mensagens de erro padronizadas

Utilizando a anotação **@ControllerAdvice** e estendendo a classe **ResponseEntityExceptionHandler** do Spring, é possível padronizar as respostas de erro na API

![erro1](https://github.com/alanfsales/assets/blob/main/sorteador/exemploErro1.png)&nbsp;

![erro2](https://github.com/alanfsales/assets/blob/main/sorteador/exemploErro2png.png)&nbsp;

![erro3](https://github.com/alanfsales/assets/blob/main/sorteador/exemploErro3.png)


## Dependências

- Java 17
- Spring Boot
- Spring Web
- SpringDoc(Swagger)
- Maven 

## Próximos passos

- Criar novos endpoints(Aceito sugestões)
- Gerar números de 1 a 60 (Ideal para jogar na mega sena)
- Gerar números de 4 dígitos(milhar)
- Deploy





