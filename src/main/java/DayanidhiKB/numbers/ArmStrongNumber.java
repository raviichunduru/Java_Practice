package DayanidhiKB.numbers;

import java.util.Scanner;

public class ArmStrongNumber {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Enter number : ");

      int num = scanner.nextInt();
      int temp = num;
      int num1 = 0;

      String s = String.valueOf(num);
      int countOfDigits = s.length();

      do {
        int n = temp % 10;
        num1 += Math.pow(n, countOfDigits);
        temp = temp / 10;
      } while (temp > 0);

      if (num == num1) {
        System.out.println("Armstrong");
      } else {
        System.out.println("not armstrong");
      }

      System.out.println("do you want to continue : y or n");
    }while (scanner.next().equals("y"));
  }
}
