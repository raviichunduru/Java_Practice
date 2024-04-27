package strings;

public class StringConcatUsingStringBuilder {
  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < 26; i++) {
      stringBuilder.append((char) ('a'+i));  // same strings gets updated as string builder is mutable
    }
    System.out.println("stringBuilder = " + stringBuilder);
  }
}
