package application;

import model.dao.DaoFactory;
import model.dao.Impl.SellerDaoJDBC;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(9);

        System.out.println(seller);
    }
}