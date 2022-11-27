package Controller;


import DB.DB;
import ModelDominio.Administrador;
import ModelDominio.Coordenador;
import Views.ViewAdm;
import Views.ViewCoordenador;
import Views.ViewTableAdm;

public class CtAdm {
    private ViewTableAdm viewTableAdm;
    Coordenador coordenador;

    public CtAdm(){
        viewTableAdm = new ViewTableAdm(DB.administrador);
    }

    public void menuPrincipalAdm() {
        ViewTableAdm.OpcoesViewAdm op;
        do {
            op = viewTableAdm.menuPrincipal();
            switch (op) {
                case LISTAR_ADM:
                    listarAdm();
                    break;
                case LISTAR_CO:
                    listarCoordenador();
                    break;
                case ADICIONARADM:
                    adicionarAdministrador();
                    break;
                case ADCIONARCO:
                    adicionarCoordenador();
                    break;
                default:
                    break;
            }
        } while (op != ViewTableAdm.OpcoesViewAdm.VAZIO);
    }
    public void listarAdm(){
        viewTableAdm.printAdm();
    }
    public void adicionarAdministrador(){
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
    public void adicionarCoordenador(){
        String nome;
        String senha;
        String login;
        ViewAdm viewAdm = new ViewAdm(null);
        nome = viewAdm.leNome();
        senha = viewAdm.leSenha();
        login = viewAdm.leLogin();

        coordenador = new Coordenador(nome, senha, login);
        DB.coordenador.add(coordenador);
    }
    public void listarCoordenador(){
        System.out.println("------ > Coordenadores < ------");
        System.out.printf("%s %s \n", "Nome", "Login");
        for (Coordenador c:coordenador){
            ViewCoordenador viewCoordenador = new ViewCoordenador(c);
            System.out.printf("%s %s \n",coordenador.getNome(),coordenador.getLogin());

        }
    }
}
