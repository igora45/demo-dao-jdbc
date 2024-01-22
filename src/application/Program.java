package application;

import model.entities.Department;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Department obj = new Department(1, "books");
        System.out.println(obj);
    }
}