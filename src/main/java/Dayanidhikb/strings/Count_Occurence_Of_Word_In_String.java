package Dayanidhikb.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Count_Occurence_Of_Word_In_String {
  public static void main(String[] args) {

    String s="Java-Program-Java-Program-Selenium";
    String[]  words = s.split("-");
    Map<String, Integer> wordCount = new HashMap<>();

    Integer count=1;

    for(int i =0; i< words.length; i++) {
      if(wordCount.containsKey(words[i])) {
        continue;
      }
      for(int j=i+1; j<words.length; j++) {
        if (words[i].equals(words[j])) {
          count++;
        }
      }

      wordCount.put(words[i], count);
      count=1;
    }

    Iterator iterator = wordCount.entrySet().iterator();

    while (iterator.hasNext()) {
      Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) iterator.next();
      System.out.println(entry.getKey() + " " +entry.getValue());
    }
  }
}
