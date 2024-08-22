package streams;

import org.apache.commons.math3.primes.Primes;
import java.util.stream.IntStream;

public class PrimeNumbers {
  public static void main(String[] args) {
    IntStream.range(2, 100)
      .filter(Primes::isPrime)
      .filter(i -> Integer.toString(i).contains("3") || Integer.toString(i).contains("7"))
      .forEach(System.out::println);
  }
}
