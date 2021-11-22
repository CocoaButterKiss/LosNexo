package upc.edu.pe.repository.entities;

import javax.persistence.*;

@Entity
@Table(name = "Valoracion")
public class Valoracion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idValoracion;
	
	@Column(name = "Resena", length = 60, nullable = false)
	private String Resena;
	
	@Column(name = "Puntuacion", length = 1, nullable = false)
	private int Puntuacion;
	
	@ManyToOne
	@JoinColumn(name = "idReunion", nullable = false)
	private Reunion Reunion;

	public Valoracion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Valoracion(int idValoracion, String resena, int puntuacion, upc.edu.pe.repository.entities.Reunion reunion) {
		super();
		this.idValoracion = idValoracion;
		this.Resena = resena;
		this.Puntuacion = puntuacion;
		this.Reunion = reunion;
	}

	public int getIdValoracion() {
		return idValoracion;
	}

	public void setIdValoracion(int idValoracion) {
		this.idValoracion = idValoracion;
	}

	public String getResena() {
		return Resena;
	}

	public void setResena(String resena) {
		Resena= resena;
	}

	public int getPuntuacion() {
		return Puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		Puntuacion = puntuacion;
	}

	public Reunion getReunion() {
		return Reunion;
	}

	public void setReunion(Reunion reunion) {
		Reunion = reunion;
	}
	
	
}
