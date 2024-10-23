package DayanidhiKB.numbers;

import java.util.List;

public class NthLargestNumber {
  public static void main(String[] args) {
    List<Integer> integerList = List.of(111,12,356,35,455,53535,5355);

    Integer integer = integerList.stream().sorted().skip(3).findFirst().get();
    System.out.println(integer);
  }
}
