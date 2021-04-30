import java.sql.Connection;

import conexao.FecharConexao;
import conexao.IniciarConexao;
import mysql.InserirDados;
import mysql.VerDados;

public class App {
    public static void main(String[] args) throws Exception {
       
        Connection conexao = IniciarConexao.iniciarConexao();

            InserirDados.inserirDados(conexao);
            VerDados.verDados(conexao);

        FecharConexao.fecharConexao(conexao);

    }
}
