package Views;

import ModelDominio.Agendador;
import Util.Keyboard;

import java.util.List;

public class ViewTableAgendador {
    public static enum OpcoesViewAgendador{VAZIO, LISTAR, ADICIONAR}
    private List<Agendador> agendadores;

    public ViewTableAgendador(List<Agendador> agendadores) {
        this.agendadores = agendadores;
    }
    public OpcoesViewAgendador menuPrincipal(){
        OpcoesViewAgendador op = OpcoesViewAgendador.VAZIO;
        System.out.println("0 - Voltar");
        System.out.println("1 - Listar agendadores");
        System.out.println("2 - Agendar data");
        int i = Keyboard.leInteiro("Escolha uma opção: ");
        op = OpcoesViewAgendador.values()[i];
        return op;
    }//menu principal do agendador

    public void printAgendador(){
        System.out.println("------ > Agendadores < ------");
        System.out.printf("%s %s \n", "Nome", "Login");
        for (Agendador a: agendadores){
            ViewAgendador viewAgendador = new ViewAgendador(a);
            viewAgendador.imprimeAgendador(a.getNome(), a.getLogin());
        }
    }//imprimte todos os agendadores
}
