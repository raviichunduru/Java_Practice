package Dayanidhikb.strings;

import java.util.HashMap;
import java.util.Map;

public class first_non_repeated_character_using_map {
  public static void main(String[] args) {
    String s = "ababcdcef";
    char[] charArray = s.toCharArray();
    Map<Character, Integer> charCount = new HashMap<>();

    for (char c : charArray) {
      charCount.put(c, charCount.getOrDefault(c,0)+1);
    }

    for (char c : charArray) {
      if(charCount.get(c) == 1) {
        System.out.println("First non-repeated character: " + c);
        break;
      }
    }
  }
}
