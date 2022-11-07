package ModelDominio;

public class Usuario {
    public Usuario(String nome, String email, String senha, String login){
        this.setNome(nome);
        this.setEmail(email);
        this.setSenha(senha);
        this.setLogin(login);
    }
    private String nome;
    private String email;
    private String senha;
    private String login;

    public String getNome(){
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getLogin() {
        return login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
