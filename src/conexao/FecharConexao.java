package conexao;

import java.sql.Connection;
import java.sql.SQLException;

public class FecharConexao {
    
    public static void fecharConexao(Connection conexao){
        if (conexao != null){
            try {
                conexao.close();
            } catch (SQLException e) {
                throw new ExcessaoBanco(e.getMessage());
            }
        }
    }

}
