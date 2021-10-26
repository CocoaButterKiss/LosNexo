package upc.edu.pe.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Suscripcion")

public class Suscripcion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSuscripcion;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario", nullable = false)
	private Usuario Usuario;
	
	@Column(name = "NumeroTarjeta", nullable = false, length = 10)
	private int NumeroTarjeta;
	
	@Column(name = "Cvv", nullable = false, length = 4)
	private int Cvv;
	
	private Date SusInicio;
	private Date SusFin;
	
	@Column(name = "Importe", nullable = false)
	private float Importe;
	

	public Suscripcion() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Suscripcion(int idSuscripcion, upc.edu.pe.entities.Usuario usuario, int numeroTarjeta, int cvv,
			Date susInicio, Date susFin, float importe) {
		super();
		this.idSuscripcion = idSuscripcion;
		this.Usuario = usuario;
		this.NumeroTarjeta = numeroTarjeta;
		this.Cvv = cvv;
		this.SusInicio = susInicio;
		this.SusFin = susFin;
		this.Importe = importe;
	}



	public int getIdSuscripcion() {
		return idSuscripcion;
	}



	public void setIdSuscripcion(int idSuscripcion) {
		this.idSuscripcion = idSuscripcion;
	}



	public Usuario getUsuario() {
		return Usuario;
	}



	public void setUsuario(Usuario usuario) {
		Usuario = usuario;
	}



	public int getNumeroTarjeta() {
		return NumeroTarjeta;
	}



	public void setNumeroTarjeta(int numeroTarjeta) {
		NumeroTarjeta = numeroTarjeta;
	}



	public int getCvv() {
		return Cvv;
	}



	public void setCvv(int cvv) {
		Cvv = cvv;
	}



	public Date getSusInicio() {
		return SusInicio;
	}



	public void setSusInicio(Date susInicio) {
		SusInicio = susInicio;
	}



	public Date getSusFin() {
		return SusFin;
	}



	public void setSusFin(Date susFin) {
		SusFin = susFin;
	}



	public float getImporte() {
		return Importe;
	}



	public void setImporte(float importe) {
		Importe = importe;
	}

	
	
	
	
	
}
