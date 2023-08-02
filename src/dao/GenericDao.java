package dao;

import java.util.List;

import entities.Department;
import entities.Seller;

public interface GenericDao<T> {
	
	void insert(T obj);
	void update(T obj);
	void delecteById(Integer id);
	T findById(Integer id);
	List<T> findAll();
	List<Seller> findByDepartment(Department department);
}
