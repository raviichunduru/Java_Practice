import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
  public static void main(String[] args) {
    getFibSeries(10).forEach(i-> System.out.println(i + " "));
  }

  private static List<Integer> getFibSeries(int limit) {

    List<Integer> fib = new ArrayList<>();
    fib.add(0);
    fib.add(1);

    for (int i=2 ; i<limit; i++) {
      fib.add(fib.get(i - 2) + fib.get(i - 1));
    }
    return fib;
  }
}
