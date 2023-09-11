package udemyOcaOne;

import java.util.Scanner;

public class BootCampScanner {

  public static void main(String[] args) {
    String test = "";
    System.out.println("Learn The Part >>: Java Test");
    Scanner input = new Scanner(System.in);
    test = input.nextLine();
    //Solution One
    if (!test.equals("hit") && !test.equals("stay")) {
      System.out.println("Invalid option");
    } else {
      System.out.println("Result-> " + test);
    }
    //Solution Two
    if (! (test.equals("hit") || (test.equals("stay")))) {
      System.out.println("Invalid option");
    } else {
      System.out.println("Result-> " + test);
    }
    // Solution Three
    int count = 2;
    while (count != 0) {
      System.out.println("Learn The Part >>: Java Test");
      System.out.print("Would u like to hit or stay? ");
      input = new Scanner(System.in);
      test = input.nextLine();
      if (test.equals("hit") || test.equals("stay")) {
        System.out.println(test);
        System.out.println("End Turn");
      } else {
        System.out.println(test);
        System.out.println("Invalid Option");
        break;
      }
      count--;
    }


  }
}
