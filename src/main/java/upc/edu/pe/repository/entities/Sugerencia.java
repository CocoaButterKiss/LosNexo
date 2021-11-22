package upc.edu.pe.repository.entities;

import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sugerencias")
public class Sugerencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSugerencia;
	
	@Column(name = "descripcion", nullable = false, length = 60)
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "reunion_id", nullable = false)
	private Reunion reunion;

	public Sugerencia() {
		super();
	}

	public Sugerencia(Long idSugerencia, String descripcion, Reunion reunion) {
		super();
		this.idSugerencia = idSugerencia;
		this.descripcion = descripcion;
		this.reunion = reunion;
	}

	public Long getIdSugerencia() {
		return idSugerencia;
	}

	public void setIdSugerencia(Long idSugerencia) {
		this.idSugerencia = idSugerencia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcionSug) {
		this.descripcion = descripcionSug;
	}

	public Reunion getReunion() {
		return reunion;
	}

	public void setReunion(Reunion reunion) {
		this.reunion = reunion;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		Sugerencia that = (Sugerencia) o;
		return idSugerencia != null && Objects.equals(idSugerencia, that.idSugerencia);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
