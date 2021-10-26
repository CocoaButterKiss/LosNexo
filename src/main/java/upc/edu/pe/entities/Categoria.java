package upc.edu.pe.entities;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Objects;

@Entity
@Table(name = "Categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategoria;

	@Pattern(regexp = "[^!\"#$%&'()*+,-./:;<=>?@^_`{|}~]+", message = "El nombre de la Categoria no puede contener caracteres especiales")
	@Pattern(regexp = "[^0-9]+", message = "El nombre de la Categoría no puede contener un número")
	@Column(name = "nombreCategoria", length = 45, nullable = false)
	private String nombreCategoria;

	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categoria(int idCategoria, String nombreCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.nombreCategoria = nombreCategoria;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCategoria, nombreCategoria);
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
		return idCategoria == other.idCategoria && Objects.equals(nombreCategoria, other.nombreCategoria);
	}

}
