package udemyOcaOne;

public class Message {
   static void main(String[] args) {
    System.out.println("Welcome " + args);
  }
}

class Guest {

   public static void main(String ... args) {
     Message.main(args);

  }
}
