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

Esta API gera números aleatórios. 

Endpoints:
- /sortear0a99/{quantidade}
- /sortear1a66/{quantidade}
- /sortear-milhar/{quantidade}&nbsp;

    *obs: {quantidade} representa a quantidade números a serem geradados.*

>Um exemplo que retorna 5 números de 0 a 99

![exemploPostman](https://github.com/alanfsales/assets/blob/main/sorteador/exemploPostmam.png)

## Mensagens de erro padronizadas

Utilizando a anotação **@ControllerAdvice** e estendendo a classe **ResponseEntityExceptionHandler** do Spring, é possível padronizar as respostas de erro na API

![erro1](https://github.com/alanfsales/assets/blob/main/sorteador/exemploErro1.png)&nbsp;

![erro2](https://github.com/alanfsales/assets/blob/main/sorteador/exemploErro2png.png)&nbsp;

![erro3](https://github.com/alanfsales/assets/blob/main/sorteador/exemploErro3.png)

## Deploy (Railway)

- url: https://gerador-de-numeros-production.up.railway.app/

## Dependências

- Java 17
- Spring Boot
- Spring Web
- SpringDoc(Swagger)
- Maven 

## Próximos passos

- [ ] Criar novos endpoints(Aceito sugestões)
- [x] Gerar números de 1 a 60 (Ideal para jogar na mega sena)
- [x] Gerar números de 4 dígitos(milhar)
- [x] Deploy(Railway)





