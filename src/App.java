import java.sql.Connection;

import conexao.FecharConexao;
import conexao.IniciarConexao;

public class App {
    public static void main(String[] args) throws Exception {
       
        Connection conexao = IniciarConexao.iniciarConexao();

        FecharConexao.fecharConexao(conexao);

    }
}
