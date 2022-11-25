package Views;

import ModelDominio.Administrador;

import java.util.List;
import Util.Keyboard;

public class ViewTableAdm extends View{
    private List<Administrador>administradores;

    public ViewTableAdm(List<Administrador> administradores) {
        this.administradores = administradores;
    }
    public int menuPrincipal(){
        System.out.println("0 - Voltar");
        System.out.println("1 - Listar administradores");
        System.out.println("2 - Adicionar administrador");
        System.out.println("3 - Adicionar coordenador");
        int i = Keyboard.leInteiro("Escolha uma opção: ");
        return i;
    }//menu principal do administrador

    public void printAdm(){
        System.out.println("------ > Administradores < ------");
        System.out.printf("%s %s \n", "Nome", "Login");
        for (Administrador adm: administradores){
            ViewAdm viewAdm = new ViewAdm(adm);
            viewAdm.imprimeAdm(adm.getNome(), adm.getLogin());
        }
    }//imprimte todos os adminstradores

}
