package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Department obj = new Department(1, "books");
        Seller person = new Seller(1, "igor", "igor@gmail.com", new Date(), 5.500, obj);
        System.out.println(person);
    }
}