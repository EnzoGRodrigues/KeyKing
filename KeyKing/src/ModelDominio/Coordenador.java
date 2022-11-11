package ModelDominio;

import java.util.List;

public class Coordenador extends Usuario{
    private Sala sala;
    private List<Sala> salas;
    public Coordenador(String nome, String email, String senha, String login) {
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
    public void logout(){
        System.out.println("Logout realizado com sucesso!");
    }
    public void autenticar(){

    }
    public void cadastrarSalas(Sala nome, Sala predio, String andar, Sala localizacao){

    }
   public List<Sala>salas(){
        return salas;
   }
    public void inserirDataeHora(){

    }
    public void aprovaAgendamento(Agendamento a){

    }
    public void reprovaAgendamento(Agendamento a){

    }
}
