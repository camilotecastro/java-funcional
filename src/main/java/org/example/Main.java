package org.example;

import lombok.var;
import org.example.interfaces.EmployeeDB;
import org.example.interfaces.ProductDB;

public class Main {

  public static void main(String[] args) {

    var employee  = new EmployeeDB();
    var product = new ProductDB();

    System.out.println(employee.getById(1L));
    System.out.println(product.getById(2L));

  }

}