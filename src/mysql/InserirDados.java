package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import conexao.FecharStatement;
import conexao.IniciarConexao;

public class InserirDados {

    private static Scanner input = new Scanner(System.in);

    private static PreparedStatement state = null;

    public static void inserirDados(Connection conexao){
        
        try {
            
            conexao = IniciarConexao.iniciarConexao();

            state = conexao.prepareStatement("insert into pessoas (email, senha)" 
                            + " values (?, ?) ");

            System.out.println("=== REALIZAR CADASTRO ===");

            System.out.println("Seu E-mail: ");
                String email = input.next();

            System.out.println("Crie sua senha: ");
                String senha = input.next();

            state.setString(1, email);
            state.setString(2, senha);

            int linhasAfetadas = state.executeUpdate();

            System.out.println("Cadastro realizado com sucesso! Linhas afetadas: " + linhasAfetadas);

        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            FecharStatement.fecharStatement(state);
        }

    }
    
}
