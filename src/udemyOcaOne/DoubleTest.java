package udemyOcaOne;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DoubleTest {
  public static void main(String[] args) {

    int[][]grid = {
            {1,2,3},
            {4,5,20},
            {7,8,9}
    };
    System.out.println(grid.length);
    int sum = 0;
    for (int []g : grid) {
      for (int h : g) {
        sum+=h;
      }
    }
    int sumPerRow=0;
    int outerArray=0;
    int innerArray=0;
    System.out.println("Sum of all grid elements: " + sum);

    for(outerArray=0; outerArray < grid.length; outerArray++) {
      for(innerArray=0; innerArray < grid[outerArray].length; innerArray++) {
        sumPerRow+=grid[outerArray][innerArray];
      }
      System.out.println("Row " + outerArray + " Sum: " + sumPerRow);
      sumPerRow=0;
    }

    int sumPerColumn=0;
    outerArray=0;
    for(outerArray=0; outerArray < grid[outerArray].length; outerArray++) {
      for (innerArray = 0; innerArray < grid.length ; innerArray++) {

        //System.out.print((outerArray + innerArray + " "));

        sumPerColumn += grid[innerArray][outerArray];

      }
      sumPerColumn=0;
    }
    System.out.println("Column " + outerArray + " Sum: " + sumPerColumn);

    StringBuilder sb = new StringBuilder("lzo");
    sb.append(("-808"));
    System.out.println(sb);
    System.out.println(LocalTime.now());

    LocalDate date = LocalDate.of(2015,3,26);
    Period p = Period.ofMonths(4);
    System.out.println(date.plus(p));

    Double n = null;
    try {
      n = Double.valueOf("120D");
    } catch (NumberFormatException ex) {
      System.out.println(ex);
    }
    System.out.println(n);
    int[] testData = {1, 2, 3};
    for (int i : testData) {
      System.out.println(i);
    }
    String s = "A";

    switch (s) {

      case "a":
        System.out.println("simple a");
      default:
        System.out.println("default");
      case "A":
        System.out.println("A");
    }

    int x = 10;

    System.out.println(x > 10 ? ">" : x < 10 ? "<" : "=");

    testeArgs(1, 2, 3, 4);
  }

  public static int testeArgs(int i, int j, int k, int l) {

    return (i + j + k + l);

  }
}
