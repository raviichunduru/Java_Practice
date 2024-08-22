package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class StringAnagramCheck {
  public static void main(String[] args) {

    String s1 = "listen";
    String s2 = "silent";

    String string1 = Arrays.stream(s1.split("")).map(s -> s.toLowerCase()).sorted().collect(Collectors.joining());
    String string2 = Arrays.stream(s2.split("")).map(s -> s.toLowerCase()).sorted().collect(Collectors.joining());

    if (string1.equals(string2)) {
      System.out.println("Anagrams");
    }
    else
      System.out.println("not anagrams");
  }


}
