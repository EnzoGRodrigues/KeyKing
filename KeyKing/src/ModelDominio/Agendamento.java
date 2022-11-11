package ModelDominio;

import java.time.LocalTime;

public class Agendamento {
    private Agendador agendador; //relacionamento - obrigado ter um agendador no agendamento
    private Periodo periodoAgendado; //relacionaneto - obrigado ter um periodo no agendamento
    private Sala sala;
    private String status;
    private LocalTime dataHoraRegistro;
    private LocalTime dataHoraPego;
    private LocalTime dataHoraEntregue;
    private String observacoes;

    public Agendamento(Sala sala,LocalTime dataHoraRegistro, LocalTime dataHoraEntregue, LocalTime dataHoraPego, Agendador agendador, Periodo periodo){
        this.setSala(sala);
        this.setDataHoraEntregue(dataHoraEntregue);
        this.setDataHoraPego(dataHoraPego);
        this.setAgendador(agendador);
        this.setPeriodoAgendado(periodo);
        this.setDataHoraRegistro(dataHoraRegistro);
    }
    public String getStatus() {
        return status;
    }

    public LocalTime getDataHoraRegistro() {
        return dataHoraRegistro;
    }

    public LocalTime getDataHoraPego() {
        return dataHoraPego;
    }

    public LocalTime getDataHoraEntregue() {
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
    public void setStatus(String status) {
        this.status = status;
    }

    public void setDataHoraEntregue(LocalTime dataHoraEntregue) {
        this.dataHoraEntregue = dataHoraEntregue;
    }

    public void setDataHoraPego(LocalTime dataHoraPego) {
        this.dataHoraPego = dataHoraPego;
    }

    public void setDataHoraRegistro(LocalTime dataHoraRegistro) {
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
