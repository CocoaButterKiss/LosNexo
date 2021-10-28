package upc.edu.pe.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usuarios")

public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;

	@Column(name = "nombreUsuario", length = 45, nullable = false)
	private String nombreUsuario;

	@Column(name = "correoUsuario", length = 60, nullable = false)
	private String correoUsuario;

	@Column(name = "contrasena", length = 10, nullable = false)
	private String contrasena;

	@Column(name = "edad", length = 2, nullable = false)
	private int edad;

	@Column(name = "descripcionUsuario", length = 60, nullable = false)
	private String descripcionUsuario;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idUsuario, String nombreUsuario, String correoUsuario, String contrasena, int edad,
			String descripcionUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.correoUsuario = correoUsuario;
		this.contrasena = contrasena;
		this.edad = edad;
		this.descripcionUsuario = descripcionUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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
		this.contrasena =contrasena;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
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
		return Objects.hash(contrasena, correoUsuario, descripcionUsuario, edad, idUsuario, nombreUsuario);
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
				&& Objects.equals(descripcionUsuario, other.descripcionUsuario) && edad == other.edad
				&& idUsuario == other.idUsuario && Objects.equals(nombreUsuario, other.nombreUsuario);
	}

	
}
