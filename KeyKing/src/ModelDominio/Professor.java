package ModelDominio;

public class Professor extends Agendador{
    public Professor(String nome, String senha, String login, boolean statusUsuario) {
        super(nome, senha, login, statusUsuario);
    }
    public boolean login(String login, String senha){ // verificando login
        boolean x = false;
        //verifica se getLogin é igual ao login recebido //verifica se getSenha é igual a senha recebida.
        if(this.getLogin().equals(login) && this.getSenha().equals(senha) == true){
            x= true; //Se sim, x é true e isso autoriza o login.
        }
        if(this.getSenha().equals(senha) == false){
            x= false; //se x for false ele não vai logar
        }
        return x; //o valor de x é usuado no atributo statusUsuario
    }
    public void editarPerfil(String login, String senha){

    }
    public void logout(){

    }
    public void autenticar(){

    }
}
