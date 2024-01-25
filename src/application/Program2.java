package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args){
        DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();

        System.out.println("===== TEST 1: department findById =====");
        Department department = DepartmentDao.findById(4);
        System.out.println(department);

        System.out.println("\n===== TEST 2: department findAll =====");
        List<Department> list = DepartmentDao.findAll();
        for(Department dep : list){
            System.out.println(dep);
        }

        System.out.println("\n===== TEST 2: department insert =====");
        Department newDepartment = new Department(null, "Iphone");
        DepartmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());
    }
}