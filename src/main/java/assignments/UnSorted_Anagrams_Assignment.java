package assignments;

import java.util.ArrayList;
import java.util.List;

public class UnSorted_Anagrams_Assignment {
  public static void main(String[] args) {
    String[] unsortedAnagrams = {"tac","cat","ouy","you","uiu"};

    List<String> originalStringList = new ArrayList<>(List.of(unsortedAnagrams));
    List<String> resultStringList = new ArrayList<>();

    System.out.println("originalStringList = " + originalStringList);

    for (String string : originalStringList) {
      String reverseString = reverseString(string);
      if (originalStringList.contains(reverseString)) {
        resultStringList.add(string);
      }
    }
    System.out.println("resultStringList = " + resultStringList);
  }

  private static String reverseString(String string) {
    StringBuilder stringBuilder = new StringBuilder();

    char[] charArray = string.toCharArray();

    for (int i=charArray.length-1;i!=-1;i--) {
      stringBuilder.append(charArray[i]);
    }
    return stringBuilder.toString();
  }
}