package ModelDominio;

public class Usuario {
    private String nome;
    private String senha;
    private String login;
    public Usuario(String nome, String senha, String login){
        this.setNome(nome);
        this.setSenha(senha);
        this.setLogin(login);
    }

    public String getNome(){
        return nome;
    }
    public String getSenha() {
        return senha;
    }
    public String getLogin() {
        return login;
    }
    public void setNome(String nome) {
        if (nome == null){ //testa se o nome é null.
            throw new RuntimeException("Nome null.");
        }
        if (nome.length()< 3){ //testa se o nome tem menos de 2 caracteres
            throw new RuntimeException("Nome com menos de 3 caracteres.");
        }
        this.nome = nome;
    }
    public void setSenha(String senha){
        if (senha == null){ //testa se o nome é null.
            throw new RuntimeException("Senha null.");
        }
        if (senha.length()< 2){ //testa se o nome tem menos de 2 caracteres
            throw new RuntimeException("Senha com menos de 2 caracteres.");
        }
        this.senha = senha;
    }
    public void setLogin(String login) {
        if(login == null){
            throw new RuntimeException("Login nulo!");
        }
        this.login = login;
    }
}
