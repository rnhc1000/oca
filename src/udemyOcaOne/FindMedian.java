package udemyOcaOne;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Temos como objetivo fazer um código para percorrer uma lista de alunos e imprimir os nomes apenas dos alunos
 * maiores de idade, utilizando a Streams API. Sabendo que alunos é do tipo List<Aluno> e Aluno é uma interface
 * que possui o método public boolean isMaiorDeIdade();,
 * reencha as lacunas do código a seguir com a ordem correta da chamada dos métodos para atingir o objetivo:
 * alunos.stream().filter(Aluno::isMaiorDeIdade).forEach(System.out::println);
 */
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
    System.out.println("----------");
    IntStream.range(1,10).filter(i -> i % 2 == 0).average().getAsDouble();

    LocalDate date = LocalDate.now();
    System.out.println(date);




    findMedian(a);
  }
}
