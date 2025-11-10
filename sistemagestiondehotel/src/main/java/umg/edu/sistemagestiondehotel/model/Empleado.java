package umg.edu.sistemagestiondehotel.model;

import jakarta.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String puesto;
    private String usuario;
    private String correo;
    private String telefono;

    // Constructor vacío
    public Empleado() {}

    // Constructor con parámetros (opcional)
    public Empleado(String nombre, String puesto, String usuario, String correo, String telefono) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.usuario = usuario;
        this.correo = correo;
        this.telefono = telefono;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}
