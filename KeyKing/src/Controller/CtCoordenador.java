package Controller;

import DB.DB;
import ModelDominio.Coordenador;
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
                case LISTAR:
                    listar();
                    break;
                case ADICIONAR_SALAS:
                    adicionarSalas();
                    break;
                case LOGAR:
                    logar();
                    break;
                default:
                    break;
            }
        }while (op != ViewTableCoordenador.OpcoesViewCoordenador.VAZIO);
    }

    private void listar(){
        viewTableCoordenador.printCoordenadores();
    }
    private void adicionarSalas(){
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
    private void logar(){
        String nome;
        String senha;
        String login;
        Coordenador c;
        ViewCoordenador viewCoordenador = new ViewCoordenador(null);
        nome = viewCoordenador.leNome();
        senha = viewCoordenador.leSenha();
        login = viewCoordenador.leLogin();

        c = new Coordenador(nome, senha, login);
        DB.coordenador.add(c);
    }
}
