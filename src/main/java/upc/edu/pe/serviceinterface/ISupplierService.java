package upc.edu.pe.serviceinterface;

import java.util.List;

public interface ISupplierService {
	public Integer insert(Supplier supplier);

	List<Supplier> list();
}
