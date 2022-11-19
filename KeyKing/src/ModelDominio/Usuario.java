package ModelDominio;

public class Usuario {
    private String nome;
    private String senha;
    private String login;
    private boolean status;
    public Usuario(String nome, String senha, String login, boolean statusUsuario){
        this.setNome(nome);
        this.setSenha(senha);
        this.setLogin(login);
        this.statusUsuario(statusUsuario);
    }

    private void statusUsuario(boolean statusUsuario) {
        this.status = status;
    }

    public String getNome(){
        return nome;
    }

    public boolean getStatusUsuario() {
        return status;
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
        if (nome.length()<= 3){ //testa se o nome tem menos de 2 caracteres
            throw new RuntimeException("Nome com menos de 2 caracteres.");
        }
        this.nome = nome;
    }
    public void setSenha(String senha){
        if (nome == null){//testa se o senha é null.
            throw new RuntimeException("Senha null.");
        }
        if (nome.length()<= 8){//testa se a senha tem menos de 7 caracteres
            throw new RuntimeException("Senha com menos de 7 caracteres.");
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
