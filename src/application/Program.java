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

        System.out.println("\n=== TEST 2: seller findByDepartment===");
        Department department = new Department(1, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("\n=== TEST 3: seller findAll===");
        list = sellerDao.findAll();
        list.forEach(System.out::println);

/*        System.out.println("\n=== TEST 4: seller insert===");
        Seller obj = new Seller(null, "Greg", "greg@gmail.com", new Date(),
                4000.00, department);

        sellerDao.insert(obj);
        System.out.println("Inserted! new ID = " + obj.getId());*/

        System.out.println("\n=== TEST 4: seller update===");
        Seller temp = sellerDao.findById(10);
        temp.setName("Yago");
        temp.setEmail("yago@gmail.com");

        sellerDao.update(temp);
        System.out.println("Update completed");
    }
}
