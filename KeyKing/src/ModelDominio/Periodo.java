package ModelDominio;

import java.util.Date;

public class Periodo {
    private Date dataHoraInicio;
    private Date dataHoraFim;

    public Periodo(Date dataHoraInicio, Date dataHoraFim){
        this.setDataHoraInicio(dataHoraInicio);
        this.setDataHoraFim(dataHoraFim);
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
}
