package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeMaxMinFromList {
  public static void main(String[] args) {

    List<Integer> integerList = List.of(11, 45, 32, 678, 5444, 1111, 888, 434, 67676);

    System.out.println("6th max value " + integerList.stream().sorted().skip(5).findFirst().get());
    System.out.println("First three small numbers " + integerList.stream().sorted().limit(3).collect(Collectors.toList()).toString());
    System.out.println("First three large numbers " + integerList.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList()).toString());
  }
}
