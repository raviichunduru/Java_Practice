package numbers;
// Find Nth Fibonacci Number

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    String console = null;

    List<Integer> fibSeries = new ArrayList<>();
    fibSeries.add(0);
    fibSeries.add(1);

    do {
      System.out.println("Enter which fibonacci number you want me to print ?");

      int num = new Scanner(System.in).nextInt();

      if(num<3) {
        System.out.println("enter number greater than or equal to 3");
        break;
      }

      for (int i = 2; i < num; i++) {
        int number1 = fibSeries.get(i - 2);
        int number2 = fibSeries.get(i - 1);
        fibSeries.add(number1 + number2);
      }

      fibSeries.forEach((a) -> System.out.println(a));
      System.out.println(num + " th Fibonacci Number is = " + fibSeries.get(num - 1));

      System.out.println("Do you want to continue? type Y or y");
      console = new Scanner(System.in).next();

    }while(console.equalsIgnoreCase("y"));
  }
}
