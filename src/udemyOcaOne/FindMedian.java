package udemyOcaOne;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMedian {
  public static int findMedian(List<Integer> arr) {
    int median = 0;
    Collections.sort(arr);
    double size = arr.size();
    if (size%2 == 0) {
      return median;
    }
    int half = (int)Math.floor(size/2);
    System.out.println(half);

    if (half%2 == 1) {

      System.out.println(arr.get(half));
    } else {

      System.out.println((arr.get(half-1) + arr.get(half+1))/2);
    }


    System.out.println(arr);

    return median;
  }


  public static void main(String[] args) {
//    List<Integer> a = Arrays.asList(3,1,2,0,6,5,8,10,7,9,4);
    List<Integer> a = Arrays.asList(1,2,3,4,5,7,8,9,10);




    findMedian(a);
  }
}
