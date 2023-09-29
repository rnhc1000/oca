package udemyOcaOne;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author rferreira
 * @code @t
 *       An abstract class is one that cannot be instantiated and
 *       must be extended only, so here we have the inheritance OOP concept in
 *       place.
 *       This class can include abstract or concrete methods and the subclasses
 *       extending an abstract class must implement their methods.
 * 
 *       Use Cases
 *       You want to share code among several closely related classes.
 * 
 *       You expect that classes that extend your abstract class have
 *       many common methods or fields, or require access modifiers other
 *       than public (such as protected and private).
 * 
 *       You want to declare non-static or non-final fields.
 *       This enables you to define methods that can access and modify the state
 *       of the
 *       object to which they belong.
 * 
 *       Source:
 *       https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html#:~:text=An%20abstract%20class%20is%20a,but%20they%20can%20be%20subclassed.&text=When%20an%20abstract%20class%20is,methods%20in%20its%20parent%20class.
 * 
 *       Example:
 *       public abstract class AbstractMap<K,V> extends Object implements
 *       Map<K,V>
 * 
 * 
 */

@ClassPreamble(
  author = "Ricardo Ferreira", 
  date = "25/08/2023", 
  currentRevision = 7, 
  lastModified = "25/09/2023", 
  lastModifiedBy = "Ricardo Ferreira", 
  reviewers = {}
  )

abstract class Base {
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

class SubA extends SupA {
  @Override
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
    } else {
      System.out.println("subBase is " + subBase);
    }
  }

  public static void main(String[] args) {
    processBase(new SubBase());

  }
}
