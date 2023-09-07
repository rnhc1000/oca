package udemyOcaOne;

import java.util.LinkedHashMap;

public class Test7SwiftCode {

  public static void m1() throws Exception {

    System.out.println("There's no exception");

  }


  public static LinkedHashMap<String, String> processSwiftCodes(String swiftCodeToBeProcessed) {

    LinkedHashMap<String, String> breakDown = new LinkedHashMap<>();

    if (swiftCodeToBeProcessed.length() != 11) {
      return breakDown;
    }
    enum SwiftCodes {
      ICIC, IN, BB, RT4
    }

        /*
          ICIC - Bank Code
          IN - Country Code
          BB - Location Code
          RT4 - Branch code
         */

    String icic = swiftCodeToBeProcessed.substring(0, 4);
    String in = swiftCodeToBeProcessed.substring(4, 6);
    String bb = swiftCodeToBeProcessed.substring(6, 8);
    String rt4 = swiftCodeToBeProcessed.substring(8, 11);

    breakDown.put(SwiftCodes.ICIC.toString(), icic);
    breakDown.put(SwiftCodes.IN.toString(), in);
    breakDown.put(SwiftCodes.BB.toString(), bb);
    breakDown.put(SwiftCodes.RT4.toString(), rt4);

    return breakDown;
  }

  public static void main(String[] args) throws Exception {

    LinkedHashMap<String, String> response;
    String swiftCode = "A001BRSPSPO";
    response = processSwiftCodes(swiftCode);
    double price = 100;

    price += Math.random()*price ;
    System.out.println(price);

    if (response.isEmpty()) {

      System.out.println("SwiftCode Invalido! Apenas 11 digitos!");
    } else {
      System.out.println(response);
    }

    m1();
    String car="";
    car = (price > 150) ?  "Tesla" : "BMW";
    System.out.println(car);
  }
}


