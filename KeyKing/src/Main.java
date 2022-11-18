import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat hora = DateFormat.getTimeInstance();
        System.out.println(hora.format(data));
    }
}