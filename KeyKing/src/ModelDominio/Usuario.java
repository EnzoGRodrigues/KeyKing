package ModelDominio;

public class Usuario {
    public Usuario(String nome, String senha, String login){
        this.setNome(nome);
        this.setSenha(senha);
        this.setLogin(login);
    }
    private String nome;
    private String senha;
    private String login;

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
        if (nome == null){
            throw new RuntimeException("Nome null.");
        }
        if (nome.length()<= 3){
            throw new RuntimeException("Nome com menos de 2 caracteres.");
        }
        this.nome = nome;
    }
    public void setSenha(String senha){
        if (nome == null){
            throw new RuntimeException("Senha null.");
        }
        if (nome.length()<= 8){
            throw new RuntimeException("Senha com menos de 7 caracteres.");
        }
        this.senha = senha;
    }
    public void setLogin(String login) {
        this.login = login;
    }
}
