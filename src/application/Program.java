package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Department obj = new Department(1, "books");
        System.out.println(obj);

        Seller seller = new Seller(1, "mathias", "mathias@gmail.com", new Date(), 8.600, obj);

         SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}