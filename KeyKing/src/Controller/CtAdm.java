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

    public void menuPrincipalAdm() {
        int i;
        do {
            i = viewTableAdm.menuPrincipal();
            switch (i) {
                case 1:
                    listar();
                    break;
                case 2:
                    adicionarAdministrador();
                    break;
                case 3:
                    adicionarCoordenador();
                    break;
                default:
                    break;
            }
        } while (i == 0);
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
