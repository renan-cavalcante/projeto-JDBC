package application;

import java.util.List;

import dao.DaoFactory;
import dao.GenericDao;
import entities.Department;
import entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		GenericDao<Seller> sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		System.out.println();
		
		System.out.println("Seller findByDepartment");
		List<Seller> list = sellerDao.findByDepartment(new Department(2, null));		
		list.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Seller findAll");
		list = sellerDao.findAll();		
		list.forEach(System.out::println);

	}

}
