package upc.edu.pe.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Sugerencia")
public class Sugerencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSugerencia;
	
	@Column(name = "descripcionSug", nullable = false, length = 60)
	private String descripcionSug;
	
	@ManyToOne
	@JoinColumn(name = "idReunion", nullable = false)
	private Reunion reunion;

	public Sugerencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sugerencia(int idSugerencia, String descripcionSug, Reunion reunion) {
		super();
		this.idSugerencia = idSugerencia;
		this.descripcionSug = descripcionSug;
		this.reunion = reunion;
	}

	public int getIdSugerencia() {
		return idSugerencia;
	}

	public void setIdSugerencia(int idSugerencia) {
		this.idSugerencia = idSugerencia;
	}

	public String getDescripcionSug() {
		return descripcionSug;
	}

	public void setDescripcionSug(String descripcionSug) {
		this.descripcionSug = descripcionSug;
	}

	public Reunion getReunion() {
		return reunion;
	}

	public void setReunion(Reunion reunion) {
		this.reunion = reunion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idSugerencia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sugerencia other = (Sugerencia) obj;
		return idSugerencia == other.idSugerencia;
	}
	
	
}
