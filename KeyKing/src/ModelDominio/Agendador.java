package ModelDominio;

import DB.DB;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public class Agendador extends Usuario {
    private Agendamento agendamento;
    private List<Agendamento> agendamentos;
    private List<Agendador> usuarios;
    public Agendador(String nome, String senha, String login) {
        super(nome, senha, login);
        agendamentos = new ArrayList<Agendamento>();
        usuarios = new ArrayList<Agendador>();
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
    public void editarPerfil(String login, String senha) {
        if(this.getLogin() == null && this.getSenha() == null){
            throw new RuntimeException("Login e senha não podem ser nulos");
        }else if (this.getLogin() == null || this.getSenha() == null){
            throw new RuntimeException("Login ou senha não podem ser nulos");
        }else{
            this.getLogin();
            this.getSenha();
        }

    }
    public void logout() {

    }
    public String pesquisarDisponibilidade(String status) {

        return status;
    }
    public void criarAgendamentos() {
        Agendamento a;
    }
    public void cadastrar(){
        Agendador user;
        user = new Agendador(getNome(), getSenha(), getLogin());
        DB.agendador.add(user);
    }
}
