package Views;

import ModelDominio.Administrador;

import java.util.List;

import ModelDominio.Coordenador;
import Util.Keyboard;

public class ViewTableAdm extends View{
    public static enum OpcoesViewAdm{VAZIO, LISTAR_ADM, LISTAR_CO, ADICIONARADM, ADCIONARCO}
    private List<Administrador>administradores;

    public ViewTableAdm(List<Administrador> administradores) {
        this.administradores = administradores;
    }
    public OpcoesViewAdm menuPrincipal(){
        OpcoesViewAdm op = OpcoesViewAdm.VAZIO;
        System.out.println("0 - Voltar");
        System.out.println("1 - Listar administradores");
        System.out.println("2 - Adicionar administrador");
        System.out.println("3 - Adicionar coordenador");
        int i = Keyboard.leInteiro("Escolha uma opção: ");
        op = ViewTableAdm.OpcoesViewAdm.values()[i];
        return op;
    }//menu principal do administrador

    public void printAdm(){
        System.out.println("------ > Administradores < ------");
        System.out.printf("%s %s \n", "Nome", "Login");
        for (Administrador adm: administradores){
            ViewAdm viewAdm = new ViewAdm(adm);
            viewAdm.imprimeAdm(adm.getNome(), adm.getLogin());
        }
    }//imprimte todos os adminstradores
    public void printCoordenador(){
        System.out.println("------ > Coordenadores < ------");
        System.out.printf("%s %s \n", "Nome", "Login");
        for (Coordenador c =)
    }

}
