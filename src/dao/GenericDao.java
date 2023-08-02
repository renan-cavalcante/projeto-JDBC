package dao;

import java.util.List;

public interface GenericDao<T> {
	
	void insert(T obj);
	void update(T obj);
	void delecteById(Integer id);
	T findById(Integer id);
	List<T> findAll();
}
