package dao;

import dao.impl.SellerDaoJDBC;
import entities.Seller;

public class DaoFactory {

	public static GenericDao<Seller> createSellerDao(){
		return new SellerDaoJDBC();
	}
}
