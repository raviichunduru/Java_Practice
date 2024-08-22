package streams;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordOfString {
  public static void main(String[] args) {

    String s = "I am Good Boy";

    String result = Stream.of(s.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining( " "));
    System.out.println("result = " + result);
  }
}
