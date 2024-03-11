package tp0.record;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainRecord {
    public static void main(String[] args) {
        TiempoRecord tiempoRecord = new TiempoRecord(LocalDateTime.now());

        String fechaLarga = tiempoRecord.fecha().format(DateTimeFormatter.ofPattern("EEEE dd 'de ' MMMM 'de ' yyyy 'a las ' hh:mm:ss").withLocale(new Locale("es", "ES")));
        String fechaCorta = tiempoRecord.fecha().format(DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy 'a las ' hh:mm:ss"));

        System.out.println("Fecha y hora formato largo: " + fechaLarga);
        System.out.println("Fecha y hora formato corto: " + fechaCorta);
    }
}
