package org.example.fundamentals;

import java.util.UUID;

public class EmployeeDB implements DatabaseService<Employee> {

  @Override
  public Employee getById(Long id) {
    Employee e = new Employee();
    e.setDni(UUID.randomUUID().toString());
    e.setName("Camilo Castro");
    e.setSalary(1.123);
    return e;
  }

  @Override
  public Employee getAllRecords() {
    return null;
  }

}
