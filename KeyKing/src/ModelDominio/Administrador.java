package ModelDominio;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Usuario{
    private List<Coordenador>coordenadores;
    private List<Administrador>administradores;
    public Administrador(String nome, String senha, String login, boolean statusUsuario){
        super (nome, senha, login, statusUsuario);
        coordenadores = new ArrayList<Coordenador>();
        administradores = new ArrayList<Administrador>();
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
    public void logout(){
        System.out.println("Logout realizado.");

    }
    public void cadastrarCoordenador(Coordenador c){
        coordenadores.add(c);
        /*this.setNome(nome);
        this.setSenha(senha);
        this.setLogin(login);*/
    }
    public void cadastrarAdm(Administrador administrador){
        administradores.add(administrador);
    }
}
