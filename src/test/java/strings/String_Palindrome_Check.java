package strings;

import java.util.Scanner;

public class String_Palindrome_Check {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String consent = null;
    do {
      System.out.println("Enter String which you want to check");
      String s = scanner.nextLine();

      if (isPalindrome(s))
        System.out.println(s + " is Palindrome");
      else
        System.out.println(s + " is not Palindrome");

      System.out.println("Do you want to continue ? ");
      consent = scanner.nextLine();
    }while (consent.equalsIgnoreCase("y"));
  }

  public static boolean isPalindrome(String string) {
    boolean isPalindrome = true;
    
    for (int i=0; i < string.length()/2; i++) {
      char start = string.charAt(i);
      char end = string.charAt(string.length() - 1 - i);
      if (start != end) {
        isPalindrome = false;
        break;
      }
    }
    return isPalindrome;
  }
}
