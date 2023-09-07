package udemyOcaOne;


import javax.naming.InvalidNameException;
import javax.naming.NamingException;
import java.util.*;
import java.util.stream.Stream;

import static udemyOcaOne.Account.AccountType;
import static udemyOcaOne.WordStream.getWords;

class Submission{
  String title;
  String getTitle() {
    return title;
  }

   boolean hasTitle() {
    if(title != null) return !title.isBlank();
    else {
      return false;
    }
  }
}

class User {
  public void register() {
    System.out.println("User");
  }
}

class Administrator extends User {
  public void register() {
    System.out.println("Administrator");
  }
}

class Account {
  public  enum AccountType {
    SAVINGS,
    CHECKING
  }
}
class WordStream{
  public static Stream<String> getWords(String firstWord, String secondWord) {
    return Stream.of(firstWord, secondWord);
  }
}
public class NamingExceptionsClass {
  public void bind() {
    try {
      throw new NamingException("Naming Failure");
    } catch (Exception e) {
      try {
        throw new InvalidNameException(("Empty name not allowed"));
      } catch (NamingException ex) {
        e.printStackTrace();
        System.out.println("Bind failed");
      }
    }
  }

  public static void main(String[] args) {
    new NamingExceptionsClass().bind();

    Submission s1 = new Submission();
    Submission s2 = new Submission();
    s1.title = "Submission One";
    s2.title = "Submission Two";
    List<Submission> list = Arrays.asList(s1, s2);
    list.stream().filter(Submission::hasTitle).forEach(System.out::println);

    User user = new Administrator();
    user.register();
    Administrator administrator = new Administrator();
    administrator.register();
    reverse("Ricardo");
    int timer;
    do {
      timer = 10;
      do {
        timer--;
      } while (timer > 0);
      break;
    } while (true);
    System.out.println(timer);
    AccountType account =  Account.AccountType.SAVINGS;
    switch(account) {
      case SAVINGS:
        System.out.println("SAVINGS ");
      case CHECKING:
        System.out.println("CHECKING");
    }

    List<Map<List<String>, List<Double>>> listDouble = new ArrayList<>();
    Map<List<String>, List<Double>> map = new HashMap<>();
    listDouble.add(null);
    listDouble.add(map);
    listDouble.add(new HashMap<List<String>,List<Double>>());
    for (Map entry: listDouble) {
      System.out.println(   entry+ " ");
    }

    List<String> airports = Arrays.asList("CGH", "SDR", "JFK");
    for (String orig: airports) {
      for (String dest: airports) {
        if (orig.equals(dest)) {
          System.out.println(orig + " - " + dest);
        }
      }
    }

    Stream<Integer> numbers = Stream.of(4,9,5);
    Comparator<Integer> comparator = (f,g) -> (f - g);
    //Comparator<Integer> comparator = Comparator.comparingInt(f -> f);

    numbers.sorted(comparator).forEach(System.out::println);
    String answer =
            Stream.of(getWords("voyage", "rue"),getWords("habitude", "quel"), getWords("grateful", "r"),getWords("oui", "parfait"))
                    .flatMap(x -> x)
                    .filter(x -> !x.isEmpty())
                    .max((a,b) -> b.length() - a.length())
                    .get();

    System.out.println(answer.toString());
    //System.out.println("Reverse -> "+str);


  }

  public static void reverse(String s) {
    //char[] rev = new char[s.length()];
    char rev=' ';
    int key = 0;
    if (s == null|| s.isEmpty()) {
      System.out.println(s);
    } else {
      rev = s.charAt(s.length()-1);
      System.out.print(rev);
      //System.out.print(s.charAt(s.length()-1));
      reverse(s.substring(0, s.length()-1));
    }
  }
}
