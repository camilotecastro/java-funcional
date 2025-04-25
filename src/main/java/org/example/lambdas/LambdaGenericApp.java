package org.example.lambdas;

import org.example.fundamentals.Employee;
import org.example.fundamentals.Product;

public class LambdaGenericApp {

  public static void main(String[] args) {
    Printer<Product> lambdaGenerica = product -> System.out.println(product);

    Product p = new Product();
    p.setId(1L);
    p.setPrice(100.1);
    p.setName("Papitas");

    lambdaGenerica.print(p);

    Printer<Employee> employeePrinter = employee -> System.out.println(employee);

    Employee employee = new Employee();
    employee.setName("Yo");
    employee.setSalary(1000.12);
    employee.setDni("102303102");
    employeePrinter.print(employee);


  }

}
