package org.example.lambdas;

import java.util.Arrays;
import java.util.List;

public class MainApp {

  public static void main(String[] args) {

    List<String> countries = Arrays.asList("USA", "Canada", "Mexico", "Brazil", "Argentina");
    // Using a lambda expression to print each country
    countries.forEach(country -> System.out.println(country.toUpperCase()));

  }

}
