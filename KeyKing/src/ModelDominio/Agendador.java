package ModelDominio;

import java.time.LocalTime;

public class Agendador extends Usuario {
    private Agendamento agendamento;
    public Agendador(String nome, String senha, String login) {
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
    public void editarPerfil(String login, String senha) {

    }
    public void logout() {

    }
    public void autenticar() {

    }
    public void agendarDataeHora() {

    }
    public String pesquisarDisponibilidade(String status) {

        return status;
    }
    public void criarAgendamentos(Sala sala, LocalTime dataHoraInicial, LocalTime dataHoraFinal) {

    }
}
