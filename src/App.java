import java.sql.Connection;

import conexao.FecharConexao;
import conexao.IniciarConexao;
import mysql.DeletarDados;
import mysql.VerDados;

public class App {
    public static void main(String[] args) throws Exception {
       
        Connection conexao = IniciarConexao.iniciarConexao();

            VerDados.verDados(conexao);

            DeletarDados.deletarDados(conexao);

            VerDados.verDados(conexao);

        FecharConexao.fecharConexao(conexao);

    }
}
