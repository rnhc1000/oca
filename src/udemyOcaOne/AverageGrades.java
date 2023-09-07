package udemyOcaOne;
/**
 * Given an array of names and grades,
 * return the best average of these grades
 * Input: 2D Array
 * Process: Array -> HashMap (Name, List of Grades)
 * Names can be repeated...
 * Ex.: { "Mark", {10, 12,20} }
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

class M { }
class N extends M { }
class O extends N { }
class P extends O { }



public class AverageGrades {

  public static void main(String[] args) {
    String[][] scores = {
            {"Bob", "85"},
            {"Mark", "100"},
            {"Charles", "63"},
            {"Mark", "100"},
            {"Bob", "95"},
            {"Mark", "100"},
            {"Ricardo", "63"},
            {"Mark", "100"}
    };

    int bestOfAverages = bestAverage(scores);

    System.out.println("The best average is: " + bestOfAverages);
      M obj = new O();
      if(obj instanceof M)
        System.out.print("M");
      if(obj instanceof N)
        System.out.print("N");
      if(obj instanceof O)
        System.out.print("O");
      if(obj instanceof P)
        System.out.print("P");


//    Boolean b = new Boolean("tRUe");
//    switch(b) {
//      case true:
//        System.out.println("ONE");
//      case false:
//        System.out.println("TWO");
//      default:
//        System.out.println("THREE");
//    }
    
  }

  public static int bestAverage(String[][] scores) {
    int bestAverage = Integer.MIN_VALUE;
    int average = 0;
    Map<String, List<Integer>> calculateAverage = new HashMap<String, List<Integer>>();
    for (String[] score : scores) {
      String name = score[0];
      int grade = parseInt(score[1]);
      List<Integer> listOfScores = new ArrayList<Integer>();
      if (calculateAverage.containsKey(name)) {
        listOfScores = calculateAverage.get(name);
        listOfScores.add(grade);
        calculateAverage.put(name, listOfScores);
      } else {
        listOfScores.add(grade);
        calculateAverage.put(name, listOfScores);
      }
    }
    System.out.println(calculateAverage);
    for (List<Integer> value : calculateAverage.values()) {
      int sum = 0;
      int count = 0;
      for (int v : value) {
        sum += v;
        count++;
      }
      average = (int) Math.floor((double) (sum / count));

      bestAverage = Math.max(average, bestAverage);
//      if (average > bestAverage) {
//        bestAverage = average;
//      }
    }
    return bestAverage;
  }
}