package strings;

public class StringPalindrome_With_StringBuilder {

  public static void main(String[] args) {

    String s = "abcdba";

    StringBuilder stringBuilder = new StringBuilder();

    for (int i=s.length()-1; i>=0; i--) {
      stringBuilder.append(s.charAt(i));
    }

    String reverseString = stringBuilder.toString();
    if (s.equalsIgnoreCase(reverseString)) {
      System.out.println("String is Palindrome");
    }
    else {
      System.out.println("String is not Palindrome");
    }
  }
}
