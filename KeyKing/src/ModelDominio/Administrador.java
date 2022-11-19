package ModelDominio;

public class Administrador extends Usuario{
    public Administrador(String nome, String senha, String login){
        super (nome, senha, login);
    }
    public boolean login(String login, String senha){ // verificando login
        boolean x = false;
        if(this.getLogin().equals(login) && this.getSenha().equals(senha) == true){ //testa pra ver se o
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
    public void cadastrarCoordenador(String nome, String senha, String login){
        this.setNome(nome);
        this.setSenha(senha);
        this.setLogin(login);
    }
    public void autenticar(){

    }
}
