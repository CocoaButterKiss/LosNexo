package upc.edu.pe.repository.entities;

import javax.persistence.*;

@Entity
@Table(name = "lista_invitados")
public class ListInvitado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "reunion_id", nullable = false)
    private Reunion reunion;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public ListInvitado() {
        super();
    }

    public ListInvitado(Long id, Reunion reunion, Usuario usuario) {
        super();
        this.id = id;
        this.reunion = reunion;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Reunion getReunion() {
        return reunion;
    }

    public void setReunion(Reunion idReunion) {
        this.reunion = idReunion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario idUsuario) {
        this.usuario = idUsuario;
    }


}
