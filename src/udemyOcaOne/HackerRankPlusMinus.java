package udemyOcaOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRankPlusMinus {
  public static void plusMinus(List<Integer> arr) {
    int lenList = arr.size();
    List<Integer> positive = new ArrayList<>();
    List<Integer> negative = new ArrayList<>();
    List<Integer> neutral = new ArrayList<>();

    for (int k=0; k<lenList; k++) {
      Integer m = arr.get(k);
      if (m > 0) {
        positive.add(k);
      } else if (m < 0) {
        negative.add(k);
      } else {
        neutral.add(k);
      }
    }
    float pos = (float)positive.size()/lenList;
    float neg = (float)negative.size()/lenList;
    float ntr = (float)neutral.size()/lenList;

    System.out.printf("%.6f\n", pos);
    System.out.printf("%.6f\n", neg);
    System.out.printf("%.6f\n", ntr);
  }

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(-4,3,-9,0,4,1);

    plusMinus(list);

  }

}

