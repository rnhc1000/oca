package udemyOcaOne;

import java.util.Arrays;

/**
 * @author rferreira
 * @code @t
 * An anagram is a word or phrase formed by rearranging the letters
 * of a different word or phrase, typically using all the original
 * letters exactly once.(https://en.wikipedia.org/wiki/Anagram)
 * secure" is an anagram of "rescue
 * Two different strings as input and return
 * a boolean if one is anagram of the other
 * 1. eliminate spaces, convert to lower,
 * 2. associate to an array and sort.
 * 3. if one is equals to the other sorted
 * 4. we have an anagram, otherwise not
 * 5. first check if the strings' length
 * 6. are different return false;
 */

 @ClassPreamble(
  author = "Ricardo Ferreira", 
  date = "25/08/2023", 
  currentRevision = 7, 
  lastModified = "25/09/2023", 
  lastModifiedBy = "Ricardo Ferreira", 
  reviewers = {}
  )

public class Anagrama {
  public static void main(String[] args) {
    String s1 = "The quick brown fox dog jumps over the lazy dog";
    String s2 = "brown fox quick the dog jumps do the lazy over";

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
    int lenStrOne = s1.length();
    int lenStrTwo = s2.length();

    if (lenStrOne != lenStrTwo)
      return false;
      
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();

    char [] s1Auxiliar = s1.toCharArray();
    char [] s2Auxiliar = s2.toCharArray();

    Arrays.sort(s1Auxiliar);
    Arrays.sort(s2Auxiliar);

    s1 = String.valueOf(s1Auxiliar);
    s2 = String.valueOf(s2Auxiliar);

    if (s1.equals(s2)) response = true;

    return response;
  }
}
