package DayanidhiKB.numbers;

import com.github.dockerjava.api.model.Ulimit;

import java.util.Arrays;
import java.util.List;

public class FibSeries {
  public static void main(String[] args) {

    printFibSeries(10);
  }

  private static void printFibSeries(int limit) {

    int[] fib = new int[limit];

    fib[0]=0;
    fib[1]=1;

    for (int i = 2; i <= limit-1; i++) {
      fib[i]=fib[i-2]+fib[i-1];
    }

    Arrays.stream(fib).forEach(a-> System.out.println(a));
  }
}
