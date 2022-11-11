package ModelDominio;

public class Administrador extends Usuario{
    public Administrador(String nome, String email, String senha, String login){
        super (nome, email, senha, login);
    }
    public void login(String email, String senha){
    }
    public void logout(){
        System.out.println("Logout realizado.");

    }
    public void cadastrarCoordenador(String nome, String email, String senha){
        this.setNome(nome);
        this.setEmail(email);
        this.setSenha(senha);
    }
    public void autenticar(){

    }
}
