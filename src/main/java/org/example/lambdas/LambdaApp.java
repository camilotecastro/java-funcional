package org.example.lambdas;

public class LambdaApp {

  public static void main(String[] args) {

    // Expresiones lambda

    IMath subsTract = new IMath() {
      @Override
      public Double executed(Double a, Double b) {
        return a - b;
      }
    };
    System.out.println(subsTract.executed(2.0, 32.0));


    IMath multiply = (a, b) -> a * b;
    System.out.println(multiply.executed(14.3,13.3));


    IMath div  = ( a, b ) -> {
      return  a / b;
    };
    System.out.println(div.executed(100.0, 10.0));

    System.out.println("Default: " + div.sum(10.1, 20.1));



  }

}
