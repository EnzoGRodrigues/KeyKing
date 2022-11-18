package ModelDominio;

public class Administrador extends Usuario{
    public Administrador(String nome, String email, String senha, String login){
        super (nome, email, senha, login);
    }
    public boolean login(String email, String senha){ // verificando login
        boolean x = false;
        if(this.getLogin().equals(email) && this.getSenha().equals(senha) == true){
            x= true;
        }
        if(this.getSenha().equals(senha) == false){
            x= false;
        }
        return x;
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
