package Views;

import ModelDominio.Coordenador;

import java.util.List;

public class ViewTableCoordenador extends View{
    private Coordenador coordenadores;

    public ViewTableCoordenador(List<Coordenador> coordenadores){

    }
    public void printCoordenador(){
        coordenadores = new Coordenador("Luccas", "147", "cc_lucas", true);
        coordenadores = new Coordenador("Rodrigo", "777", "rodri_jr", true);
        System.out.printf("%s %s \n", coordenadores.getNome(), coordenadores.getLogin());

    }
}
