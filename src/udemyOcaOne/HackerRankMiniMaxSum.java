package udemyOcaOne;
/**
 * Given five positive integers, find the minimum and maximum values
 * that can be calculated by summing exactly four of the five integers.
 * Then print the respective minimum and maximum values as a single line
 * of two space-separated long integers.
 * Ex arr[ 1,3,5,7,9]
 *
 * Min 16 Max 24
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackerRankMiniMaxSum {

  public static void miniMaxSum(List<Long> arr) {

    int lenList = 5;
    int window = lenList-1;
    long min = 0;
    long max = 0;
    Collections.sort(arr);
    System.out.println(arr);
    for (int i=0; i< window; i++) {

      min+=arr.get(i);

    }
    window+=1;
    for (int i=1; i < window; i++) {

      max+=arr.get(i);

    }

    System.out.printf("%d %d",min, max);
  }

  public static void main(String[] args) {
    ArrayList<Long> list = new ArrayList<Long>(Arrays.asList(256741038L,623958417L,467905213L,714532089L,938071625L));
    miniMaxSum(list);
  }
}
