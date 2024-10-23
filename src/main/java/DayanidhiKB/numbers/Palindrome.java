package DayanidhiKB.numbers;

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
    do {
    System.out.println("Enter number : ");

    int num = scanner.nextInt();
    int temp = num;
    int reverseNum=0;

    do {
      int remainder = temp % 10;
      reverseNum = (reverseNum*10)+remainder;
      temp = temp / 10;
    }while(temp!=0);

    if (num == reverseNum) {
      System.out.println("Palindrome");
    } else {
      System.out.println("not Palindrome");
    }

    System.out.println("do you want to continue : y or n");
  }while (scanner.next().equals("y"));
}
}
