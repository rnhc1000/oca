package udemyOcaOne;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;

@ClassPreamble (
        author = "Ricardo Ferreira",
        date = "25/08/2023",
        currentRevision = 6,
        lastModified = "25/08/2023",
        lastModifiedBy = "Ricardo Ferreira",
        reviewers = {}
)
public class CaesarCipher {
  public static String caesarCipher(String s, int k) {
    StringBuilder cipherText = new StringBuilder();
    char c;
    LocalDate date = LocalDate.now();
    System.out.println(date);
    Locale brasil = new Locale("pt", "BR");
    System.out.println(date.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));


    //char[] beforeCipher = s.toCharArray();
    char[] afterCipher = new char[s.length()];
    //System.out.println(s);
    for (int j = 0; j < s.length(); j++) {

      //afterCipher[j] = (char) (beforeCipher[j] + k);
      c = s.charAt(j);
      //System.out.print(c);
      if (Character.isLetter(c)) {
        //if ((c >= 'A' && c <= 'Z') || ((c >= 'a') && (c <= 'z'))) {
        char cc = c += k;
        if (Character.isLetter(cc)) {
          afterCipher[j] = c;
        } else {
          cc -= 26;
          afterCipher[j] = cc;
        }//System.out.print(c);
      } else {
        afterCipher[j] = c;
      }
    }
    for (char x : afterCipher) {
      cipherText.append(x);
    }

    int[] num = { 9,10,12,25,2};

    int maior = Integer.MIN_VALUE;
    int menor = num[0];
    int media = 0;

    for (int i : num) {

      if (i > maior) {
        maior = i;
      } else if (i < menor) {
        menor = i;
      }
      media += i;
    }
    int average = media/num.length;
    System.out.println(maior + " " + menor + " "  + average);
    return cipherText.toString();
  }

  public static int[] mat(int[] xxx) {
    int[] y = new int[xxx.length];
    for ( int i=0; i<xxx.length; i++)
      y[i] = xxx[i] * 10;
    //System.out.println(Arrays.toString(xxx));
    return y;
  }

  public static void main(String[] args) {
    String cipher;
    String clearText = "www.abc.x";
    int k = 87;
    cipher = caesarCipher(clearText, k);
    System.out.println(cipher);
    int[] m = {1,2,3,4,5,6};
    int[] n = new int[5];

    System.out.println(Arrays.toString(mat(m)));




  }
}
