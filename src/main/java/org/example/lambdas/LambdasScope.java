package org.example.lambdas;

import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class LambdasScope {

  public static void main(String[] args) {


    // Concurrent modification of a variable
    AtomicReference<Integer> number = new AtomicReference<>(10);
    IntStream.range(1, 10).forEach(i -> number.set(number.get() + i));

    System.out.println("Final number: " + number.get());

  }

}
