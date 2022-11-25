package Test;

import DB.DB;
import ModelDominio.Administrador;
import ModelDominio.Agendador;
import ModelDominio.Coordenador;
import Views.ViewTableAdm;
import Views.ViewTableCoordenador;

public class Teste1 {
        public static void main(String[] args) {
        /*Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat hora = DateFormat.getTimeInstance();
        System.out.println(hora.format(data));*/

            DB.criaAdministrador();
            DB.criaCoordenador();
            DB.criarAgendador();
            //instanciando novos administradores
            Administrador adm;
            adm = new Administrador("leo", "aeae", "leozin");
            adm.cadastrarAdm();
            adm = new Administrador("kaisa", "kaisinha", "kaisaadc");
            adm.cadastrarAdm();

            //instanciando novos coordenadores
            Coordenador c;
            c = new Coordenador("Luccas", "147", "cc_lucas");
            c.cadastrarCoordenador();
            c = new Coordenador("Rodrigo", "777", "rodri_jr");
            c.cadastrarCoordenador();

            /*Agendador usuario;
            usuario = new Agendador("Sandro", "789", "s_andro");
            usuario.cadastrar(usuario);
            usuario = new Agendador("Silva", "369", "s_ilva");
            usuario.cadastrar(usuario);
            usuario = new Agendador("Tales", "951", "tl_es");
            usuario.cadastrar(usuario);
*/
            ViewTableAdm viewTableAdm = new ViewTableAdm(DB.administrador);
            viewTableAdm.printAdm();

            ViewTableCoordenador viewTableCoordenador = new ViewTableCoordenador((DB.coordenador));
            viewTableCoordenador.printCoordenadores();

            System.out.println("------> Testes que não devem passar <------");
            try {
                new Administrador(null, "123", "enzo_123");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            try {
                new Administrador("En", "123", "enzo_123");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            try {
                new Coordenador("Luccas", null, "cc_lucas");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            try {
                new Coordenador("Luccas", "1", "cc_lucas");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            try {
                new Agendador("Sandro", "789", null);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
}
