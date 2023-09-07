package udemyOcaOne;

import java.util.*;

public class FlippingMatrix {

  public static int flippingMatrix(List<List<Integer>> matrix) {
    int sum = 0;
    int sizeOfInnerMatrix = 0;
    List<Integer> checkSize = new ArrayList<>();
    int sizeOfMatrix = matrix.size();
    for (List<Integer> x : matrix) {
      for (Integer y : x) {
        sum += y;
      }
      checkSize.add(x.size());
    }

    boolean allEqual = new HashSet<>(checkSize).size() <= 1;

    if (allEqual) sizeOfInnerMatrix = checkSize.get(0);

    for (List<Integer> x : matrix) {
      Collections.sort(x);
    }
    System.out.println(matrix);
    int[][] innerMatrix = new int[sizeOfInnerMatrix][sizeOfMatrix];
    System.out.println(sizeOfMatrix);
    if (sizeOfMatrix == sizeOfInnerMatrix) {


      System.out.println("It is a " + sizeOfMatrix + " x " + sizeOfInnerMatrix + " matrix");
    }
    return sum;
  }


  public static void main(String[] args) {
    List<List<Integer>> m = Arrays.asList(
            Arrays.asList(10, 20, 30, 100),
            Arrays.asList(60, 50, 40, 110),
            Arrays.asList(120, 80, 70, 90),
            Arrays.asList(55, 35, 120, 15)
    );
    int[][] x = new int[][]{
            {1, 2, 3, 4},
            {4, 5, 6, 7},
            {7, 8, 9,10},
            {11,12,13,14}
    };

    int[][] y = new int[x.length][];
    int sum = 0;

    int len, index;
    int newSize = x.length/2;
    int[][] newMatrixx = new int[newSize][newSize];



    for (int i = 0; i < x.length; i++) {
      // calculate the length of each inner array
      len = x[i].length;
      //create an inner array of length above
      y[i] = new int[len];
      //position the index to the reverse array
      index = len - 1;
      // fill the reverse of each array found
      for (int j = 0; j < len; j++) {
        y[i][j] = x[i][index];
        index--;
      }
    }

    for (int k=0; k<newSize;k++){
      for(int p=0;p<newSize;p++){

        newMatrixx[k][p] = x[k][p];
      }
    }
    for(int [] s : newMatrixx){

      for (int t : s) {

        sum+=t;
      }
    }


    System.out.println(Arrays.deepToString(x));
    System.out.println(Arrays.deepToString(y));
    for (int j = 0; j < x.length; j++) {
      for (int i = 0; i < x.length; i++) {
        y[j][i] = x[i][j];
      }
    }
    System.out.println(Arrays.deepToString(y));
    System.out.println(Arrays.deepToString(newMatrixx));
    System.out.println("Sum of Matrixx: " + sum);
//    sum = flippingMatrix(m);
//    System.out.println(sum);

  }
}
