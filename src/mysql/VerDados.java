package mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import conexao.IniciarConexao;

import conexao.ExcessaoBanco;
import conexao.FecharStatement;

public class VerDados {
    
    private static Statement state = null;
    private static ResultSet rs = null;

    public static void verDados(Connection conexao){
        try {
            conexao = IniciarConexao.iniciarConexao();
            state = conexao.createStatement();
            rs = state.executeQuery("select * from pessoas");

            System.out.println("===DADOS DA TABELA===");

            while (rs.next()){
                System.out.println("Email: " + rs.getString("email"));
            }

        } catch (Exception e) {
            throw new ExcessaoBanco(e.getMessage());
        } finally {
            FecharStatement.fecharStatement(state);
        }
    }

}
