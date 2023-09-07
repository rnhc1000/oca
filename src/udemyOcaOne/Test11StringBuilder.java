package udemyOcaOne;

public class Test11StringBuilder {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();

    System.out.println(sb.append("null").length());
    //System.out.println(sb.append(null).length());
    // compiling error

  }
}
