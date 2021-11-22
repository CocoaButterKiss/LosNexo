package upc.edu.pe.repository.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "suscripciones")

public class Suscripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(name = "numero_tarjeta", nullable = false, length = 10)
    private Integer numeroTarjeta;

    @Column(name = "cvv", nullable = false, length = 4)
    private Integer cvv;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;

    @Column(name = "importe", nullable = false)
    private BigDecimal importe;


    public Suscripcion() {
        super();
    }


    public Suscripcion(Long id, Usuario usuario, Integer numeroTarjeta, Integer cvv,
                       LocalDate fechaInicio, LocalDate fechaFin, BigDecimal importe) {
        super();
        this.id = id;
        this.usuario = usuario;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.importe = importe;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Usuario getUsuario() {
        return usuario;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }


    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }


    public int getCvv() {
        return cvv;
    }


    public void setCvv(int cvv) {
        this.cvv = cvv;
    }


    public LocalDate getFechaInicio() {
        return fechaInicio;
    }


    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    public LocalDate getFechaFin() {
        return fechaFin;
    }


    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }


    public BigDecimal getImporte() {
        return importe;
    }


    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }


}
