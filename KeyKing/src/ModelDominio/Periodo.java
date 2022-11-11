package ModelDominio;

import java.time.LocalTime;

public class Periodo {
    private Agendamento agendamento; //relacionamento - obrigado ter um agendamento para o periodo
    private LocalTime dataHoraInicio;
    private LocalTime dataHoraFim;

    public Periodo(LocalTime dataHoraInicio, LocalTime dataHoraFim, Agendamento agendamento){
        this.setDataHoraInicio(dataHoraInicio);
        this.setDataHoraFim(dataHoraFim);
        this.setAgendamento(agendamento);
    }

    public LocalTime getDataHoraInicio(){
        return dataHoraInicio;
    }

    public LocalTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraInicio(LocalTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public void setDataHoraFim(LocalTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }
}
