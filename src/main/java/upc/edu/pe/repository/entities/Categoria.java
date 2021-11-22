package upc.edu.pe.repository.entities;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Objects;

@Entity
@Table(name = "categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre de la categoría no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre de la Categoría no puede contener un número")
	@Column(name = "nombre", length = 45, nullable = false)
	private String nombre;

	public Categoria() {
		super();
	}

	public Categoria(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long idCategoria) {
		this.id = idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombreCategoria) {
		this.nombre = nombreCategoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id) && Objects.equals(nombre, other.nombre);
	}

}
