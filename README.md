# Projeto integrador


##  O que é o meu projeto

Breve descrição sobre o que o projeto faz e qual seu objetivo principal.
Meu projeto constitui em um jogo interativo que constituí em vários quadros
com múltiplas escolhas (Mortais ou não) em que você (O aventureiro perdido) precisa se esquivar dos perigos de sua terra natal,
e talvez enfrentar e derrotar a sombra que não pode ser tocada.

![Captura de Tela](link-para-uma-imagem-do-projeto.png)

---

## 📌 Estrutura 

A estrutura do projeto se baseia em uma tela de login, uma tabela de personagens e uma tela de cadastro,
junto com várias telas do jogo como a de seleção de classe e telas de múltipla escolha. 

---

# Explicando os comandos


## 📌 Conexão:

Este java class é o responsável pela conexão entre o java e o mysql por meio do comando 
(private static final String URL = "jdbc:mysql://localhost:3306/rpg";) 
que faz a conexão e o armazenamento de dados entre o java e o mysql ser possível.


---

## 📌 Criptografia: 

Este java class é o responsável pela criptografia da senha do login que consiste
em pegar a senha e aumentar o tamanho e substituir as letras por caracteres números ou outras letras. 

~~~(hexString = new StringBuilder(2 * hash.length);)~~~

~~~( String hex = Integer.toHexString(0xff & hash[i]);)~~~


---


## 📌 DAO:

Este java class é o responsável por tudo o tipo de armazenamento de dados do java para o mysql. Um exemplo é
( private static String CRIAR_PERSONAGEM = "INSERT INTO personagen (id,nome,sexo,classe) values (null,?,?,?);";)
, este comando adiciona na tabela os dados que serão informados pelo usuário na tabela de cadastro.

Os dados são salvos pelo comando
 (ps.setString(i++, cliente.getNome());)


---

## 📌 BD: 

Este java class é o responsável pela criptografia da senha do login que consiste
em pegar a senha e aumentar o tamanho e substituir as letras por caracteres números ou outras letras. 


--


## 📌 ModeloTabela:

Este java class é o responsável pela conexão entre o java e o mysql por meio do comando 
(private static final String URL = "jdbc:mysql://localhost:3306/rpg";) 
que faz a conexão e o armazenamento de dados entre o java e o mysql ser possível.


---

## 📌 Tela de login: 

Este java class é o responsável pela criptografia da senha do login que consiste
em pegar a senha e aumentar o tamanho e substituir as letras por caracteres números ou outras letras. 


---


## 📌 Tabela de personagens:

Este java class é o responsável pela conexão entre o java e o mysql por meio do comando 
(private static final String URL = "jdbc:mysql://localhost:3306/rpg";) 
que faz a conexão e o armazenamento de dados entre o java e o mysql ser possível.


---

## 📌 Tabela de cadastro:

Este java class é o responsável pela criptografia da senha do login que consiste
em pegar a senha e aumentar o tamanho e substituir as letras por caracteres números ou outras letras. 


---
