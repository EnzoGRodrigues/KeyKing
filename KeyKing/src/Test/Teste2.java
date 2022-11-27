package Test;

import Controller.CtPrincipal;
import DB.DB;


public class Teste2 {
    public Teste2(){
    }
    public static void main(String[] args) {
        System.out.println("------ > TESTE 2 < ------");

        DB.criaCoordenador();
        DB.criaAdministrador();
        DB.criarAgendador();
        DB.criaSalas();
        //opcao 1 visualiza administradores que existem no banco
        CtPrincipal ctPrincipal = new CtPrincipal();
        ctPrincipal.menuPrincipal();
    }
}
