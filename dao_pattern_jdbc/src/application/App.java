package application;

import java.time.LocalDate;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {

	public static void main(String[] args) throws Exception {

        Department obj = new Department(1, "Books");

        LocalDate date = LocalDate.of(1990, 1 , 12);
        Seller seller = new Seller(21, "Bob","bob@gmail.com" , date, 3000.00, obj);
        
        System.out.println(seller);

        SellerDao sellerDao = DaoFactory.createSellerDao();
	}
}