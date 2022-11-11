package ModelDominio;

import java.time.LocalTime;
import java.util.List;

public class Agendador extends Usuario{
    private Agendamento agendamento;
    private List<Agendamento> agendamentos;
    public Agendador(String nome, String email, String senha, String login) {
        super(nome, email, senha, login);
    }
    public void login(String email, String senha){

    }
    public void editarPerfil(String email, String senha){

    }
    public void logout(){

    }
    public void autenticar(){

    }
    public void agendarDataeHora(){

    }
    public String pesquisarDisponibilidade(String status){
        return status;
    }
    public void criarAgendamentos(Sala sala, LocalTime dataHoraInicial, LocalTime dataHoraFinal){

    }
    public List<Agendamento>agendamentos(){ //getAgendamentos
        return agendamentos;
    }
}
