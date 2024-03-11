package tp0.oo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Tiempo {
    private LocalDateTime dateTime;
    public Tiempo(){
        this.dateTime = LocalDateTime.now();
    }
    public void imprimirFechaLargo(){
        System.out.println("Fecha y hora actuales en formato largo: " +
                dateTime.format(
                        DateTimeFormatter.ofPattern("EEEE dd 'de ' MMMM 'de ' yyyy 'a las ' hh:mm:ss")
                                .withLocale(new Locale("es", "ES"))));
    }
    public void imprimirFechaCorto(){
        System.out.println("Fecha y hora actuales en formato corto: " +
                dateTime.format(
                        DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy 'a las ' hh:mm:ss")));
    }
}

//En la implementación no anémica, la clase Tiempo tiene métodos que realizan operaciones relacionadas con la fecha.
// La clase encapsula el comportamiento relacionado con la fecha y proporciona métodos para interactuar con ella,
// lo que cumple con los principios de encapsulamiento y cohesión del Paradigma Orientado a Objetos.