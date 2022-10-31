package ModelDominio;

public class Coordenador extends Usuario{
    public Coordenador(String nome, String email, String senha) {
        super(nome, email, senha);
    }
    public void logar(String email, String senha){
        System.out.println("Login realizado com sucesso!");
    }
    public void deslogar(){
        System.out.println("Logout realizado com sucesso!");
    }
    public void autenticar(){

    }
    public void cadastrarSalas(String nome, String predio, String andar, String localizacao){
        //verificar se este método não tem que estar na classe Salas
    }
    public void listarSalas(String nome, String predio, String andar, String localizacao){
        //verificar se este método não tem que estar na classe Salas
    }
    public void inserirDataeHora(){

    }
    public void aprovaAgendamento(Agendamento a){
        //criar classe agendamento para conseguir passar o parâmetro
    }
}
