package org.example;

import lombok.var;
import org.example.fundamentals.EmployeeDB;
import org.example.fundamentals.ProductDB;

public class Main {

  public static void main(String[] args) {

    var employee  = new EmployeeDB();
    var product = new ProductDB();

    System.out.println(employee.getById(1L));
    System.out.println(product.getById(2L));

  }

}