package model.dao;

import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerdaoJDBC;
import db.DB;

public class DaoFactory {
    
    public static SellerDao createSellerDao(){
        return new SellerdaoJDBC(DB.getConnection());
    }

    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
