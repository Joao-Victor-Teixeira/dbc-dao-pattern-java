package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class App {

	public static void main(String[] args) throws Exception {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("*** Teste 1 : Seller findById ***");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println();        
        System.out.println("*** Teste 2 : Seller findByDepartment ***");
        Department department = new Department(2,null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
                System.out.println(obj);
        }

        System.out.println();
        System.out.println("*** Teste 3 : Seller findAll ***");
        list = sellerDao.findAll();
        for (Seller obj : list) {
                System.out.println(obj);
        }

        System.out.println();
        System.out.println("*** Teste 4 : Seller insert ***");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.inset(newSeller);
        System.out.println("Inserido! Novo id = " + newSeller.getId());

        System.out.println();
        System.out.println("*** Teste 5 : Seller update ***");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completo!");
  }
}