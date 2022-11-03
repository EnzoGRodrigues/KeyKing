package ModelDominio;

import java.util.Date;

public class Agendamento {
    private Periodo periodo;
    private Salas salas;
    private String periodoAgendado;
    private String status;
    private Date dataHoraRegistro;
    private Date dataHoraPego;
    private Date dataHoraEntregue;
    private String observacoes;

    public Agendamento(Salas salas, Date dataHoraEntregue, Date dataHoraPego){
        this.setSalas(salas);
        this.setDataHoraEntregue(dataHoraEntregue);
        this.setDataHoraPego(dataHoraPego);
    }
    public String getPeriodoAgendado(){
        return periodoAgendado;
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

    public void setPeriodoAgendado(String periodoAgendado) {
        this.periodoAgendado = periodoAgendado;
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
    public Salas getSalas(){
        return salas;
    }
    public Salas setSalas(Salas salas){
        this.salas = salas;
        return salas;
    }
}
