package conexao;

public class ExcessaoBanco extends RuntimeException {
    
    public ExcessaoBanco(String msg){
        super(msg);
    }

}
