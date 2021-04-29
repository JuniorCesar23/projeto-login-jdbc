package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class IniciarConexao {
    
    private static Connection conexao = null;

    public static Connection iniciarConexao(){
        if (conexao == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/java";
                conexao = DriverManager.getConnection(url, "junior", "password");
                System.out.println("Conexão iniciada!");
            } catch (Exception e) {
                throw new ExcessaoBanco(e.getMessage());
            }
        }
        return conexao;
    }

}
