package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao dpDao = DaoFactory.createDepartmentDAO();

        System.out.println("=== TEST 1: department insert ===");
        Department dp = new Department(null, "Music");
        dpDao.insert(dp);
        System.out.println("dp = " + dp);

        System.out.println("=== TEST 2: department findById ===");
        Department id = dpDao.findById(1);
        System.out.println("id = " + id);

        System.out.println("=== TEST 3: department update ===");
        Department temp = dpDao.findById(1);
        temp.setName("Food");
        dpDao.update(temp);
        System.out.println("temp = " + temp);

        System.out.println("=== TEST 4: department findAll ===");
        List<Department> list = dpDao.findAll();
        list.forEach(System.out::println);

/*        System.out.println("=== TEST 5: department delete ===");
        dpDao.deleteById(10);*/


    }
}
