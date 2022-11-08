package ModelDominio;

import java.util.Date;

public class Agendamento {
    private Agendador agendador; //relacionamento um pra um com agendador
    private Periodo periodo; //relacionaneto um pra um com periodo
    private Salas salas;
    private String status;
    private Date dataHoraRegistro;
    private Date dataHoraPego;
    private Date dataHoraEntregue;
    private String observacoes;

    public Agendamento(Salas salas, Date dataHoraEntregue, Date dataHoraPego, Agendador agendador, Periodo periodo){
        this.setSalas(salas);
        this.setDataHoraEntregue(dataHoraEntregue);
        this.setDataHoraPego(dataHoraPego);
        this.setAgendador(agendador);
        this.setPeriodo(periodo);
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

    public Periodo getPeriodo() {
        return periodo;
    }
    public Salas getSalas(){
        return salas;
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
    public Salas setSalas(Salas salas){
        this.salas = salas;
        return salas;
    }
    public void setAgendador(Agendador agendador) {
        this.agendador = agendador;
    }
    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }
}
