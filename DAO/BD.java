package DAO;

import Controller.Conexao;
import java.sql.Connection;
/**
 *
 * @author ADM
 */
public class BD {
    private static Connection connect = null;
    
    public static void main(String[] args) {
        
        try{
            connect = Conexao.getConn().abrirConexao();
            System.out.println("Base criada com sucesso");
           // Conexao.getConn().fecharConexao();
        }catch (Exception e){
            System.out.println(e.getMessage());           
            System.exit(0);
                    
            
        }
        
    }
    
    

}
