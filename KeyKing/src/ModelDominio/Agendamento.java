package ModelDominio;

import java.text.DateFormat;
import java.util.Date;


public class Agendamento {
    private Agendador agendador; //relacionamento - obrigado ter um agendador no agendamento
    private Periodo periodoAgendado; //relacionaneto - obrigado ter um periodo no agendamento
    private Sala sala;
    private Status status;
    private DateFormat dataRegistro;
    private DateFormat dataPego;
    private DateFormat dataEntregue;
    private String observacoes;

    public Agendamento(Sala sala, DateFormat dataRegistro, DateFormat dataEntregue, DateFormat dataPego, Agendador agendador, Periodo periodo){
        this.setSala(sala);
        this.setDataEntregue(dataEntregue);
        this.setDataPego(dataPego);
        this.setAgendador(agendador);
        this.setPeriodoAgendado(periodo);
        this.setDataRegistro(dataRegistro);
    }

    public Agendamento(String sala, Date dateRegistro, Date datePego, Date dateEntregue, String agendador, String periodo) {
    }

    public Status getStatus() {
        return status;
    }

    public DateFormat getDataRegistro() {
        return dataRegistro;
    }

    public DateFormat getDataPego() {
        return dataPego;
    }

    public DateFormat getDataEntregue() {
        return dataEntregue;
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

    public void setDataEntregue(DateFormat dataEntregue) {
        this.dataEntregue = dataEntregue;
    }

    public void setDataPego(DateFormat dataPego) {
        this.dataPego = dataPego;
    }

    public void setDataRegistro(DateFormat dataRegistro) {
        this.dataRegistro = dataRegistro;
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
