package Views;

import ModelDominio.Coordenador;
import ModelDominio.Sala;
import Util.Keyboard;

public class ViewCoordenador extends View{
    private Coordenador coordenador;
    private Sala sala;

    public ViewCoordenador(Coordenador c){
        coordenador = c;
    }

    public void imprimeCoordenador(){
        System.out.printf("%s %s\n", coordenador.getNome(), coordenador.getLogin());
    }
    public String leNomeSala(){
        return Keyboard.leString("Digite o nome da sala: ");
    }
    public String lePredio(){
        return Keyboard.leString("Digite o predio: ");
    }
    public String leAndar(){
        return Keyboard.leString("Digite o andar: ");
    }
    public String leLocalizacao(){
        return Keyboard.leString("Digite a localizacao: ");
    }
    public void imprimeSalas(){
        System.out.printf("%s %s %s %s \n", sala.getNome(), sala.getPredio(), sala.getAndar(), sala.getLocalizacao());
    }
}
