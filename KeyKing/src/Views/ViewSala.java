package Views;

import ModelDominio.Sala;
import Util.Keyboard;

public class ViewSala extends View{
    Sala sala;
    public ViewSala(Sala s){
        sala = s;
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
    public void imprimeSalas(String nome, String predio, String andar, String localizacao){
        System.out.printf("%s %s %s %s \n", sala.getNome(), sala.getPredio(), sala.getAndar(), sala.getLocalizacao());
    }
}
