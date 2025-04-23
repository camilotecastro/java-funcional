package org.example.interfaces;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Product {

  private Long id;
  private String name;
  private Double price;

}
