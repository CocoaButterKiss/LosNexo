package upc.edu.pe.entities;

import javax.persistence.*;

@Entity
@Table(name = "Notificacion")
public class Notificacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idNotificacion;
	
	@ManyToOne
	@JoinColumn(name = "idTipoNot", nullable = false)
	private TipoNotificacion idTipoNot;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario", nullable = false)
	private Usuario idUsuario;

	public Notificacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notificacion(int idNotificacion, TipoNotificacion idTipoNot, Usuario idUsuario) {
		super();
		this.idNotificacion = idNotificacion;
		this.idTipoNot = idTipoNot;
		this.idUsuario = idUsuario;
	}

	public int getIdNotificacion() {
		return idNotificacion;
	}

	public void setIdNotificacion(int idNotificacion) {
		this.idNotificacion = idNotificacion;
	}

	public TipoNotificacion getIdTipoNot() {
		return idTipoNot;
	}

	public void setIdTipoNot(TipoNotificacion idTipoNot) {
		this.idTipoNot = idTipoNot;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
