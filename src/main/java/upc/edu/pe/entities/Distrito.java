package upc.edu.pe.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Distrito")

public class Distrito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDistrito;
	
	@Column(name = "nombreDistrito", nullable = false, length = 45)
	private String nombreDistrito;

	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Distrito(int idDistrito, String nombreDistrito) {
		super();
		this.idDistrito = idDistrito;
		this.nombreDistrito = nombreDistrito;
	}

	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getNombreDistrito() {
		return nombreDistrito;
	}

	public void setNombreDistrito(String nombreDistrito) {
		this.nombreDistrito = nombreDistrito;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idDistrito, nombreDistrito);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Distrito other = (Distrito) obj;
		return idDistrito == other.idDistrito && Objects.equals(nombreDistrito, other.nombreDistrito);
	}

	

}
