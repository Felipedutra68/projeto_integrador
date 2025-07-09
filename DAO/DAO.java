package DAO;

/**
 *
 * @author ADM
 */
import Controller.Conexao;
import Model.Cliente;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//import java.sql.

public class DAO {

    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    private static String CRIAR_PERSONAGEM = "INSERT INTO personagen (id,nome,sexo,classe) values (null,?,?,?);";
    private static String CONSULTAR_lISTA_PER = "select * from personagen where id = ?;";
    private static String ALTERAR_CLIENTE = "update personagen set nome =?,sexo = ? ,classe = ? where id = ?;";
    private static String EXCLUIR_PERSONAGEM = "delete from personagen where id = ?;";
    private static String LISTAR_PERSONAGENS = "select * from personagen where 1 = 1;";
    private static String CONSULTAR_USUARIO = "select usuario, senha from usuario wh-**ere usuario = ? and senha = ?;";

    //public DAO(){
    public void cadastrarCliente(Cliente cliente) throws SQLException {
        Connection connection = Conexao.getConn().abrirConexao();
        connection.setAutoCommit(false);
        try {
            ps = connection.prepareStatement(CRIAR_PERSONAGEM);
            int i = 1;
            ps.setString(i++, cliente.getNome());
            ps.setString(i++, cliente.getSexo());
            ps.setString(i++, cliente.getClasse());

            ps.execute();
            connection.commit();

            JOptionPane.showMessageDialog(null, "Cliente incluido com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Cliente consultarCliente(String id) throws SQLException {
        Connection connection = Conexao.getConn().abrirConexao();
        Cliente cliente = null;
        connection.setAutoCommit(false);
        try {
            ps = connection.prepareStatement(CONSULTAR_lISTA_PER);
            ps.setInt(1, Integer.parseInt(id));//id como numerico
            rs = ps.executeQuery();
            while (rs.next()) {
                cliente = new Cliente(rs.getString("ID"), rs.getString("Nome"), rs.getString("Sexo"), rs.getString("Classe"));

            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        if (cliente == null) {
            JOptionPane.showMessageDialog(null, "Não foi possivel localizar o cliente selecionado ", "", JOptionPane.WARNING_MESSAGE);
        }
        return cliente;
    }

    public void alterarCliente(String id, Cliente cliente) throws SQLException {
        Connection connection = Conexao.getConn().abrirConexao();
        //connection.setAutoCommit(false);
        try {
            ps = connection.prepareStatement(ALTERAR_CLIENTE);
            int i = 1;
            ps.setString(i++, cliente.getNome());
            ps.setString(i++, cliente.getSexo());
            ps.setString(i++, cliente.getClasse());
            ps.setString(i++, cliente.getId());

            ps.execute();
            connection.commit();

            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            fecharConexao();
        }
    }

    public void excluirCliente(String id) throws SQLException {
        Connection connection = Conexao.getConn().abrirConexao();
        connection.setAutoCommit(false);
        try {
            ps = connection.prepareStatement(EXCLUIR_PERSONAGEM);
            ps.setString(1, id);

            ps.execute();
            connection.commit();

            JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Cliente> listarCliente() throws SQLException {
        Connection connection = Conexao.getConn().abrirConexao();
        ArrayList<Cliente> clientes = new ArrayList<>();
        connection.setAutoCommit(false);
        try {
            ps = connection.prepareStatement(LISTAR_PERSONAGENS);
            rs = ps.executeQuery();
            while (rs.next()) {
                clientes.add(new Cliente(rs.getString("ID"), rs.getString("Nome"), rs.getString("Sexo"), rs.getString("Classe")));

            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        if (clientes == null) {
            JOptionPane.showMessageDialog(null, "Não ha clientes cadastrados ", "", JOptionPane.WARNING_MESSAGE);
        }
        return clientes;
    }

    public Usuario consultarUsuario(String nomeUsuario, String senhaCriptografada) throws SQLException {
        Connection connection = Conexao.getConn().abrirConexao();
        Usuario usuario = null;
        connection.setAutoCommit(false);
        try {
            ps = connection.prepareStatement(CONSULTAR_USUARIO);
            ps.setString(1, nomeUsuario);
            ps.setString(2, senhaCriptografada);

            rs = ps.executeQuery();
            while (rs.next()) {
                usuario = new Usuario(rs.getInt("id"), rs.getString("Usuario"), rs.getString("Senha"));

            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "Não foi possivel localizar o usuario selecionado ", "", JOptionPane.WARNING_MESSAGE);
        }
        return usuario;
    }

    //private void fecharConexao(){}
    private void fecharConexao() {

    }
}
