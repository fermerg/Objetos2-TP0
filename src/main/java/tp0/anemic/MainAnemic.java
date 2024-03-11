package tp0.anemic;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainAnemic {

    public static void main(String[] args) {
        TiempoAnemic tiempoAnemic = new TiempoAnemic();

        String fechaLarga = tiempoAnemic.getFecha().format(DateTimeFormatter.ofPattern("EEEE dd 'de ' MMMM 'de ' yyyy 'a las ' hh:mm:ss").withLocale(new Locale("es", "ES")));
        String fechaCorta = tiempoAnemic.getFecha().format(DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy 'a las ' hh:mm:ss"));

        System.out.println("Fecha larga: " + fechaLarga);
        System.out.println("Fecha corta: " + fechaCorta);
    }
}