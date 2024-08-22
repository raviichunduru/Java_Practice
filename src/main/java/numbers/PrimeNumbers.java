package numbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
  public static void main(String[] args) {
    List<Integer> primeNumbers = new ArrayList<>();

    for (Integer i = 2; i <= 100; i++) {
      if (isPrimeNumber(i) && (i.toString().contains("3") || i.toString().contains("7"))) {
                 primeNumbers.add(i);
        }
      }
      primeNumbers.forEach(System.out::println);
    }

  private static boolean isPrimeNumber(Integer i) {
    for (int j = 2; j < Math.sqrt(i); j++) {
      if (i%j == 0 ) return false;
    }
    return true;
  }
}
