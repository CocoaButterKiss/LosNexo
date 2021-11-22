package upc.edu.pe.repository.entities;


import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "reuniones")
public class Reunion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = 80)
    private String descripcion;

    @Column(name = "direccion", nullable = false, length = 45)
    private String direccion;

    @Column(name = "fecha_reunion", nullable = false)
    private LocalDateTime fechaReunion;

    @Column(name = "cantidad_max_invitados", nullable = false)
    private Integer invitadosMaxReu;

    @ManyToOne
    @JoinColumn(name = "id_distrito", nullable = false)
    private Distrito distrito;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_sugerencia", nullable = false)
    private Sugerencia sugerencia;

    @ManyToOne
    @JoinColumn(name = "id_valoracion", nullable = false)
    private Valoracion valoracion;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "reunion_id")
    private List<ListInvitado> listInvitados;

    public List<ListInvitado> getListInvitados() {
        return listInvitados;
    }

    public void setListInvitados(List<ListInvitado> listInvitados) {
        this.listInvitados = listInvitados;
    }

    public Reunion(Long id,
                   String nombre,
                   String descripcion,
                   String direccion,
                   LocalDateTime fechaReunion,
                   Integer invitadosMaxReu) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.fechaReunion = fechaReunion;
        this.invitadosMaxReu = invitadosMaxReu;
    }

    public Reunion() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDateTime getFechaReunion() {
        return fechaReunion;
    }

    public void setFechaReunion(LocalDateTime fechaReunion) {
        this.fechaReunion = fechaReunion;
    }

    public Integer getInvitadosMaxReu() {
        return invitadosMaxReu;
    }

    public void setInvitadosMaxReu(Integer invitadosMaxReu) {
        this.invitadosMaxReu = invitadosMaxReu;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
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

    public Sugerencia getSugerencia() {
        return sugerencia;
    }

    public void setSugerencia(Sugerencia sugerencia) {
        this.sugerencia = sugerencia;
    }

    public Valoracion getValoracion() {
        return valoracion;
    }

    public void setValoracion(Valoracion valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Reunion reunion = (Reunion) o;
        return id != null && Objects.equals(id, reunion.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
