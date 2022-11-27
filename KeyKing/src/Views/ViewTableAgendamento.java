package Views;

import ModelDominio.Agendamento;
import Util.Keyboard;

import java.util.List;

public class ViewTableAgendamento extends View{
    public static enum OpcoesViewAgendamento{VAZIO, AGENDAR, LISTAR, EXCLUIR}
    private List<Agendamento>agendamentos;

    public ViewTableAgendamento(List<Agendamento> agendamentos){
        this.agendamentos = agendamentos;
    }

    public OpcoesViewAgendamento menuPrincipal(){
        OpcoesViewAgendamento op = OpcoesViewAgendamento.VAZIO;
        System.out.println("**** MENU AGENDAMENTOS ****");
        System.out.println("0 - Voltar");
        System.out.println("1 - Agendar");
        System.out.println("2 - Listar"); //não consegui realizar essa implementacação
        System.out.println("3 - Excluir");
        int i = Keyboard.leInteiro("Escolha uma opção: ");
        op = ViewTableAgendamento.OpcoesViewAgendamento.values()[i];
        return op;
    }

    /*public void printAgendamentos(){
        System.out.println("------ > Agendamentos < ------");
        System.out.printf("%s %s %s %s %s \n", "Sala", "Status", "DataRegistro", "DataPego", "DataEntregue");
        for(Agendamento a: agendamentos){
            ViewAgendamento viewAgendamento = new ViewAgendamento(a);
            viewAgendamento.imprimeData(a.getSala(), a.getStatus(), a.getDataRegistro(), a.getDataPego(), a.getDataEntregue());
        }
    }*/
}
