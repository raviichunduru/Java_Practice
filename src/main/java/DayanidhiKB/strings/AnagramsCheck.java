package DayanidhiKB.strings;

import java.util.*;

public class AnagramsCheck {
  public static void main(String[] args) {

    if (checkIfAnagrams ("listen","silent" )) {
      System.out.println("Anagrams");
    }
    else
      System.out.println("Not Anagrams");
  }


  public static boolean checkIfAnagrams (String s1, String s2) {
    char[] charArray1 = s1.toCharArray();
    char[] charArray2 = s2.toCharArray();

    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    return Arrays.equals(charArray1,charArray2);
  }
}
