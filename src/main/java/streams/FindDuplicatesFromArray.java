package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesFromArray {
  public static void main(String[] args) {

    List<Integer> integerList = List.of(1, 2, 3, 4, 4, 1);

    Set<Integer> set = new HashSet<>();

    integerList.stream().filter(i -> ! set.add(i)).forEach(System.out::println);

  }
}

