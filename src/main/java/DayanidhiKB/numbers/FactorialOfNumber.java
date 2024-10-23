package DayanidhiKB.numbers;

import java.util.Scanner;

public class FactorialOfNumber {
  public static void main(String[] args) {

    int factorial = 1;

    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Enter number : ");

      int num = scanner.nextInt();
     for(int i=1; i<=num; i++) {
       factorial=factorial*i;
     }

      System.out.println(factorial);
      factorial=1;

      System.out.println("do you want to continue : y or n");
    } while (scanner.next().equals("y"));
  }
}
