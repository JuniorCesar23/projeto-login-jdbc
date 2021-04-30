package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.FecharStatement;
import conexao.IniciarConexao;

public class InserirDados {

    private static PreparedStatement state = null;

    public static void inserirDados(Connection conexao){
        
        try {
            
            conexao = IniciarConexao.iniciarConexao();

            state = conexao.prepareStatement("insert into pessoas (email, senha)" 
                            + " values (?, ?) ");

            state.setString(1, "junior@gmail.com");
            state.setString(2, "123456");

            int linhasAfetadas = state.executeUpdate();

            System.out.println("Pronto! Linhas afetadas: " + linhasAfetadas);

        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            FecharStatement.fecharStatement(state);
        }

    }
    
}
