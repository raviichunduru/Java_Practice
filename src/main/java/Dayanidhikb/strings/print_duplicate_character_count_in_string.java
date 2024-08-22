package Dayanidhikb.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class print_duplicate_character_count_in_string {

  public static void main(String[] args) {

    String s = "raghavaiah";
    char[] charArray = s.toCharArray();
    Integer count = 1;
    Map<Character, Integer> charCount = new HashMap<>();

    for(int i =0; i<charArray.length; i++) {

      if(charCount.containsKey(charArray[i])) {
        continue;
      }

      for(int j=i+1; j<charArray.length; j++) {
        if(charArray[i] == charArray[j]) {
          count++;
        }
      }
      charCount.put(charArray[i],count);
      count=1;
    }

    Iterator iterator = charCount.entrySet().iterator();

    while (iterator.hasNext()) {
      Map.Entry<Character, Integer> entry = (Map.Entry<Character, Integer>) iterator.next();
      if(entry.getValue() > 1) {
        System.out.println(entry.getKey() + " is duplicate, appeared " +entry.getValue() +" times");
      }
    }
  }
}
