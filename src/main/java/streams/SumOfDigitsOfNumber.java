package streams;

import java.util.Arrays;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfDigitsOfNumber {
  public static void main(String[] args) {

    int num = 12345;
    int sum = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).sum();
    System.out.println("sum = " + sum);
  }
}
