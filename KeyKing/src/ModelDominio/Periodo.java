package ModelDominio;


import java.util.Date;

public class Periodo {
    private Agendamento agendamento; //relacionamento - obrigado ter um agendamento para o periodo
    private String turno;

    public Periodo(String turno) {
        this.setTurno(turno);
    }
    public String getTurno(){
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
