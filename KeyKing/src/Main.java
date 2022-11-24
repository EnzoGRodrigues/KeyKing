import DB.DB;
import ModelDominio.Administrador;
import ModelDominio.Agendador;
import ModelDominio.Coordenador;
import Views.ViewTableAdm;
import Views.ViewTableCoordenador;

public class Main {
    public static void main(String[] args) {
        /*Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat hora = DateFormat.getTimeInstance();
        System.out.println(hora.format(data));*/
        System.out.println("------> Criando Usuario e Coordenadores <------");

        DB.criaAdministrador();
        DB.criaCoordenador();
        DB.criarAgendador();

        Administrador adm;
        adm = new Administrador("sadd", "qwer", "asdwf", true);


        Coordenador c; //cria 2 coordenadores
        c = new Coordenador("Luccas", "147", "cc_lucas", true);
        c = new Coordenador("Rodrigo", "777", "rodri_jr", true);

        Agendador usuario;
        usuario = new Agendador("Sandro", "789", "s_andro", true);
        usuario.cadastrar(usuario);
        usuario = new Agendador("Silva", "369", "s_ilva", true);
        usuario.cadastrar(usuario);
        usuario = new Agendador("Tales", "951", "tl_es", true);
        usuario.cadastrar(usuario);

        System.out.println("------> Visualizar tabelas <------");

        ViewTableAdm viewTableAdm = new ViewTableAdm(DB.administrador);
        viewTableAdm.printAdm();
        ViewTableCoordenador viewTableCoordenador = new ViewTableCoordenador(DB.coordenador);
        viewTableCoordenador.printCoordenador();

        System.out.println("------> Testes que não devem passar <------");
        try {
            adm = new Administrador(null, "123", "enzo_123", true);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            adm = new Administrador("En", "123", "enzo_123", true);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            c = new Coordenador("Luccas", null, "cc_lucas", true);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            c = new Coordenador("Luccas", "1", "cc_lucas", true);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            usuario = new Agendador("Sandro", "789", null, true);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}