package application;

import model.dao.DaoFactory;
import model.dao.Impl.SellerDaoJDBC;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("===== TEST 1: seller findById =====");
        Seller seller = sellerDao.findById(9);
        System.out.println(seller);

        System.out.println("\n===== TEST 2: seller findByDepartment =====");
        Department dep = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n===== TEST 3: seller findAll =====");
        list = sellerDao.findAll();
        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n===== TEST 4: seller insert =====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n===== TEST 5: seller update =====");
        seller = sellerDao.findById(10);
        seller.setName("cleitin");
        sellerDao.update(seller);
        System.out.println("Update completed!");

        System.out.println("\n===== TEST 6: seller deleteById =====");
        System.out.print("Type a number for deletion: ");
        int number = sc.nextInt();
        sellerDao.deleteById(number);
        System.out.println("Delete completed!");
    }
}