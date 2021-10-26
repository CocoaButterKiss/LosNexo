package upc.edu.pe.serviceinterface;

import java.util.List;

public interface IProductService {
	public boolean insert(Product product);

	List<Product> list();

	Product listarId(int idProducto);
}
