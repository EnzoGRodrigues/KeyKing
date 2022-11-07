package ModelDominio;

import java.util.Date;

public class Periodo {
    private Agendamento agendamento;
    private Date dataHoraInicio;
    private Date dataHoraFim;

    public Periodo(Date dataHoraInicio, Date dataHoraFim, Agendamento agendamento){
        this.setDataHoraInicio(dataHoraInicio);
        this.setDataHoraFim(dataHoraFim);
        this.setAgendamento(agendamento);
    }

    public Date getDataHoraInicio(){
        return dataHoraInicio;
    }

    public Date getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraInicio(Date dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public void setDataHoraFim(Date dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }
}
