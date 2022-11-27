package Views;

import ModelDominio.Sala;
import Util.Keyboard;

import java.util.List;

public class ViewTableSala extends View{
    public static enum OpcoesViewSala{VAZIO, LISTAR, ADICIONAR}
    private List<Sala>salas;

    public ViewTableSala(List<Sala>salas){
        this.salas = salas;
    }

    public OpcoesViewSala menuPrincipal(){
        OpcoesViewSala op = OpcoesViewSala.VAZIO;
        System.out.println("**** MENU SALAS ****");
        System.out.println("0 - Voltar");
        System.out.println("1 - Listar salas");
        System.out.println("2 - Adicionar Salas");
        int i = Keyboard.leInteiro("Escolha uma opção: ");
        op = ViewTableSala.OpcoesViewSala.values()[i];
        return op;
    }//menu de salas que estarão dentro de coordenador
    public void printSalas(){
        System.out.println("------ > Salas < ------");
        System.out.printf("%s %s %s %s \n", "Nome", "Predio", "Andar", "Localizacao");
        for(Sala s: salas){
            ViewSala viewSala = new ViewSala(s);
            viewSala.imprimeSalas(s.getNome(),s.getPredio(),s.getAndar(),s.getLocalizacao());
        }
    }
}
