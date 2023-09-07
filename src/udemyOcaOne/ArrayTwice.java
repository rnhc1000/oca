package udemyOcaOne;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayTwice {

  public static int lonelyInteger(List<Integer> a) {

    int lonely = 0;


    return lonely;
  }

  public static void main(String[] args) {
    List<Integer> ax = Arrays.asList(1,  3,3, 4, 4, 5, 5, 6, 6, 7,7, 7, 8, 8, 9, 9,1,0);
//    for (Integer a : ax) {
//      System.out.println(a);
//    }
    //int[] ay = new int[]{1,2,3,4,3,2,1,4,5};
    Map<Integer, Integer> counter = new HashMap<Integer, Integer>();

    Integer count = 0;
    int sizeOfAx = ax.size();
    int max = sizeOfAx - 1;
    int min = 0;

    for (int i = 0; i < sizeOfAx; i++) {

      for (int j = 0; j < sizeOfAx; j++) {

        if (ax.get(i) == ax.get(j)) {
          Integer a=ax.get(i);
          count+=1;
          counter.put(a, count);
        }
      }
      count=0;
    }
    System.out.println(counter);

    for (Map.Entry<Integer, Integer> entry: counter.entrySet()) {
      if (entry.getValue() == 1) System.out.println(entry.getKey());
    }
  }

}

