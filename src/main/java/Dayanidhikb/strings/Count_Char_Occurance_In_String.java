package Dayanidhikb.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count_Char_Occurance_In_String {
  public static void main(String[] args) {

    String s = "raghavaiah";
    char[] charArray = s.toCharArray();

    List<Character> verifiedChar = new ArrayList<>();
    Map<Character, Integer> charCount = new HashMap<>();

    int count = 1;

    for (int i = 0; i < charArray.length; i++) {
      if(verifiedChar.contains(charArray[i])) {
        continue;
      }
      for (int j = i+1; j < charArray.length; j++) {
        if(charArray[i]==charArray[j]) {
          count++;
      }
      }
      verifiedChar.add(charArray[i]);
      charCount.put(charArray[i], count);
      count=1;
    }

    for (Map.Entry<Character, Integer> entry: charCount.entrySet()) {
      System.out.println(entry.getKey() + "  "+ entry.getValue());
    }
  }
}

