package org.example.fundamentals;

public interface DatabaseService<T>{

  T getById(Long id);
  T getAllRecords();

}
