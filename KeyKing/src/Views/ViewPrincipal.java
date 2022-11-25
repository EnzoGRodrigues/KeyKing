package Views;


import Util.Keyboard;

public class ViewPrincipal extends View{
    public ViewPrincipal(){

    }
    public OpcoesViewPrincipal menuPrincipal(){
        OpcoesViewPrincipal op = OpcoesViewPrincipal.VAZIO;
        System.out.println("0 - Sair");
        System.out.println("1 - Administrador");
        System.out.println("2 - Coordenador");
        System.out.println("3 - Agendador");
        int i = Keyboard.leInteiro("Escolha uma opção: ");
        op = ViewPrincipal.OpcoesViewPrincipal.values()[i];
        return op;
    }
    public static enum OpcoesViewPrincipal{
        VAZIO,
        ADMINISTRADOR,
        COORDENADOR,
        AGENDADOR;
        private OpcoesViewPrincipal(){
        }
    }
}
