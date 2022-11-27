package Controller;

import ModelDominio.Sala;
import Views.ViewCoordenador;
import Views.ViewTableSala;
import DB.DB;

public class CtSala {
    private ViewTableSala viewTableSala;
    Sala sala;

    public CtSala(){
        viewTableSala = new ViewTableSala(DB.salas);
    }

    public void menuPrincipal(){
        ViewTableSala.OpcoesViewSala op;
        do{
            op = viewTableSala.menuPrincipal();
            switch (op){
                case LISTAR:
                    listar();
                    break;
                case ADICIONAR:
                    adicionar();
                    break;
                default:
                    break;
            }
        }while (op != ViewTableSala.OpcoesViewSala.VAZIO);
    }
    public void listar(){
        viewTableSala.printSalas();
    }
    public void adicionar(){
        String nomeSala;
        String predio;
        String andar;
        String localizacao;
        Sala s;
        ViewCoordenador viewCoordenador = new ViewCoordenador(null);
        nomeSala = viewCoordenador.leNomeSala();
        predio = viewCoordenador.lePredio();
        andar = viewCoordenador.leAndar();
        localizacao = viewCoordenador.leLocalizacao();

        s = new Sala(nomeSala, predio, andar, localizacao, DB.coordenador.get(0));
        DB.salas.add(s);
    }
}
