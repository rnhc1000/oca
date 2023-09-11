package udemyOcaOne;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimeDifference {
  public static void main(String[] args) {

    LocalDateTime date = LocalDateTime.now();
    LocalDateTime future = LocalDateTime.now().plusDays(30);
    LocalDate dateOfToday = LocalDate.now();
    LocalDate dateOfFuture = LocalDate.of(2024, 10, 18);
    //LocalDateTime futureOne = LocalDateTime.of(2024, Month.OCTOBER,9);
    //Period period = (Period) ChronoPeriod.between(futureOne,date);
    long diff = ChronoUnit.SECONDS.between(date,future);
    long diffDays = ChronoUnit.DAYS.between(dateOfFuture,dateOfToday);


    System.out.println(diff + "---" + diffDays);

  }
}
