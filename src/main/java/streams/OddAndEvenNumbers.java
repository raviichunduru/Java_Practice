package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddAndEvenNumbers {

  public static void main(String[] args) {
    
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
    Map<Boolean, List<Integer>> evenOddMap = integerList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));

    List<Integer> evenNumbers = evenOddMap.get(true);
    System.out.println("evenNumbers " + evenNumbers.toString());
    List<Integer> oddNumbers = evenOddMap.get(false);
    System.out.println("oddNumbers " + oddNumbers.toString());
  }
}
