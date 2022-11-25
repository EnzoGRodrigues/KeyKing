package Views;

import ModelDominio.Agendador;
import ModelDominio.Coordenador;
import Util.Keyboard;

public class ViewAgendador extends View{
    private Agendador agendador;
    private Coordenador coordenador;

    public ViewAgendador(Agendador a){
        agendador = a;
    }

    public String leNome(){
        return Keyboard.leString("Digite seu nome: ");
    }
    public String leSenha(){
        return Keyboard.leString("Digite sua senha: ");
    }
    public String leLogin(){
        return Keyboard.leString("Digite seu login: ");
    }
    public void imprimeAgendador(String nome, String login){
        System.out.printf("%s %s \n", agendador.getNome(), agendador.getLogin());
    }
}

