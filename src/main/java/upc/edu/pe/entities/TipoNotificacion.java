package upc.edu.pe.entities;

import javax.persistence.*;

@Entity
@Table(name = "TipoNotificacion")
public class TipoNotificacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoNot;
	
	@Column(name = "NombreNot", length = 40, nullable = false)
	private String NombreNot;
	
	@Column(name = "DescripcionNot", length = 100, nullable = false)
	private String DescripcionNot;

	public TipoNotificacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoNotificacion(int idTipoNot, String nombreNot, String descripcionNot) {
		super();
		this.idTipoNot = idTipoNot;
		this.NombreNot = nombreNot;
		this.DescripcionNot = descripcionNot;
	}

	public int getIdTipoNot() {
		return idTipoNot;
	}

	public void setIdTipoNot(int idTipoNot) {
		this.idTipoNot = idTipoNot;
	}

	public String getNombreNot() {
		return NombreNot;
	}

	public void setNombreNot(String nombreNot) {
		NombreNot = nombreNot;
	}

	public String getDescripcionNot() {
		return DescripcionNot;
	}

	public void setDescripcionNot(String descripcionNot) {
		DescripcionNot = descripcionNot;
	}
	
	
}
