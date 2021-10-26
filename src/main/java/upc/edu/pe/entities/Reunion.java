package upc.edu.pe.entities;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "Reunion")
public class Reunion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idReunion;
	
	@Column(name = "nombreReu", nullable = false, length = 45)
	private String nombreReu;
	
	@Column(name = "descripcionReu", nullable = false, length = 80)
	private String descripcionReu;
	
	@ManyToOne
	@JoinColumn(name = "idDistrito", nullable = false)
	private Distrito distrito;
	
	@Column(name = "direccionReu", nullable = false, length = 45)
	private String direccionReu;
	
	private Date fechaReu;
	
	//private Time HoraReu;
	
	@Column(name = "invitadosmaxReu", nullable = false)
	private int invitadosmaxReu;
	
	//@Column(name = "InvitadosReu", nullable = false)
	//private int InvitadosReu;
	
	@ManyToOne
	@JoinColumn(name = "idCategoria", nullable = false)
	private Categoria categoria;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario", nullable = false)
	private Usuario usuario;
	
	//@Column(name = "Tipo", nullable = false)
	//private boolean Tipo;
	
	//@Column(name = "Estado", nullable = false)
	//private boolean Estado;

	public Reunion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reunion(int idReunion, String nombreReu, String descripcionReu, Distrito distrito, String direccionReu,
			Date fechaReu, int invitadosmaxReu, Categoria categoria, Usuario usuario) {
		super();
		this.idReunion = idReunion;
		this.nombreReu = nombreReu;
		this.descripcionReu = descripcionReu;
		this.distrito = distrito;
		this.direccionReu = direccionReu;
		this.fechaReu = fechaReu;
		this.invitadosmaxReu = invitadosmaxReu;
		this.categoria = categoria;
		this.usuario = usuario;
	}

	public int getIdReunion() {
		return idReunion;
	}

	public void setIdReunion(int idReunion) {
		this.idReunion = idReunion;
	}

	public String getNombreReu() {
		return nombreReu;
	}

	public void setNombreReu(String nombreReu) {
		this.nombreReu = nombreReu;
	}

	public String getDescripcionReu() {
		return descripcionReu;
	}

	public void setDescripcionReu(String descripcionReu) {
		this.descripcionReu = descripcionReu;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public String getDireccionReu() {
		return direccionReu;
	}

	public void setDireccionReu(String direccionReu) {
		this.direccionReu = direccionReu;
	}

	public Date getFechaReu() {
		return fechaReu;
	}

	public void setFechaReu(Date fechaReu) {
		this.fechaReu = fechaReu;
	}

	public int getInvitadosmaxReu() {
		return invitadosmaxReu;
	}

	public void setInvitadosmaxReu(int invitadosmaxReu) {
		this.invitadosmaxReu = invitadosmaxReu;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(categoria, descripcionReu, direccionReu, distrito, fechaReu, idReunion, invitadosmaxReu,
				nombreReu, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reunion other = (Reunion) obj;
		return Objects.equals(categoria, other.categoria) && Objects.equals(descripcionReu, other.descripcionReu)
				&& Objects.equals(direccionReu, other.direccionReu) && Objects.equals(distrito, other.distrito)
				&& Objects.equals(fechaReu, other.fechaReu) && idReunion == other.idReunion
				&& invitadosmaxReu == other.invitadosmaxReu && Objects.equals(nombreReu, other.nombreReu)
				&& Objects.equals(usuario, other.usuario);
	}

	
}
