package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: Seller findByID ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: Seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> sellers = sellerDao.findByDepartment(department);
		for (Seller s : sellers) {
			System.out.println(s);
		}
		
		System.out.println("\n=== TEST 3: Seller findAll ===");
		sellers = sellerDao.findAll();
		for (Seller s : sellers) {
			System.out.println(s);
		}
		

	}

}
