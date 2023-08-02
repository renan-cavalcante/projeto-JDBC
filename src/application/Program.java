package application;

import java.time.LocalDate;
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
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);		
		list.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Seller findAll");
		list = sellerDao.findAll();		
		list.forEach(System.out::println);
		
		System.out.println();
		System.out.println("Seller insert");
		Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", LocalDate.now() , 4000.0, dep);		
		sellerDao.insert(newSeller);
		System.out.println("Inserido! Novo id = "+ newSeller.getId() );

		System.out.println();
		System.out.println("Seller update");
		seller = sellerDao.findById(1);
		seller.setName("Bruce Waine");
		sellerDao.update(seller);
		System.out.println("Update completo!");
		
		System.out.println();
		System.out.println("Seller delete");
		sellerDao.delecteById(3);
		System.out.println("Seller 3 deletado!");
		
		

		
	}

}
