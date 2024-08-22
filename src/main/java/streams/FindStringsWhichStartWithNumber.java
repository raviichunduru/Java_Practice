package streams;

import java.util.List;

public class FindStringsWhichStartWithNumber {
  public static void main(String[] args) {

    List<String> list = List.of("1sss", "ssss", "Accc", "9b");

    list.stream().filter(s->Character.isDigit(s.charAt(0))).forEach(System.out::println);
  }
}
