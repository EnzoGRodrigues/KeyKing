package Views;

import ModelDominio.Agendamento;
import Util.Keyboard;

import java.util.Date;

public class ViewAgendamento extends View{
    private Agendamento agendamento;


    public ViewAgendamento(Agendamento a){
        this.agendamento = a;
    }
    public String leSala(){
        return Keyboard.leString("Digite o nome da sala: ");
    }
    public Date leDataRegistro(){
        return Keyboard.leData("Digite a data do registro: ");
    }
    public Date leDataPego(){
        return Keyboard.leData("Digite a data que pegou a chave: ");
    }
    public Date leDataEntregue(){
        return Keyboard.leData("Digite a data que entregou a chave: ");
    }
    public String leAgendador(){
        return Keyboard.leString("Digite o nome da sala: ");
    }
    public String lePeriodo(){
        return Keyboard.leString("Digite o nome da sala: ");
    }
    public void imprimeData(String nome, Date dataRegistro, Date dataPego, Date dataEntregue){
        System.out.printf("%s %s %s %s", agendamento.getSala(), agendamento.getDataRegistro(), agendamento.getDataPego(), agendamento.getDataEntregue());
    }

}
