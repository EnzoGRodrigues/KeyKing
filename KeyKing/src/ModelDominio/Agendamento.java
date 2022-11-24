package ModelDominio;

import java.text.DateFormat;


public class Agendamento {
    private Agendador agendador; //relacionamento - obrigado ter um agendador no agendamento
    private Periodo periodoAgendado; //relacionaneto - obrigado ter um periodo no agendamento
    private Sala sala;
    private Status status;
    private DateFormat dataHoraRegistro;
    private DateFormat dataHoraPego;
    private DateFormat dataHoraEntregue;
    private String observacoes;

    public Agendamento(Sala sala,DateFormat dataHoraRegistro, DateFormat dataHoraEntregue, DateFormat dataHoraPego, Agendador agendador, Periodo periodo){
        this.setSala(sala);
        this.setDataHoraEntregue(dataHoraEntregue);
        this.setDataHoraPego(dataHoraPego);
        this.setAgendador(agendador);
        this.setPeriodoAgendado(periodo);
        this.setDataHoraRegistro(dataHoraRegistro);
    }
    public Status getStatus() {
        return status;
    }

    public DateFormat getDataHoraRegistro() {
        return dataHoraRegistro;
    }

    public DateFormat getDataHoraPego() {
        return dataHoraPego;
    }

    public DateFormat getDataHoraEntregue() {
        return dataHoraEntregue;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Agendador getAgendador() {
        return agendador;
    }

    public Periodo getPeriodoAgendado() {
        return periodoAgendado;
    }
    public Sala getSala(){
        return sala;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public void setDataHoraEntregue(DateFormat dataHoraEntregue) {
        this.dataHoraEntregue = dataHoraEntregue;
    }

    public void setDataHoraPego(DateFormat dataHoraPego) {
        this.dataHoraPego = dataHoraPego;
    }

    public void setDataHoraRegistro(DateFormat dataHoraRegistro) {
        this.dataHoraRegistro = dataHoraRegistro;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    public Sala setSala(Sala sala){
        this.sala = sala;
        return sala;
    }
    public void setAgendador(Agendador agendador) {
        this.agendador = agendador;
    }
    public void setPeriodoAgendado(Periodo periodoAgendado) {
        this.periodoAgendado = periodoAgendado;
    }

}
