package Views;

import ModelDominio.Agendador;
import ModelDominio.Agendamento;

public class ViewAgendamento extends View{
    private Agendamento agendamento;

    public ViewAgendamento(Agendamento a){
        this.agendamento = a;
    }

}
