package udemyOcaOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
interface Readable{};

sealed class Document implements Readable permits Bookk {};

non-sealed class Bookk extends Document implements Readable{}
final class Journal {};



public class PredicateEvenOdd {


  public static List<Integer> numbersFactory(int startLength, int finalLength) {

    List<Integer> numbers = new ArrayList<>();
    Random random = new Random();

    int lenNumbers = random.nextInt(finalLength - startLength) + startLength;
    System.out.println(lenNumbers);
    for (int i = 0; i < lenNumbers; i++) {
      numbers.add(random.nextInt(finalLength - startLength) + startLength);
    }
    return numbers;
  }

  public static List<Integer> returnFilteredNumbers(List<Integer> n, Predicate<Integer> p) {
    List<Integer> listOfNumbers = new ArrayList<>();
    for (Integer x : n) {
      if (p.test(x)) {
        listOfNumbers.add(x);
      }
    }
    return listOfNumbers;
  }

  public static void main(String[] args) {
    List<Integer> numbersGenerated = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();

    numbersGenerated = numbersFactory(1, 60);
    System.out.println(numbersGenerated);
    Predicate<Integer> evenNumbers = (p) -> ((p % 2) == 0);
    Predicate<Integer> oddNumbers = (q) -> ((q % 2) == 1);
    evenList = returnFilteredNumbers(numbersGenerated, evenNumbers);
    System.out.println();
    oddList = returnFilteredNumbers(numbersGenerated, oddNumbers);
    List<Integer> noDuplicatesEven = new ArrayList<>();
    List<Integer> noDuplicatesOdd = new ArrayList<>();
    Collections.sort(evenList);
    System.out.println(evenList);
    Collections.sort(oddList);
    System.out.println(oddList);

    noDuplicatesEven = evenList.stream()
            .distinct()
            .collect(Collectors.toList());
    System.out.println(noDuplicatesEven);

    noDuplicatesOdd = oddList.stream()
            .distinct()
            .collect(Collectors.toList());
    System.out.println(noDuplicatesOdd);
    System.out.println("---------------------------------");
    IntStream is = IntStream.range(1,6);
    IntStream is2 = is.takeWhile(x ->x%2==0);
  }
}