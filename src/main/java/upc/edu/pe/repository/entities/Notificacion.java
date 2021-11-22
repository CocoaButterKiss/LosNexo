package upc.edu.pe.repository.entities;

import javax.persistence.*;

@Entity
@Table(name = "notificaciones")
public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_tipo_notificacion", nullable = false)
    private TipoNotificacion idTipoNotificacion;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario idUsuario;

    public Notificacion() {
        super();
    }

    public Notificacion(Long id, TipoNotificacion idTipoNotificacion, Usuario idUsuario) {
        super();
        this.id = id;
        this.idTipoNotificacion = idTipoNotificacion;
        this.idUsuario = idUsuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long idNotificacion) {
        this.id = idNotificacion;
    }

    public TipoNotificacion getIdTipoNotificacion() {
        return idTipoNotificacion;
    }

    public void setIdTipoNotificacion(TipoNotificacion idTipoNot) {
        this.idTipoNotificacion = idTipoNot;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }


}
