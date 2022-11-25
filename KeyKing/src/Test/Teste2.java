package Test;

import DB.DB;
import Views.ViewPrincipal;


public class Teste2 {
    public Teste2(){
    }
    public static void main(String[] args) {
        System.out.println("------ > TESTE 2 < ------");

        DB.criaCoordenador();
        DB.criaAdministrador();

        ViewPrincipal viewPrincipal = new ViewPrincipal();
        viewPrincipal.menuPrincipal();
    }
}
