package upc.edu.pe.repository.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "usuarios")

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_usuario", length = 45, nullable = false)
    private String nombreUsuario;

    @Column(name = "correo_usuario", length = 60, nullable = false)
    private String correoUsuario;

    @NotEmpty
    @Size(max = 10, min = 1, message = "La contraseña debe tener un máximo de 10 caracteres!")
    @Column(name = "contrasena", length = 10, nullable = false)
    private String contrasena;

    @NotEmpty
    @Column(name = "edad", length = 2, nullable = false)
    private Integer edad;

    @Column(name = "descripcion_usuario", length = 60, nullable = false)
    private String descripcionUsuario;

    public Usuario() {
        super();
    }

    public Usuario(Long id, String nombreUsuario, String correoUsuario, String contrasena, Integer edad,
                   String descripcionUsuario) {
        super();
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.correoUsuario = correoUsuario;
        this.contrasena = contrasena;
        this.edad = edad;
        this.descripcionUsuario = descripcionUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idUsuario) {
        this.id = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDescripcionUsuario() {
        return descripcionUsuario;
    }

    public void setDescripcionUsuario(String descripcionUsuario) {
        this.descripcionUsuario = descripcionUsuario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(contrasena, correoUsuario, descripcionUsuario, edad, id, nombreUsuario);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        return Objects.equals(contrasena, other.contrasena) && Objects.equals(correoUsuario, other.correoUsuario)
                && Objects.equals(descripcionUsuario, other.descripcionUsuario) && Objects.equals(edad, other.edad)
                && Objects.equals(id, other.id) && Objects.equals(nombreUsuario, other.nombreUsuario);
    }


}
