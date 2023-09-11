package udemyOcaOne;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

abstract class Base{
  abstract int power();
}
abstract class SupA {
  SupA() {
    this(null);
  }
  SupA(SubA s) {
    this.init();
  }
  abstract void init();
}

class SubA extends SupA{
  void init() {
    System.out.println("SubA");
  }

}
class SubBase extends Base {
  @Override
  int power() {
    return 10;
  }
}
public class AbstractClass {
  static void processBase(Base base) {
    SubBase subBase = new SubBase();
    if (base instanceof SubBase) {
      System.out.println(subBase.power());
    }
    System.out.println("subBase is " + subBase);
  }

  public static void main(String[] args) {
    processBase(new SubBase());
    int i=0, j=10;
    var count = 0;
    while(i<j) {
      i++;
      j--;
      count++;
    }
    System.out.println(i + " " + j + " " + count);
    var ca = new char[]{'a','b','c','d','e','f'};
    var key = 0;
    for (var c: ca) {
      switch(c) {
        case 'a' -> {
          key++;
          break;
        }
        case 'b' -> {
          ++key;
          break;
        }
        case 'c', 'd' -> {
          key+=10;
          break;
        }
        case 'e' -> {
          key+=20;
          break;
        }

        case 'f' -> {
          key+=40;
          break;
        }

        default -> throw new IllegalStateException("Unexpected value: " + c);
      }
    }
    System.out.println("i = "+key);

    char[] buf = new char[5];
    try (
      FileReader fr = new FileReader("file.txt");
      FileWriter fw = new FileWriter("fileOne.txt")) {
      while(fr.read(buf) != -1) {
        fw.write(buf);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    SubA supA = new SubA();
  }
}
