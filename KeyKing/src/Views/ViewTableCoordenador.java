package Views;

import Controller.CtAdm;
import DB.DB;
import ModelDominio.Coordenador;
import Util.Keyboard;
import ModelDominio.Sala;

import java.util.List;

public class ViewTableCoordenador extends View{
    public static enum OpcoesViewCoordenador{VAZIO, LISTAR_CO, SALAS}
    private List<Coordenador>coordenadores;
    private List<Sala>salas;

    public ViewTableCoordenador(List<Coordenador> coordenadores) {
        this.coordenadores = coordenadores;
    }
    public OpcoesViewCoordenador menuPrincipal(){
        OpcoesViewCoordenador op = OpcoesViewCoordenador.VAZIO;
        System.out.println("**** MENU COORDENADOR ****");
        System.out.println("0 - Voltar");
        System.out.println("1 - Listar coordenadores");
        System.out.println("2 - Salas");
        int i = Keyboard.leInteiro("Escolha uma opção: ");
        op = ViewTableCoordenador.OpcoesViewCoordenador.values()[i];
        return op;
    }//menu principal do coordenador

    public void printCoordenadores(){
        System.out.println("------ > Coordenadores < ------");
        for(Coordenador c: coordenadores){
            ViewCoordenador viewCoordenador = new ViewCoordenador(c);
            viewCoordenador.imprimeCoordenador();
        }
     }//imprimte todos os coordenadores
}

