package org.example.interfaces;

import java.util.List;

public interface DatabaseService<T>{

  T getById(Long id);
  T getAllRecords();

}
