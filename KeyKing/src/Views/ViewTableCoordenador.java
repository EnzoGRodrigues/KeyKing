package Views;

import Controller.CtAdm;
import DB.DB;
import ModelDominio.Coordenador;
import Util.Keyboard;
import ModelDominio.Sala;

import java.util.List;

public class ViewTableCoordenador extends View{
    public static enum OpcoesViewCoordenador{VAZIO, LISTAR_CO, LISTAR_SALAS,ADICIONAR_SALAS}
    private List<Coordenador>coordenadores;
    private List<Sala>salas;

    public ViewTableCoordenador(List<Coordenador> coordenadores) {
        this.coordenadores = coordenadores;
    }
    public OpcoesViewCoordenador menuPrincipal(){
        OpcoesViewCoordenador op = OpcoesViewCoordenador.VAZIO;
        System.out.println("0 - Voltar");
        System.out.println("1 - Listar coordenadores");
        System.out.println("2 - Listar Salas");
        System.out.println("3 - Adicionar Salas");
        int i = Keyboard.leInteiro("Escolha uma opção: ");
        op = ViewTableCoordenador.OpcoesViewCoordenador.values()[i];
        return op;
    }//menu principal do coordenador

    public void printCoordenadores(){
        System.out.println("------ > Coordenadores < ------");
        DB.coordenador.listIterator();

        }
    }//imprimte todos os coordenadores
    /*public void printSalas(){
        System.out.println("------ > Salas < ------");
        System.out.printf("%s %s %s %s", "Nome", "Predio", "Andar", "Localizacao");
        for (Sala s = salas){
            ViewCoordenador viewCoordenador = new ViewCoordenador(s);
        }
    }*/
