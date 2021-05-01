package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import conexao.FecharStatement;
import conexao.IniciarConexao;

public class DeletarDados {
    
    private static Scanner input = new Scanner(System.in);

    private static PreparedStatement state = null;

    public static void deletarDados(Connection conexao){
        
        try {
            
            conexao = IniciarConexao.iniciarConexao();

            state = conexao.prepareStatement("delete from pessoas "
                            + "where email = ? and senha = ?");
                        
            System.out.println("=== DELETAR DADOS ===");

            System.out.println("Informe o email que será deletado: ");
                String email = input.next();

            System.out.println("Senha: ");
                String senha = input.next();

            state.setString(1, email);
            state.setString(2, senha);

            int linhasAfetadas = state.executeUpdate();

            System.out.println("Deletado com sucesso! linhas afetadas: " + linhasAfetadas);

        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            FecharStatement.fecharStatement(state);
        }

    }

}
