package model.dao;

import model.dao.impl.SellerdaoJDBC;

public class DaoFactory {
    
    public static SellerDao createSellerDao(){
        return new SellerdaoJDBC();
    }
}
