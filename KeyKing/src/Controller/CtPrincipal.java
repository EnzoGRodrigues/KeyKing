package Controller;

import Views.ViewPrincipal;
import Views.ViewPrincipal.OpcoesViewPrincipal;

public class CtPrincipal {
    private ViewPrincipal viewPrincipal = new ViewPrincipal();

    public CtPrincipal(){
    }
    public void menuPrincipal(){
        ViewPrincipal.OpcoesViewPrincipal op;
        do {
            op = this.viewPrincipal.menuPrincipal();
            switch (op){
                case ADMINISTRADOR:
                    this.ctAdm();
                    break;
                case COORDENADOR:
                    this.ctCoordenador();
                /*case AGENDADOR:
                    ctAgendador();
                    break;*/
            }
        }while (op != OpcoesViewPrincipal.VAZIO);
    }

    private void ctAdm(){
        CtAdm ctAdm = new CtAdm();
        ctAdm.menuPrincipalAdm();
    }
    private void ctCoordenador(){
        CtCoordenador ctCoordenador = new CtCoordenador();
        ctCoordenador.menuPrincipalC();
    }
    /*private void ctAgendador(){
        CtAgendador ctAgendador = new CtAgendador();
        ctAgendador.menuPrincipal();
    }*/
}
