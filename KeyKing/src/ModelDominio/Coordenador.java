package ModelDominio;

import java.util.ArrayList;

public class Coordenador extends Usuario{
    private Sala sala;
    ArrayList<Sala>ListSalas;
    public Coordenador(String nome, String senha, String login) {
        super(nome, senha, login);
        ListSalas = new ArrayList<>();
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
    public void cadastrarSalas(Sala s){
        ListSalas.add(s);
    }
    public void aprovaAgendamento(Agendamento agendamento){
        Agendamento teste = agendamento;
        teste.setStatus(Status.APROVADO);
    }
    public void reprovaAgendamento(Agendamento agendamento){
        Agendamento teste = agendamento;
        teste.setStatus(Status.REPROVADO);
    }

}
