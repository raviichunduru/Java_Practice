package DayanidhiKB.numbers;

import java.util.Scanner;

public class SumOfDigits_InNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.println("Enter number : ");

      int num = scanner.nextInt();
      int temp = num;
      int sum=0;

      do {
        int remainder = temp % 10;
        sum = sum+remainder;
        temp = temp / 10;
      }while(temp!=0);

      System.out.println(sum);

      System.out.println("do you want to continue : y or n");
    }while (scanner.next().equals("y"));
  }
}
