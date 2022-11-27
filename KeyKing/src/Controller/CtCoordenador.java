package Controller;

import DB.DB;
import ModelDominio.Sala;
import Views.ViewCoordenador;
import Views.ViewTableCoordenador;

public class CtCoordenador {
    private ViewTableCoordenador viewTableCoordenador;

    public CtCoordenador(){
        viewTableCoordenador = new ViewTableCoordenador(DB.coordenador);
    }

    public void menuPrincipalC(){
        ViewTableCoordenador.OpcoesViewCoordenador op;
        do{
            op = viewTableCoordenador.menuPrincipal();
            switch (op){
                case LISTAR_CO:
                    listar();
                    break;
                /*case ADICIONAR_SALAS:
                    adicionarSalas();
                    break;*/
                case SALAS:
                    salas();
                    break;
                default:
                    break;
            }
        }while (op != ViewTableCoordenador.OpcoesViewCoordenador.VAZIO);
    }

    public void listar(){
        viewTableCoordenador.printCoordenadores();
    }
    public void adicionarSalas(){
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
    public void salas(){
        CtSala ctSala = new CtSala();
        ctSala.menuPrincipal();
    }
}
