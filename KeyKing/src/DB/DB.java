package DB;

import ModelDominio.Agendamento;
import ModelDominio.Coordenador;
import ModelDominio.Periodo;
import ModelDominio.Sala;

import java.util.ArrayList;
import java.util.List;

public class DB {

    public static List<Coordenador> coordenador = new ArrayList<Coordenador>();
    public static List<Sala> salas = new ArrayList<Sala>();
    public static List<Periodo> periodo = new ArrayList<Periodo>();
    public static List<Agendamento> agendamento = new ArrayList<Agendamento>();


    public static void criaCoordenador(){
        //cadastro dos coordenadores
        Coordenador c;
        c = new Coordenador("Lucas","lucas@teste.com", "123","1");
        c = new Coordenador("Joao","joao@teste.com", "456","2");
        c = new Coordenador("Pedro","pedro@teste.com", "789","3");
        c = new Coordenador("Marcos","marcos@teste.com", "100","4");
        c = new Coordenador("Mateus","mateus@teste.com", "111","5");
    }
    /*public static void criaSalas(){
        //criando salas
        Sala s;
        s = new Sala("labin", "A", "Quinto", "Norte", "1");
        s = new Sala("museu", "B", "Quarto", "Sudeste","2");
        s = new Sala("biblio", "C", "Terceiro", "Sul","3");
        s = new Sala("labin2", "C", "Segundo", "Sul","4");
        s = new Sala("labin3", "B", "Primeiro", "Norte","5");
    }
*/
}






