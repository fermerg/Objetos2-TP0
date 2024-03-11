package tp0.record;

import java.time.LocalDateTime;

public record TiempoRecord(LocalDateTime fecha) {
    public TiempoRecord {
        if (fecha == null) {
            System.out.println("La fecha no puede ser nula");
        }
    }
}

//En esta implementación, TiempoRecord es un record que contiene un único campo fecha de tipo LocalDate.
// El constructor del record verifica si la fecha no es nula. Aunque se está utilizando un record, sigue siendo
// una implementación anémica, ya que solo contiene datos y no encapsula comportamiento relacionado con la fecha.