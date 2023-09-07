package udemyOcaOne;

import java.util.Arrays;

/**
 * @author rferreira
 * Two different strings as input and return
 * a boolean if one is anagram of the other
 * 1. eliminate spaces, convert to lower,
 * 2. associate tpo an array and sort.
 * 3. if one is equals to the other sorted
 * 4. we have an anagram, otherwise not
 * 5. first check if the strings' length
 * 6. are different return false;
 */
public class Anagrama {
  public static void main(String[] args) {
    //String s1 = "The quick brown fox dog jumps over the lazy dog";
    //String s2 = "brown fox quick the dog jumps dog the lazy over";
    String s1 = "Ricardo FERREira";
    String s2 = "FERREIRA    RICARDo";


    boolean response =  isAnagram(s1,s2);
    if (response) {
      System.out.println("S1 and S2 are anagrams!");
    } else {
      System.out.println("The two strings are not anagram of each other!");
    }
  }

  public static boolean isAnagram(String s1, String s2) {
    boolean response = false;
    String regex = "\\s";
    s1 = s1.replaceAll(regex,"");
    s2 = s2.replaceAll(regex, "");
    int lenS1 = s1.length();
    int lenS2 = s2.length();

    if (lenS1 != lenS2)
      return false;
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();

    System.out.println(s1);
    System.out.println(s2);

    char [] s1aux = s1.toCharArray();
    char [] s2aux = s1.toCharArray();

    Arrays.sort(s1aux);
    Arrays.sort(s2aux);
    System.out.println(s1aux);
    System.out.println(s2aux);

    s1 = String.valueOf(s1aux);
    s2 = String.valueOf(s2aux);

    if (s1.equals(s2)){
      response = true;
    }
    return response;
  }
}
