package udemyOcaOne;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class Pen {}
public class LocalTimeOca {
  public static void main(String[] args) {
    List<Character> list = new ArrayList<>();
    list.add(0, 'V');
    list.add('T');
    list.add(1, 'E');
    list.add('O');
    if(list.contains('O')) {
      char x = list.get(0);
      System.out.println(x);

      //list.remove('O');
    }

    for (Character l : list) {

      System.out.println(l);

    }

    System.out.println(list);
    short[] arg = new short[]{50,100};
    LocalTime time =   LocalTime.of(16, 40);
    LocalDate date = LocalDate.parse("1947-12-30");
    time = LocalTime.MAX;
    System.out.println(date.atTime(time));
    String amPm = time.getHour() >= 12 ? "PM" : "AM";
    System.out.println(amPm);
    System.out.println((arg[1]));

    new Pen();
    Pen p = new Pen();
    change(p);
    System.out.println("End");
    byte var = 100;
    switch(var) {
      case 100:
        System.out.println("var is 100");
        break;
      case 127:
        System.out.println("var is 200");
        break;
      default:
        System.out.println("In default");

        List<Integer> listt = new ArrayList<Integer>();
        listt.add(2);
        listt.add(1);
        listt.add(0);

        listt.remove(listt.indexOf(0));

        System.out.println(listt);
    }
  }

  public static void change(Pen pen) {

    pen = new Pen();
  }
}
