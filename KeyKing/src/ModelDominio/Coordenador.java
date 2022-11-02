package ModelDominio;

public class Coordenador extends Usuario{
    private Salas salas;
    public Coordenador(String nome, String email, String senha, Salas salas) {
        super(nome, email, senha);
        this.salas = salas;
    }
    public void logar(String email, String senha){
        System.out.println("Login realizado com sucesso!");
    }
    public void deslogar(){
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
