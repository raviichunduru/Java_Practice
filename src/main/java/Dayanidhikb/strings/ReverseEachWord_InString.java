package Dayanidhikb.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord_InString {
  public static void main(String[] args) {
    String word="Java Programming Selenium";

    String collect =
      Arrays.stream(word.split(" ")).map(s -> new StringBuilder(s).reverse().toString()).collect((Collectors.joining(" ")));

    System.out.println(collect);
  }
}
