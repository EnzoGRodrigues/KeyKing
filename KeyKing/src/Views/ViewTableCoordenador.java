package Views;

import ModelDominio.Administrador;
import ModelDominio.Coordenador;
import Util.Keyboard;

import java.util.List;

public class ViewTableCoordenador extends View{
    public static enum OpcoesViewCoordenador{VAZIO, LISTAR, LOGAR, ADICIONAR_SALAS}
    private List<Coordenador>coordenadores;

    public ViewTableCoordenador(List<Coordenador> coordenadores) {
        this.coordenadores = coordenadores;
    }
    public OpcoesViewCoordenador menuPrincipal(){
        OpcoesViewCoordenador op = OpcoesViewCoordenador.VAZIO;
        System.out.println("0 - Voltar");
        System.out.println("1 - Listar coordenadores");
        System.out.println("2 - Adicionar salas");
        System.out.println("3 - Adicionar salas");
        int i = Keyboard.leInteiro("Escolha uma opção: ");
        op = ViewTableCoordenador.OpcoesViewCoordenador.values()[i];
        return op;
    }//menu principal do coordenador

    public void printCoordenadores(){
        System.out.println("------ > Coordenadores < ------");
        System.out.printf("%s %s \n", "Nome", "Login");
        for (Coordenador c: coordenadores){
            ViewCoordenador viewCoordenador = new ViewCoordenador(c);
            viewCoordenador.imprimeCoordenador(c.getNome(), c.getLogin());
        }
    }//imprimte todos os coordenadores
}
