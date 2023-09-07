package udemyOcaOne;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test12IteratorArrayList {

  public static void main(String[] args) {
    List<String> dryFruits = new ArrayList<>();
    dryFruits.add("Walnut");
    dryFruits.add("Apricot");
    dryFruits.add("Almond");
    dryFruits.add("Date");

    Iterator<String> iterator = dryFruits.iterator();

    dryFruits.removeIf(dryFruit -> dryFruit.startsWith("A"));
    System.out.println(dryFruits);

//    String dryFruit = "";
//    while (iterator.hasNext()) {
//
//      dryFruit = iterator.next();
//      System.out.println(dryFruit);
//
//      if (dryFruit.startsWith("A")) {
//        iterator.remove();
//        //dryFruits.remove(dryFruit);
//      }
//
//    }
//    System.out.println(dryFruits);


    int[] arr = new int[2];


  }
}
