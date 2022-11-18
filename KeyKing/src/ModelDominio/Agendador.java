package ModelDominio;

import java.time.LocalTime;
import java.util.List;

public class Agendador extends Usuario {
    private Agendamento agendamento;
    public Agendador(String nome, String email, String senha, String login) {
        super(nome, email, senha, login);
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
    public void editarPerfil(String email, String senha) {

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
