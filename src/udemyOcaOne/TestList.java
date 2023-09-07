package udemyOcaOne;

import java.util.*;

class Test {
  static {
    System.out.println(1 / 0);
  }
}

class Student {
  private String name;
  private int age;

  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String toString() {
    return "Student[" + name + ", " + age + "]";
  }
}

public class TestList {
  public static void main(String[] args) {
    Set<Student> students = new HashSet<>();
    students.add(new Student("James", 25));
    students.add(new Student("James", 27));
    students.add(new Student("James", 25));
    students.add(new Student("James", 25));

    students.remove(new Student("James", 25));

    for (Student stud : students) {
      System.out.println(stud);
    }

    List<Integer> list = new ArrayList<>();
    list.add(100);
    list.add(200);
    list.add(100);
    list.add(200);
    list.remove(3);

    System.out.println(list);
    String s1 = "OCJPA";
    String s2 = "OCJPA" + "";

    boolean f;
    f = s1.equals(s2);

    boolean g = false;
    if (s1 == s2) {
       g = true;
    }
    ;
    System.out.println(f + " " + g);
  }
}


