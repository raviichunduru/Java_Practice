package strings;

import java.util.List;
import java.util.stream.Collectors;

public class Replace_Char_With_Its_Occurance_Count {

  public static void main(String[] args) {
    String sentence = "Java Application";

    StringBuilder stringBuilder = new StringBuilder();
    int count=0;

    char[] charArray = sentence.toCharArray();

    for (int i = 0; i < sentence.toCharArray().length; i++) {
      if (charArray[i] == 'a' || charArray[i] == 'A') {
        count++;
        appendToString(stringBuilder, count);
      }
      else {
        stringBuilder.append(charArray[i]);
      }
    }
    System.out.println("OutPut = " + stringBuilder);
  }

  private static void appendToString(StringBuilder stringBuilder, int count) {
    for (int i=0;i<count;i++) {
      stringBuilder.append('@');
    }
  }
}
