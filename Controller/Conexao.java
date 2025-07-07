package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;

/**
 *
 * @author ADM
 */
public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/rpg";

    private static final String USUARIO = "root";

    private static final String SENHA = "root";

    private static Connection conexao;

    public static Conexao conn;

    //private coonexao(){}
    public static Conexao getConn() {
        if (conn == null) {
            conn = new Conexao();

        }
        return conn;

    }

    public Connection abrirConexao() {

        try {
            //
            System.out.println("Conectando ao banco de dados...");
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            //
            System.out.println("Conexão estabelecida com sucesso!");
            return conexao;

        } catch (SQLException e) { //| ClassNotFoundException
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());

        }
        return conexao;
    }
//public void fecharConexao()
}
