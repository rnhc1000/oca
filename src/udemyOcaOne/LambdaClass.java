package udemyOcaOne;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

@FunctionalInterface
interface Calculator {
  int sumNumbers(int a, int b);
}

class NewThread extends Thread
{
  Thread t1;
  Thread t2;
  NewThread()
  {
    t1 = new Thread(this,"Thread_1");
    t2 = new Thread(this,"Thread_2");
    t1.start();
    t2.start();
  }
  public void run()
  {
    t2.setPriority(Thread.MAX_PRIORITY);
    System.out.print(t1.equals(t2));
  }
}
class Greetings {
  String msg = null;

  public Greetings() {
    this("Good Morning!");
  }

  public Greetings(String str) {
    msg = str;
  }

  public void display() {
    System.out.println(msg);
  }
}
 class IdentifyMyParts {
  public static int x = 7;
  public int y = 3;
}

public class LambdaClass {

  public static void main(String[] args) {

    Greetings g1 = new Greetings();
    Greetings g2 = new Greetings("Good Evening!");
    g1.display();
    g2.display();
    LocalDate obj = LocalDate.of(2020, 2, 14);
    System.out.println(obj.minus(Period.ofDays(10)));
    int [] arr = {1, 2, 3, 4, 5};
    int x = 0;
    for(int n=1; n<arr.length-1;n++) {
      x += arr[n];
    }
    System.out.println(x);
    List<String> listx = new ArrayList<>();
    listx.add(0, "Array");
    listx.set(0, "List");
    System.out.println(listx);
    List<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("grape");
    fruits.add("mango");
    fruits.add("banana");
    fruits.add("grape");

    if(fruits.remove("grape"))
      fruits.remove("papaya");

    System.out.println(fruits);
    IdentifyMyParts a = new IdentifyMyParts();
    IdentifyMyParts b = new IdentifyMyParts();
    a.y = 5;
    b.y = 6;
    a.x = 1;
    b.x = 2;
    System.out.println("a.y = " + a.y);
    System.out.println("b.y = " + b.y);
    System.out.println("a.x = " + a.x);
    System.out.println("b.x = " + b.x);
    System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
    /**
     * The example first sets the minVal to Integer.MAX_VALUE which is the highest possible
     * value an int can take. This is done to make sure that the initial value is not by
     * accident smaller than the smallest value in the array.
     */
    int[] ints = {0,2,4,6,8,10};

    int minVal = Integer.MAX_VALUE;

    for(int i=0; i < ints.length; i++){
      if(ints[i] < minVal){
        minVal = ints[i];
      }
    }

    System.out.println("minVal = " + minVal);
    int maxVal = Integer.MIN_VALUE;
    for(int i=0; i < ints.length; i++){
      if(ints[i] > maxVal){
        maxVal = ints[i];
      }
    }
    System.out.println("maxVal = " + maxVal);
    LinkedList <Integer> list = new LinkedList<>();
    list.add(2);
    list.add(8);
    list.add(5);
    list.add(1);
    Iterator<Integer> i = list.iterator();
    Collections.reverse(list);
    Collections.sort(list);
    while(i.hasNext())
      System.out.print(i.next() + " ");
    new NewThread();

  }

}



