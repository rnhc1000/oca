package udemyOcaOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Array2MapOne {

  public int  bestAverageCalculator(String[][] scores) {

    // This HashMap maps student name to their list of scores
    Map<String, List<Integer>> scoreMap = new HashMap<String,List<Integer>>();
    for(String[] score:scores) {
      String name = score[0];
      int currentScore =Integer.parseInt(score[1]);

      if(scoreMap.containsKey(name)) {
        List<Integer> scoreList = scoreMap.get(name);
        scoreList.add(currentScore);
        scoreMap.put(name, scoreList);
      }
      else {
        List<Integer> scoreList = new ArrayList<Integer>();
        scoreList.add(currentScore);
        scoreMap.put(name, scoreList);
      }
    }
    //scoreMap will be {Charles=[63], Bob=[85], Mark=[100, 34]}
    //After Map is formed i am iterating though all the values and finding the best average as below
    int bestAverage = 0;
    for(List<Integer> value:scoreMap.values()) {
      int sum = 0;
      int count = 0;
      for(int i:value) {
        sum+=i;
        count++;
      }
      int average = (int)Math.floor(sum/count);
      if(average>bestAverage)
        bestAverage = average;
    }

    return bestAverage;// returns 85

  }
}
