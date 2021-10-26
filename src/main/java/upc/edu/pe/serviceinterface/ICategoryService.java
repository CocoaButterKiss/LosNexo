package upc.edu.pe.serviceinterface;

import java.util.List;

public interface ICategoryService {
	public Integer insert(Category category);

	List<Category> list();
}
