package Views;

import ModelDominio.Administrador;
import ModelDominio.Coordenador;
import Util.Keyboard;

public class ViewAdm extends View{
    private Administrador administrador;
    private Coordenador coordenador;

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
    public void imprimeCoordenador(Coordenador c){
        System.out.printf("%s %s \n", coordenador.getNome(),coordenador.getLogin());
    }
}
