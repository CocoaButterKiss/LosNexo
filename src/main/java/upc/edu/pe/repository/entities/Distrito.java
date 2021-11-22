package upc.edu.pe.repository.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "distritos")

public class Distrito {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", nullable = false, length = 45)
	private String nombreDistrito;

	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Distrito(Long id, String nombreDistrito) {
		super();
		this.id = id;
		this.nombreDistrito = nombreDistrito;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long idDistrito) {
		this.id = idDistrito;
	}

	public String getNombreDistrito() {
		return nombreDistrito;
	}

	public void setNombreDistrito(String nombreDistrito) {
		this.nombreDistrito = nombreDistrito;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombreDistrito);
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
		return Objects.equals(id, other.id) && Objects.equals(nombreDistrito, other.nombreDistrito);
	}

	

}
