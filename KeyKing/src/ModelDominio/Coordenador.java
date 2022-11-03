package ModelDominio;

public class Coordenador extends Usuario{
    private Salas salas;
    private Agendamento agendamento;
    public Coordenador(String nome, String email, String senha) {
        super(nome, email, senha);
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
    public void cadastrarSalas(Salas nome, Salas predio, String andar, Salas localizacao){

    }
    public void listarSalas(Salas nome, Salas predio, Salas andar, Salas localizacao){

    }
    public void inserirDataeHora(){

    }
    public void aprovaAgendamento(Agendamento a){
        //criar classe agendamento para conseguir passar o parâmetro
    }
}
