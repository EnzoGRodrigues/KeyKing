package Controller;

import Views.ViewAgendador;
import Views.ViewTableAgendador;
import DB.DB;
import ModelDominio.Agendador;

import javax.swing.plaf.PanelUI;

public class CtAgendador {
    private ViewTableAgendador viewTableAgendador;
    public CtAgendador(){
        viewTableAgendador = new ViewTableAgendador(DB.agendador);
    }

    public void menuPrincipal(){
        ViewTableAgendador.OpcoesViewAgendador op;
        do{
            op = viewTableAgendador.menuPrincipal();
            switch (op){
                case LISTAR:
                    listar();
                    break;
                case ADICIONAR:
                    cadastrar();
                    break;
                default:
                    break;
            }
        }while (op != ViewTableAgendador.OpcoesViewAgendador.VAZIO);
    }

    public void listar(){
        viewTableAgendador.printAgendador();
    }
    public void cadastrar(){
        String nome;
        String login;
        String senha;
        Agendador user;
        ViewAgendador viewAgendador = new ViewAgendador(null);
        nome = viewAgendador.leNome();
        senha = viewAgendador.leSenha();
        login = viewAgendador.leLogin();

        user = new Agendador(nome, senha, login);
        DB.agendador.add(user);
    }
}