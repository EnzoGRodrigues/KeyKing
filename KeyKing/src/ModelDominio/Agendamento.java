package ModelDominio;

import java.util.Date;

public class Agendamento {
    private Agendador agendador; //relacionamento - obrigado ter um agendador no agendamento
    private Periodo periodoAgendado; //relacionaneto - obrigado ter um periodo no agendamento
    private Sala sala;
    private String status;
    private Date dataHoraRegistro;
    private Date dataHoraPego;
    private Date dataHoraEntregue;
    private String observacoes;

    public Agendamento(Sala sala, Date dataHoraEntregue, Date dataHoraPego, Agendador agendador, Periodo periodo){
        this.setSala(sala);
        this.setDataHoraEntregue(dataHoraEntregue);
        this.setDataHoraPego(dataHoraPego);
        this.setAgendador(agendador);
        this.setPeriodoAgendado(periodo);
    }
    public String getStatus() {
        return status;
    }

    public Date getDataHoraRegistro() {
        return dataHoraRegistro;
    }

    public Date getDataHoraPego() {
        return dataHoraPego;
    }

    public Date getDataHoraEntregue() {
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

    public void setDataHoraEntregue(Date dataHoraEntregue) {
        this.dataHoraEntregue = dataHoraEntregue;
    }

    public void setDataHoraPego(Date dataHoraPego) {
        this.dataHoraPego = dataHoraPego;
    }

    public void setDataHoraRegistro(Date dataHoraRegistro) {
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
