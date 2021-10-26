package upc.edu.pe.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.repository.ICategoryRepository;
import upc.edu.pe.serviceinterface.ICategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
	@Autowired
	private ICategoryRepository cR;

	/* @Transactional */
	@Override
	public Integer insert(Category category) {

		int rpta = cR.buscarCategoria(category.getNameCategory());
		if (rpta == 0) {
			cR.save(category);
		}
		return rpta;

	}

	@Override
	public List<Category> list() {
		// return cR.findAll(Sort.by(Sort.Direction.ASC, "categoryName"));
		return cR.findAll();

	}

}
