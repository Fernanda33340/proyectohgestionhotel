package umg.edu.sistemagestiondehotel.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "factura")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "reserva_id", unique = true)
    private Reserva reserva;

    private BigDecimal monto;

    private LocalDateTime fechaPago;

    private String metodoPago;

    //Constructor vacío (obligatorio para JPA)
    public Factura() {
    }

    //Constructor opcional
    public Factura(Reserva reserva, BigDecimal monto, LocalDateTime fechaPago, String metodoPago) {
        this.reserva = reserva;
        this.monto = monto;
    }

}