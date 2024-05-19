package strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Count_Char_Occurance_In_String {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String consent;
    do {
      System.out.println("Enter String");
      String string = scanner.nextLine();

      char[] charArray = string.toCharArray();
      List<Character> charPrinted = new ArrayList<>();

      for (int i = 0; i < charArray.length; i++) {
        if (charPrinted.contains(charArray[i])) {
          continue;
        }
        int count = 1;
        for (int j = i + 1; j < charArray.length; j++) {
          if (charArray[i] == charArray[j]) {
            count++;
          }
        }
        charPrinted.add(charArray[i]);
        System.out.println(charArray[i] + " presents " + count + " times");
      }
      System.out.println("Do you to want to continue ? y/n");
    } while (scanner.nextLine().equalsIgnoreCase("Y"));
  }
}
