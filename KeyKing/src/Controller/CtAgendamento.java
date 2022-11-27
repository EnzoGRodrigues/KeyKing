package Controller;

import DB.DB;
import ModelDominio.Agendamento;
import Views.ViewAgendamento;
import Views.ViewTableAgendamento;

import java.util.Date;

public class CtAgendamento {
    private ViewTableAgendamento viewTableAgendamento;
    Agendamento agendamento;

    public CtAgendamento(){
        viewTableAgendamento = new ViewTableAgendamento(DB.agendamento);

    }

    public void menuPrincipal(){
        ViewTableAgendamento.OpcoesViewAgendamento op;
        do {
            op = viewTableAgendamento.menuPrincipal();
            switch (op){
                case AGENDAR:
                    agendar();
                    break;
                case EXCLUIR:
                    excluir();
                    break;
                default:
                    break;
            }
        }while (op != ViewTableAgendamento.OpcoesViewAgendamento.VAZIO);
    }

    public void agendar(){
        String sala;
        Date dateRegistro;
        Date datePego;
        Date dateEntregue;
        String agendador;
        String periodo;
        Agendamento a;
        ViewAgendamento viewAgendamento = new ViewAgendamento(null);
        sala = viewAgendamento.leSala();
        dateRegistro = viewAgendamento.leDataRegistro();
        datePego = viewAgendamento.leDataPego();
        dateEntregue = viewAgendamento.leDataEntregue();
        agendador = viewAgendamento.leAgendador();
        periodo = viewAgendamento.lePeriodo();

        a = new Agendamento(sala, dateRegistro, datePego, dateEntregue, agendador, periodo);
        DB.agendamento.add(a);
    }
    public void excluir(){
        ViewTableAgendamento.OpcoesViewAgendamento agendamento1 = this.viewTableAgendamento.menuPrincipal();
        if(agendamento1 != null){
            DB.agendamento.remove(agendamento1);
        }

    }
}
