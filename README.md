# Projeto integrador


##  O que é o meu projeto

Breve descrição sobre o que o projeto faz e qual seu objetivo principal.
Meu projeto constitui em um jogo interativo que constituí em vários quadros
com múltiplas escolhas (Mortais ou não) em que você (O aventureiro perdido) precisa se esquivar dos perigos de sua terra natal,
e talvez enfrentar e derrotar a sombra que não pode ser tocada.

![inicio](https://github.com/Felipedutra68/projeto_integrador/blob/main/Captura%20de%20tela%202025-07-14%20202929.png)

---

## 📌 Estrutura 

A estrutura do projeto se baseia em uma tela de login, uma tabela de personagens e uma tela de cadastro,
junto com várias telas do jogo como a de seleção de classe e telas de múltipla escolha. 

![acampamento](https://github.com/Felipedutra68/projeto_integrador/blob/main/Acampamento.png)


---

# Explicando os comandos


## 📌 Conexão:

Este java class é o responsável pela conexão entre o java e o mysql por meio do comando 

`(private static final String URL = "jdbc:mysql://localhost:3306/rpg";)`

que faz a conexão e o armazenamento de dados entre o java e o mysql ser possível.


---

## 📌 Criptografia: 

Este java class é o responsável pela criptografia da senha do login que consiste
em pegar a senha e aumentar o tamanho e substituir as letras por caracteres números ou outras letras. 

`(hexString = new StringBuilder(2 * hash.length);)`

`( String hex = Integer.toHexString(0xff & hash[i]);)`


---


## 📌 DAO:

Este java class é o responsável por tudo o tipo de armazenamento de dados do java para o mysql. Um exemplo é

`( private static String CRIAR_PERSONAGEM = "INSERT INTO personagen (id,nome,sexo,classe) values (null,?,?,?);";)`

, este comando adiciona na tabela os dados que serão informados pelo usuário na tabela de cadastro.

Os dados são salvos pelo comando

` (ps.setString(i++, cliente.getNome());)`


---

## 📌 BD: 

O BD é bem simples ele é essencial para que o java class Conexão faça a conexão do mysql e o java pelo comando

`( connect = Conexao.getConn().abrirConexao();).`  


--


## 📌 ModeloTabela:

Este java class é o responsável pela modelagem da tabela, aonde cada coluna vai estar e quais informações serão listadas nelas, por exemplo o comando

 `( private static final String[] colunas = {"id", "Nome", "Sexo", "Classe"};)`

que define a ordem das colunas e qual o nome de cada uma, por outro lado o comando

`( } else if (columnIndex == 1) {)`

 define qual informação vai para cada linha da tabela. 


---

## 📌 Tela de login: 

Na tela de login você informa sua senha e usuário que são salvos pelo DAO no mysql, e são criptografadas.
 A senha é identificada pelo comando

` ((cripto.criptografar().equals("63A9F0EA7BB98050796B649E85481845")) {)`

 que pega a criptografia da senha e a usa como referência para passar para a próxima tela.


---


## 📌 Tabela de personagens:

Nesta tabela você pode cadastrar, alterar e excluir personagens pelo DAO, e começar o jogo.

---

## 📌 Tabela de cadastro:

Nesta tabela é aonde você coloca as informações do seu personagem e o DAO armazena no mysql.


---


# 📌 Outros comandos:


Um dos comandos utilizados no jogo e o de colocar imagens como fundo de tela, um
 dos comandos utilizados é o de definir o tamanho da imagem

 `( setSize(1020, 620);)`

e o comando de adicionar a imagem

` ImageIcon imagemBackground = new ImageIcon("C:\\Users\\ADM\\Documents\\NetBeansProjects\\ProjetoIntegrador\\src\\Imagens\\morte.png");. `

Outro comando utilizado é o de som em loop

` (som.tocarSomEmLoop("C:\\Users\\ADM\\Documents\\NetBeansProjects\\ProjetoIntegrador\\src\\Sons\\Micolash - Screaming or Cumming_ You Decide.wav");`

, que pega o arquivo de som e o toca em loop´. 

O comando mais utilizado é o de troca de tela que é executado pela cadeia de comando abaixo:

`(Jogo20 jp = new Jogo20();)`
`( jp.setLocationRelativeTo(jp);)`
`(jp.setVisible(true);)`



