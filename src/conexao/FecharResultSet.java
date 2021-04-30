package conexao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FecharResultSet {
    
    public static void fecharStatement(ResultSet rs){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                throw new ExcessaoBanco(e.getMessage());
            }
        }
    }

}
