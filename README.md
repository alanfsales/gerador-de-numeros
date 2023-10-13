# Gerador de Números Aleatórios

<p align="center">
  <img align="center" alt="Java" height="30" width="40" src="https://github.com/alanfsales/assets/blob/main/Java.png">
  <img align="center" alt="Spring" height="30" width="40" src="https://github.com/alanfsales/assets/blob/main/Spring.png">
  <img align="center" alt="SpringBoot" height="40" width="110" src="https://github.com/alanfsales/assets/blob/main/SpringBoot.jpeg">
  <img align="center" alt="Swagger" height="30" width="90" src="https://github.com/alanfsales/assets/blob/main/Swagger.png">
  <img align="center" alt="Maven" height="50" width="60" src="https://github.com/alanfsales/assets/blob/main/maven.png">
</p>

## Descrição do projeto 

<p align="justify">
  Este projeto tem como objetivo aprimorar o meu conhecimento e aprendizado em backend, Java e Spring, e também faz parte do meu portfólio.
</p>
<p align="justify">
  Esta API gera números aleatórios de 0 a 99. Podendo retornar até 100 números.
</p>
<p align="justify">
  Ela possui um único endpoint: "/sorteador/{quantidade}", onde {quantidade} representa a quantidade de números que serão gerados.
</p>

>Um exemplo que retorna 6 números 

<p align="center">
  <img align="center" alt="exemploPostman" src="https://github.com/alanfsales/assets/blob/main/sorteador/exemploPostmam.png">
</p>

## Mensagens de erro padronizadas

<p align="justify">
  Usando a anotação @ControllerAdvice e herdando a classe ResponseEntityExceptionHandle do Spring a gente consegue padronizar as respostas de erro na API.
</p>

<p align="center">
  <img align="center" alt="erro1" src="https://github.com/alanfsales/assets/blob/main/sorteador/exemploErro1.png">
  <img align="center" alt="erro2" src="https://github.com/alanfsales/assets/blob/main/sorteador/exemploErro2png.png">
  <img align="center" alt="erro3" src="https://github.com/alanfsales/assets/blob/main/sorteador/exemploErro3.png">
</p>

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





