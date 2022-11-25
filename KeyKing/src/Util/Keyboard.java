package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Keyboard {
    protected static Scanner teclado = new Scanner(System.in);

    public static String leString(String texto){
        System.out.println(texto);
        return teclado.nextLine();
    }
    public static char leChar(String texto){
        return leString(texto).charAt(0);
    }
    public static int leInteiro(String texto){
        String aux;
        int i=0;
        aux = leString(texto);
        try {
            i = Integer.parseInt(aux);
        }catch (Exception e){
            System.out.println("Erro ao ler o numero inteiro");
        }
        return i;
    }
    public static Date leData(String texto){
        String resp = "S";
        Date d = null;
        String aux = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (resp.equals("s") | resp.equals("S")){
            try {
                aux = leString(texto);
                d = sdf.parse(aux);
                resp = "n";
            }catch (ParseException e){
                System.out.println("Data invalida");
                resp = leString("Quer digitar novamente (S/N)?");
            }
        }
        return d;
    }
    public static void pressioneEnter(){
        System.out.println("Pressione ENTER para continuar");
        teclado.nextLine();
    }
}
