package Views;

import ModelDominio.Administrador;
import Util.Keyboard;

public class ViewAdm extends View{
    private Administrador administrador;

    public ViewAdm(Administrador adm){
        administrador = adm;
    }

    public String leNome(){
        return Keyboard.leString("Digite seu nome: ");
    }
    public String leSenha(){
        return Keyboard.leString("Digite sua senha: ");
    }
    public String leLogin(){
        return Keyboard.leString("Digite seu login: ");
    }
    public void imprimeAdm(String nome, String login){
        System.out.printf("%s %s \n", administrador.getNome(), administrador.getLogin());
    }
}
