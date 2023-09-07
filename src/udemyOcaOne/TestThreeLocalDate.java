package udemyOcaOne;

import java.time.LocalDate;

class MyLocalDate  {

    public MyLocalDate() {
    }
    String y, m, d;
    LocalDate date = LocalDate.of(2020, 10, 18);
    @Override
    public String toString() {
        return  Integer.toString(date.getYear()) + Integer.toString(date.getMonthValue()) + Integer.toString(date.getDayOfMonth());
    }

}
public class TestThreeLocalDate  {


    public static void main(String[] args) {

        MyLocalDate date = new MyLocalDate();
        LocalDate a = LocalDate.of(1980,12,10);
        System.out.println(a);


    }
}
