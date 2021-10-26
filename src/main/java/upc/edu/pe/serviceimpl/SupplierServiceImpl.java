package upc.edu.pe.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.serviceinterface.ISupplierService;

import java.util.List;

@Service
public class SupplierServiceImpl implements ISupplierService {
	@Autowired
	private ISupplierRepository sR;

	@Override
	public List<Supplier> list() {
		// return cR.findAll(Sort.by(Sort.Direction.ASC, "categoryName"));
		return sR.findAll();

	}

	@Override
	public Integer insert(Supplier supplier) {
		int rpta = sR.buscarProveedor(supplier.getNameSupplier());
		if (rpta == 0) {
			sR.save(supplier);
		}
		return rpta;
	}

}
