package application;

import dao.DaoFactory;
import dao.GenericDao;
import entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		GenericDao<Seller> sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);

	}

}
