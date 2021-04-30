package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class IniciarConexao {
    
    private static Connection conexao = null;

    public static Connection iniciarConexao(){
        if (conexao == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/cadastro";
                conexao = DriverManager.getConnection(url, "junior", "password");
                System.out.println("Conexão iniciada!");
            } catch (SQLException | ClassNotFoundException e) {
                throw new ExcessaoBanco(e.getMessage());
            }
        }
        return conexao;
    }

}
