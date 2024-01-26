package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DepartmentDao DepartmentDao = DaoFactory.createDepartmentDao();

        System.out.println("===== TEST 1: department findById =====");
        Department department = DepartmentDao.findById(4);
        System.out.println(department);

        System.out.println("\n===== TEST 2: department findAll =====");
        List<Department> list = DepartmentDao.findAll();
        for(Department dep : list){
            System.out.println(dep);
        }

        System.out.println("\n===== TEST 3: department insert =====");
        Department newDepartment = new Department(null, "Knife");
        DepartmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n===== TEST 4: department update =====");
        Department dep1 = DepartmentDao.findById(2);
        dep1.setName("Programming");
        DepartmentDao.update(dep1);
        System.out.println("Update completed!");

        System.out.println("\n===== TEST 5: department delete =====");
        System.out.print("Type a number for deletion: ");
        int number = sc.nextInt();
        DepartmentDao.deleteById(number);
        System.out.println("Delete completed!");

    }
}