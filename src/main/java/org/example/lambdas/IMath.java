package org.example.lambdas;

@FunctionalInterface
public interface IMath {

  // Solo permite un metodo abstracto
  Double executed(Double a, Double b);

  default Double sum(Double a, Double b) {
    return a + b;
  }

}
