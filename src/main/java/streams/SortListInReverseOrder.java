package streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListInReverseOrder {

  public static void main(String[] args) {

    List<String> stringList = List.of("frewgf", "gege", "rwqrfwfw", "kjyukjyukhj");
    System.out.println(stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).toString());
  }
}
