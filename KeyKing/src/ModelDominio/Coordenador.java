package ModelDominio;

import java.util.ArrayList;

public class Coordenador extends Usuario{
    private Sala sala;
    ArrayList<Sala>ListSalas;
    public Coordenador(String nome, String senha, String login, boolean statusUsuario) {
        super(nome, senha, login, statusUsuario);
        ListSalas = new ArrayList<>();
    }
    public boolean login(String login, String senha){
        boolean x = false;
        //verifica se getLogin é igual ao login recebido //verifica se getSenha é igual a senha recebida.
        if(this.getLogin().equals(login) && this.getSenha().equals(senha) == true){
            x= true;  //Se sim, x é true e isso autoriza o login.
        }
        if(this.getSenha().equals(senha) == false){
            x= false; //se x for false ele não vai logar
        }
        return x; //o valor de x é usuado no atributo statusUsuario
    }
    public void logout(){
        System.out.println("Logout realizado com sucesso!");
    }
    public void autenticar(){

    }
    public void cadastrarSalas(Sala s){
        ListSalas.add(s); //adiciona uma sala criada na lista
    }
    public void aprovaAgendamento(Agendamento agendamento){
        //puxa o valor aprovado do enum Status
        Agendamento teste = agendamento;
        teste.setStatus(Status.APROVADO);
    }
    public void reprovaAgendamento(Agendamento agendamento){
        //puxa o valor reprovado do enum Status
        Agendamento teste = agendamento;
        teste.setStatus(Status.REPROVADO);
    }

}
