package DB;

import ModelDominio.Agendamento;
import ModelDominio.Coordenador;
import ModelDominio.Periodo;
import ModelDominio.Salas;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class DB {

    public static List<Coordenador> coordenador = new ArrayList<Coordenador>();
    public static List<Salas> salas = new ArrayList<Salas>();
    public static List<Periodo> periodo = new ArrayList<Periodo>();
    public static List<Agendamento> agendamento = new ArrayList<Agendamento>();


    public static void criaCoordenador(){
        //cadastro dos coordenadores
        Coordenador c;
        c = new Coordenador("Lucas","lucas@teste.com", "123");
        c = new Coordenador("Joao","joao@teste.com", "456");
        c = new Coordenador("Pedro","pedro@teste.com", "789");
        c = new Coordenador("Marcos","marcos@teste.com", "100");
        c = new Coordenador("Mateus","mateus@teste.com", "111");
    }
    public static void criaSalas(){
        //criando salas
        Salas s;
        s = new Salas("labin", "A", "Quinto", "Norte");
        s = new Salas("museu", "B", "Quarto", "Sudeste");
        s = new Salas("biblio", "C", "Terceiro", "Sul");
        s = new Salas("labin2", "C", "Segundo", "Sul");
        s = new Salas("labin3", "B", "Primeiro", "Norte");
    }

}






