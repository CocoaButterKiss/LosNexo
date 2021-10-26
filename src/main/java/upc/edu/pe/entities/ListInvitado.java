package upc.edu.pe.entities;

import javax.persistence.*;

@Entity
@Table(name = "ListInvitado")
public class ListInvitado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idListInvitado;
	
	@ManyToOne
	@JoinColumn(name = "idReunion", nullable = false)
	private Reunion idReunion;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario", nullable = false)
	private Usuario idUsuario;

	public ListInvitado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ListInvitado(int idListInvitado, Reunion idReunion, Usuario idUsuario) {
		super();
		this.idListInvitado = idListInvitado;
		this.idReunion = idReunion;
		this.idUsuario = idUsuario;
	}

	public int getIdListInvitado() {
		return idListInvitado;
	}

	public void setIdListInvitado(int idListInvitado) {
		this.idListInvitado = idListInvitado;
	}

	public Reunion getIdReunion() {
		return idReunion;
	}

	public void setIdReunion(Reunion idReunion) {
		this.idReunion = idReunion;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
