package udemyOcaOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 Given a square matrix, calculate the
 absolute difference between the sums
 of its diagonals.
 *
 */
public class SquareMatrix {
  public static int diagonalDifference(List<List<Integer>> matrixx) {
    int absoluteDiagonals = 0;
    int diagRight = 0;
    int diagLeft = 0;
    int auxRight = 0;
    int auxLeft = 0;
    int checkMatrixx = matrixx.size();
    boolean isSquare = false;

    for (List<Integer> a : matrixx) {
      if (a.size() != checkMatrixx) {
        isSquare =false;
        return 0;
      } else {
        auxLeft=a.size()-1;
        isSquare = true;
      }
    }
    for (List<Integer> a : matrixx) {
      System.out.println(a);
      diagRight += a.get(auxRight);
      auxRight+=1;
      diagLeft += a.get(auxLeft);
      auxLeft-=1;
      System.out.println(diagRight + " " + diagLeft);
    }

    absoluteDiagonals = Math.abs(diagRight - diagLeft);
    System.out.println(diagRight);
    System.out.println(diagLeft);

    if (isSquare)  {
      System.out.println("Squared Matrixx");
      return absoluteDiagonals;
    }
    return absoluteDiagonals;
  }

  public static void main(String[] args) {
    List<List<Integer>> list = new ArrayList<List<Integer>>();

    list.add(Arrays.asList(11,2,4,-5));
    list.add(Arrays.asList(4,5,6,-4));
    list.add(Arrays.asList(10,8,-12,3));
    list.add(Arrays.asList(10,8,-12,3));
    int d = diagonalDifference(list);
    System.out.println(d);
  }
}
