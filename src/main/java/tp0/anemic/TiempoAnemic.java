package tp0.anemic;

import java.time.LocalDateTime;

public class TiempoAnemic {
    private LocalDateTime fecha;
    public TiempoAnemic(){
        this.fecha = LocalDateTime.now();
    }
    public LocalDateTime getFecha(){
        return this.fecha;
    }
}

// En la implementación anémica, la clase TiempoAnemic solo tiene atributos y métodos para acceder y modificar
// estos datos. No hay métodos que realicen operaciones relacionadas con la fecha, como formatearla.
// Esto se ajusta al concepto de Anemic Domain Model, donde las clases son solo contenedores de datos sin comportamiento.