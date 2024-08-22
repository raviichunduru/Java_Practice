package streams;

import java.util.stream.IntStream;

public class SumOfFirstTenNumbers {
  public static void main(String[] args) {

    int sum = IntStream.range(1, 10).sum();
    System.out.println("sum = " + sum);
  }
}
