package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDAO();
        System.out.println("=== TEST 1: seller findByID ===");
        Seller seller = sellerDao.findById(1);

        System.out.println("seller = " + seller);
        System.out.println("\n=== TEST 2: seller findByDepartment ===");

        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        System.out.println(list);
    }
}
