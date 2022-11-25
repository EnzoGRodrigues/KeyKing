package Controller;


import DB.DB;
import ModelDominio.Administrador;
import ModelDominio.Coordenador;
import Views.ViewAdm;
import Views.ViewTableAdm;

public class CtAdm {
    private ViewTableAdm viewTableAdm;

    public CtAdm(){
        viewTableAdm = new ViewTableAdm(DB.administrador);
    }

    public void menuPrincipalAdm(){
        ViewTableAdm.OpcoesViewAdm op;
        do{
            op = viewTableAdm.menuPrincipal();
            switch (op){
                case LISTAR:
                    listar();
                    break;
                case ADICIONAR:
                    adicionarAdministrador();
                    break;
                case ADICIONARCO:
                    adicionarCoordenador();
                    break;
                default:
                    break;
            }
        }while (op != ViewTableAdm.OpcoesViewAdm.VAZIO);
    }
    private void listar(){
        viewTableAdm.printAdm();
    }
    private void adicionarAdministrador(){
        String nome;
        String senha;
        String login;
        Administrador adm;
        ViewAdm viewAdm = new ViewAdm(null);
        nome = viewAdm.leNome();
        senha = viewAdm.leSenha();
        login = viewAdm.leLogin();

        adm = new Administrador(nome, senha, login);
        DB.administrador.add(adm);
    }//adiciona administradores
    private void adicionarCoordenador(){
        String nome;
        String senha;
        String login;
        Coordenador c;
        ViewAdm viewAdm = new ViewAdm(null);
        nome = viewAdm.leNome();
        senha = viewAdm.leSenha();
        login = viewAdm.leLogin();

        c = new Coordenador(nome, senha, login);
        DB.coordenador.add(c);
    }
}
