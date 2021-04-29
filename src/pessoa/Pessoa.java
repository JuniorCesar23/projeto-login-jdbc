package pessoa;

public class Pessoa {
    
    private String email;
    private String senha;


    public Pessoa(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    @Override
    public String toString() {
        return "Email: " + email + ", Senha: " + senha;
    }

}
