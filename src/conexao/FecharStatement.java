package conexao;

import java.sql.SQLException;
import java.sql.Statement;

public class FecharStatement {
    
    public static void fecharStatement(Statement state){
        if (state != null){
            try {
                state.close();
            } catch (SQLException e) {
                throw new ExcessaoBanco(e.getMessage());
            }
        }
    }

}
