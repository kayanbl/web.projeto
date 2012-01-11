package persistence;

import java.util.List;

public interface GenericDaoMethods<T> {

	public void saveOrUpdate(T object);
	
	public void delete(Long id);
	
	public T findById(Long id);
	
	public List<T> findAll();
	
}
