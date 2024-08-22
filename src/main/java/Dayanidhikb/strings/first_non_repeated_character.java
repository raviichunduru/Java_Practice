package Dayanidhikb.strings;

import java.util.ArrayList;
import java.util.List;

public class first_non_repeated_character {
  public static void main(String[] args) {

        String s = "ababcdcef";
        char[] charArray = s.toCharArray();
        List<Character> checkedElements = new ArrayList<>();

        for (int i=0; i< charArray.length; i++) {
          if(checkedElements.contains(charArray[i])) {
            continue;
          }
          for (int j=i+1; j<charArray.length; j++) {
            if(charArray[i]==charArray[j]) {
              checkedElements.add(charArray[i]);
              break;
            }
          }
          if(!checkedElements.contains(charArray[i])) {
            System.out.println("first non repeated character : " + charArray[i]);
            break;
          }
        }
      }
}
