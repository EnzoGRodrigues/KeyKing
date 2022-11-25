package Controller;

import Views.ViewPrincipal;

public class CtPrincipal {
    private ViewPrincipal viewPrincipal;

    public CtPrincipal(){
        viewPrincipal = new ViewPrincipal();
    }
    public void menuPrincipal(){
        ViewPrincipal.OpcoesViewPrincipal op;
        do {
            op = viewPrincipal.menuPrincipal();
            switch (op){
                case ADMINISTRADOR:
                    ctAdm();
                    break;
                case COORDENADOR:
                    ctCoordenador();
                    break;
                /*case AGENDADOR:
                    ctAgendador();
                    break;*/
                default:
                    break;
            }
        }while (op != ViewPrincipal.OpcoesViewPrincipal.VAZIO);
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
