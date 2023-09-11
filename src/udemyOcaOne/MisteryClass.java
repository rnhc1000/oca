package udemyOcaOne;

public class MisteryClass {
  public static void main(String[] args) {
    int x = 40;
    int y = 10;
    int result = misteryFunction(x,y);
    System.out.println(result);
  }

  private static int misteryFunction(int x, int y) {
    
    if (y == 0) {
      return x; 
    } else {
      y--;
      misteryFunction(x,y);
    }
    return x;
  }


}
