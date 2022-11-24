package Views;

import ModelDominio.Administrador;

import java.util.List;

public class ViewTableAdm extends View{
    private Administrador administradores;

    public ViewTableAdm(List<Administrador> administrador) {
        super();
    }

    public void printAdm(){
        System.out.printf("%s %s \n", "Nome", "Login");
        }
}
