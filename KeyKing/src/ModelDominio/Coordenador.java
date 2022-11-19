package ModelDominio;

import java.util.List;

public class Coordenador extends Usuario{
    private Sala sala;
    public Coordenador(String nome, String senha, String login) {
        super(nome, senha, login);
    }
    public boolean login(String login, String senha){ // verificando login
        boolean x = false;
        if(this.getLogin().equals(login) && this.getSenha().equals(senha) == true){
            x= true;
        }
        if(this.getSenha().equals(senha) == false){
            x= false;
        }
        return x;
    }
    public void logout(){
        System.out.println("Logout realizado com sucesso!");
    }
    public void autenticar(){

    }
    public void cadastrarSalas(Sala nome, Sala predio, String andar, Sala localizacao){

    }
    public void inserirDataeHora(){

    }
    public void aprovaAgendamento(Agendamento a){

    }
    public void reprovaAgendamento(Agendamento a){

    }
}
