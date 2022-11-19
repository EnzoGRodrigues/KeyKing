package DB;

import ModelDominio.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DB {

    public static List<Coordenador> coordenador = new ArrayList<Coordenador>();
    public static List<Administrador> administrador = new ArrayList<Administrador>();
    public static List<Sala> salas = new ArrayList<Sala>();
    public static List<Periodo> periodo = new ArrayList<Periodo>();
    public static List<Agendamento> agendamento = new ArrayList<Agendamento>();
    public static List<Agendador> agendador = new ArrayList<Agendador>();


    public static void criaAdministrador(){
        Administrador adm;
        adm = new Administrador("Sam","123","spnsam@teste.com");
        administrador.add(adm);
        adm = new Administrador("Gabriel","456","abcgabriel@teste.com");
        administrador.add(adm);
        adm = new Administrador("Ezequiel","789","godezequiel@teste.com");
        administrador.add(adm);
    }
    public static void criaCoordenador(){
        //cadastro dos coordenadores
        Coordenador c;
        c = new Coordenador("Lucas","111", "12ucas@teste.com");
        coordenador.add(c);
        c = new Coordenador("Joao","112", "456oao@teste.com");
        coordenador.add(c);
        c = new Coordenador("Pedro","113", "78pedro@teste.com");
        coordenador.add(c);
        c = new Coordenador("Marcos","114", "100marcos@teste.com");
        coordenador.add(c);
        c = new Coordenador("Mateus","115", "111mateus@teste.com");
        coordenador.add(c);
    }
    public static void criaSalas(){
        //criando salas
        Sala s;
        s = new Sala("labin", "A", "Quinto", "Norte", coordenador.get(0));
        salas.add(s);
        s = new Sala("museu", "B", "Quarto", "Sudeste",coordenador.get(1));
        salas.add(s);
        s = new Sala("biblio", "C", "Terceiro", "Sul",coordenador.get(2));
        salas.add(s);
        s = new Sala("labin2", "C", "Segundo", "Sul",coordenador.get(3));
        salas.add(s);
        s = new Sala("labin3", "B", "Primeiro", "Norte",coordenador.get(4));
        salas.add(s);
    }
    public static void criarPeriodo(){
        //criando periodos para agendamentos
        Periodo p;
        p = new Periodo("Manha");
        periodo.add(p);
        p = new Periodo("Tarde");
        periodo.add(p);
        p = new Periodo("Noite");
        periodo.add(p);
        p = new Periodo("Noite");
        periodo.add(p);
        p = new Periodo("Manha");
        periodo.add(p);

    }
    public static void criarAgendador(){
        Agendador usuario;
        usuario = new Agendador("Enzo","222","123enzo@gmail.com");
        agendador.add(usuario);
        usuario = new Agendador("Paulo","223","456paulo@gmail.com");
        agendador.add(usuario);
        usuario = new Agendador("Tiago","224","789tiago@gmail.com");
        agendador.add(usuario);
        usuario = new Agendador("Jose","225","111jose@gmail.com");
        agendador.add(usuario);
        usuario = new Agendador("Estevao","226","100estevao@gmail.com");
        agendador.add(usuario);
    }
    public static void criaAgendamentos(){
        Agendamento a;
        a = new Agendamento(salas.get(0), DateFormat.getDateTimeInstance(),DateFormat.getDateTimeInstance(),DateFormat.getDateTimeInstance(),agendador.get(0), periodo.get(0));
        agendamento.add(a);
        a = new Agendamento(salas.get(1), DateFormat.getDateTimeInstance(),DateFormat.getDateTimeInstance(),DateFormat.getDateTimeInstance(),agendador.get(1), periodo.get(1));
        agendamento.add(a);
        a = new Agendamento(salas.get(2), DateFormat.getDateTimeInstance(),DateFormat.getDateTimeInstance(),DateFormat.getDateTimeInstance(),agendador.get(2), periodo.get(2));
        agendamento.add(a);
        a = new Agendamento(salas.get(3), DateFormat.getDateTimeInstance(),DateFormat.getDateTimeInstance(),DateFormat.getDateTimeInstance(),agendador.get(3), periodo.get(3));
        agendamento.add(a);
        a = new Agendamento(salas.get(4), DateFormat.getDateTimeInstance(),DateFormat.getDateTimeInstance(),DateFormat.getDateTimeInstance(),agendador.get(4), periodo.get(4));
        agendamento.add(a);
    }
}






