package Dayanidhikb.strings;

public class StringExpansion {
  public static void main(String[] args) {
    String input="a3b2c3";
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < input.length(); i++) {
      if(Character.isDigit(input.charAt(i))) {
        int numericValue = Character.getNumericValue(input.charAt(i));
        for (int j = 0; j<numericValue; j++) {
          sb.append(input.charAt(i-1));
        }
      }
    }

    System.out.println(sb.toString());
  }
}
