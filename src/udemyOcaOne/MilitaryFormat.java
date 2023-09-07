package udemyOcaOne;

import static java.lang.Integer.parseInt;

public class MilitaryFormat {
  public static String timeConversion(String s) {
    String militaryTimeFormat = "";

    String amPm = s.substring(8, 10);
    String toFormat = s.substring(0, 8);
    String toMilitary = s.substring(0, 2);
    String minSec = s.substring(2, 8);
    String newFormat = "";

//    System.out.println(toFormat);
//    System.out.println(toMilitary);
//    System.out.println(minSec);


    String z = s.replace(amPm, "");
    switch (amPm) {

      case "AM":

        if (parseInt(toMilitary) == 12) {

          toMilitary = "00";

        }

        militaryTimeFormat = toMilitary.concat(minSec);

        System.out.println(militaryTimeFormat);
        break;
      case "PM":

        if(parseInt(toMilitary) == 12) {
          militaryTimeFormat = toMilitary.concat(minSec);
          System.out.println(militaryTimeFormat);
        } else {
          int toSum = parseInt(toMilitary) + 12;
//        int newHour = parseInt(toMilitary) + 12;
          militaryTimeFormat = String.valueOf(toSum).concat(minSec);
          System.out.println(militaryTimeFormat);
        }

//        System.out.println(amPm);
//        System.out.println(s);
//        String[] x = z.split(":");
//        int[] w = new int[x.length];
//
//        for (int i=0; i<x.length; i++) {
//          w[i] = parseInt(x[i]);
//        }
//        w[0]+=12;
//
//        System.out.println(Arrays.toString(w));

        break;
      default:
        break;
    }


      return militaryTimeFormat;

  }

  public static void main(String[] args) {
    String s = "12:40:22PM";
    timeConversion(s);
  }
}
