package udemyOcaOne;

import java.util.*;

@ClassPreamble (
        author = "Ricardo Ferreira",
        date = "25/08/2023",
        currentRevision = 6,
        lastModified = "25/08/2023",
        lastModifiedBy = "Ricardo Ferreira",
        reviewers = {}
)

public class ComparisonSorting {
  public static List<Integer> countingSort(List<Integer> arr) {
    List<Integer> response = new ArrayList<Integer>(Collections.nCopies(arr.size(),0));
    List<Integer> result = new ArrayList<Integer>(Collections.nCopies(arr.size(),0));

    int max = Integer.MIN_VALUE;
    int sizeOfInput = arr.size();
    for (int i=0; i<sizeOfInput; i++) {
      for (int j=1; j<sizeOfInput; j++) {
        if(arr.get(i) > arr.get(j)) {
          int temp = arr.get(i);
          max = Math.max(max, temp);
        }
      }
    }
    int[] count = new int[max+1];
    int sizeOfCount = count.length;
    int counter=0;

    for (int i =0; i< sizeOfInput; i++) {
      for (int j=0; j<sizeOfInput; j++) {
        if(Objects.equals(arr.get(i), arr.get(j))) {
          counter+=1;
          count[arr.get(i)] = counter;
        }
      }
      counter=0;
    }

    for (Integer it : arr ) {
       result.set(it, result.get(it) + 1);

    }
    System.out.println(result);
    System.out.println(arr);
//    System.out.println(Arrays.toString(count));
    int j=1;
    for (int i=0; i<sizeOfCount-1; i++) {

        count[j] = count[i] + count[j];
        j++;
    }
//    System.out.println(Arrays.toString(count));

    for (Integer x: arr) {
      int idx = count[x];
      idx-=1;
//      System.out.println(x + " " + idx);
      response.set(idx,x);
    }
    if ( response.contains(0) )  {

      int x = response.indexOf(0);
      x++;
      int y = response.get(x);
      x--;
      response.set(x,y);
//      System.out.println("Tem zero " + x + " " + y);
//      System.out.println(response);




    }

System.out.println(response);
    //response.stream().filter(xx -> xx == 0).forEach(System.out::println);
    return arr;
  }

  public static void main(String[] args) {

    List<Integer> list = List.of(63,25,73,1,98,73,56,84,86,57,16,83,8,25,81,56,9,53,98,67,99,12,83,89,80,91,39,86,76,85,74,39,25,90,59,10,94,32,44,3,89,30,27,79,46,96,27,32,18,21,92,69,81,40,40,34,68,78,24,87,42,69,23,41,78,22,6,90,99,89,50,30,20,1,43,3,70,95,33,46,44,9,69,48,33,60,65,16,82,67,61,32,21,79,75,75,13,87,70,33);
    countingSort(list);
  }
}
