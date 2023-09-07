package udemyOcaOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FizzBuzz {

  public static void fizzBuzz(int n) {

    int byThree = 0;
    int byFive = 0;
    List<Integer> multipleOfThree = new ArrayList<>();
    List<Integer> multipleOfFive = new ArrayList<>();
    List<Integer> multipleOfThreeAndFive = new ArrayList<>();
    List<Integer> remainder = new ArrayList<>();

    for (int i=1; i<n+1; i++) {

      if (i%3 == 0 && i%5==0) {
        multipleOfThreeAndFive.add(i);
      } else if (i%5 == 0) {
        multipleOfFive.add(i);
      } else if((i % 3 == 0)) {
        multipleOfThree.add(i);
      } else {
        remainder.add(i);
      }
    }

    System.out.println(multipleOfFive);
    System.out.println(multipleOfThree);
    System.out.println(multipleOfThreeAndFive);
    System.out.println(remainder);

    Map<Integer, String> aggregate = new TreeMap<>();

    for (Integer i : remainder ) {

      aggregate.put(i, String.valueOf(i));
    }

    for (Integer i : multipleOfFive) {
      aggregate.put(i, "Buzz");
    }

    for (Integer i: multipleOfThree) {
      aggregate.put(i, "Fizz");

    }

    for (Integer i : multipleOfThreeAndFive) {
      aggregate.put(i, "FizzBuzz");
    }

    System.out.println(aggregate);

    for (String value : aggregate.values()) {

      System.out.println(value);
    }


  }

  public static void main(String[] args) {
    fizzBuzz(15);
  }
}
