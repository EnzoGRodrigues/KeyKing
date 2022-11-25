package Test;

import DB.DB;
import Views.ViewPrincipal;
import Views.ViewTableAdm;
import Views.ViewTableAgendador;
import Views.ViewTableCoordenador;

import java.util.ArrayList;


public class Teste2 {
    public Teste2(){
    }
    public static void main(String[] args) {
        System.out.println("------ > TESTE 2 < ------");

        DB.criaCoordenador();
        DB.criaAdministrador();
        System.out.println("USAR OPÇÃO 1");
        //opcao 1 visualiza administradores que existem no banco
        ViewPrincipal viewPrincipal = new ViewPrincipal();
        viewPrincipal.menuPrincipal();
        ViewTableAdm viewTableAdm = new ViewTableAdm(new ArrayList<>());
        viewTableAdm.menuPrincipal();
        viewTableAdm = new ViewTableAdm(DB.administrador);
        viewTableAdm.printAdm(); //funcao q lista administradores que tem no banco
        System.out.println("\nUSAR OPÇÃO 2");
        //opcao 2, visualiza coordenadores que existem no DB
        viewPrincipal = new ViewPrincipal();
        viewPrincipal.menuPrincipal();
        ViewTableCoordenador viewTableCoordenador = new ViewTableCoordenador(new ArrayList<>());
        viewTableCoordenador.menuPrincipal();
        viewTableCoordenador = new ViewTableCoordenador((DB.coordenador));
        viewTableCoordenador.printCoordenadores();
        System.out.println("USAR OPÇÃO 3");
        //opcao 3 visualiza todos os usuarios que existem no banco
        viewPrincipal = new ViewPrincipal();
        viewPrincipal.menuPrincipal();
        ViewTableAgendador viewTableAgendador = new ViewTableAgendador(new ArrayList<>());
        viewTableAgendador.printAgendador();
    }
}
