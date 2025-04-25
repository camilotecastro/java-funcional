package org.example.fundamentals;

public class ProductDB implements DatabaseService<Product>{

  @Override
  public Product getById(Long id) {
    Product p = new Product();
    p.setId(id);
    p.setName("Papitas");
    p.setPrice(12.32);
    return p;
  }

  @Override
  public Product getAllRecords() {
    return null;
  }

}
