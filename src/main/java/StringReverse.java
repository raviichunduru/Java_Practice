public class StringReverse {

  public static void main(String[] args) {
    String originalString = "abcd";
    String reversedString = reverseString(originalString);
    System.out.println(reversedString);
  }

  private static String reverseString(String original) {

    char[] charArray = original.toCharArray();
    StringBuilder sb = new StringBuilder("");

    for (int i = charArray.length-1; i >-1; i--) {
      sb.append(charArray[i]);
    }
    return sb.toString();
  }
}
