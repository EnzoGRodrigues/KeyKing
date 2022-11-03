package ModelDominio;

public class Agendador extends Usuario{
    private Agendamento agendamento;
    public Agendador(String nome, String email, String senha) {
        super(nome, email, senha);
    }
    public void login(String usuario, String senha){

    }
    public void editarPerfil(String usuario, String senha){

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
}
