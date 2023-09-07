package udemyOcaOne;

import java.util.*;

import static java.lang.Integer.parseInt;
import static java.util.stream.Collectors.toMap;

public class Array2Map {
  public static void main(String[] args) {


    String[][] array = new String[][]{
            {"Ricardo", "10"},
            {"Ricardo", "15"},
            {"Ferreira","30"}
    };

//    Map<String, String> m = Arrays.stream(array)
//            .collect(toMap(kv -> kv[0], kv -> kv[1], (oldV, newV) -> newV)
//            );

    String[][] scores = {{"Bob","85"},{"Mark","100"},{"Charles","63"},{"Mark","72"}};
    int bestAverage = 0;
    int average = 0;
    Map<String, List<Integer>> calculateGrades = new HashMap<String, List<Integer>>();
    for (String[] r : scores) {
      String name = r[0];
      int score = parseInt(r[1]);
     // System.out.println("Name: " + name + ", Score: " + score);
      List<Integer> listOfGrades = new ArrayList<Integer>();
      if(calculateGrades.containsKey(name)) {
        listOfGrades = calculateGrades.get(name);
        listOfGrades.add(score);
        System.out.println(".... " + listOfGrades);
        calculateGrades.put(name, listOfGrades);
      } else {
        listOfGrades.add(score);
        calculateGrades.put(name, listOfGrades);
      }
      System.out.println(listOfGrades);
    }


    for (List<Integer> value: calculateGrades.values()) {
      int sum=0;
      int count=0;
      for (int i: value) {
        sum+=i;
        count++;
      }

      average = (int)Math.floor((double) sum /count);
      if(average > bestAverage) {
        bestAverage = average;
      }
    }

    System.out.println("Best Average is " + bestAverage);

    System.out.println(calculateGrades);
    Map<String, String> phoneBook;
    phoneBook = Arrays.stream(array).collect(
            toMap(kv -> kv[0], kv -> kv[1], (s, a) -> s + "," + a));

    System.out.println(phoneBook);

    System.out.println(phoneBook.get("Ricardo"));

    String r = phoneBook.get("Ricardo");
    System.out.println(r);
    //ArrayList<String> grades = new ArrayList<>();

    String[] g = null;

    g = r.split(",");
    for (String x : g) {
      average = average + parseInt(x);
    }
    System.out.println(average);
  }
}
