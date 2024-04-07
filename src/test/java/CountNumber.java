import java.util.Scanner;

public class CountNumber {
  public static void main(String[] args) {
    String console = null;

    do {
      System.out.println("Enter Number");
      int number = new Scanner(System.in).nextInt();
      System.out.println("Enter integer which you need to count the occurances");
      int numberToCount = new Scanner(System.in).nextInt();
      int count = 0;

      while (number > 0) {
        int remainder = number % 10;
        if (remainder == numberToCount)
          count++;
        number = number / 10;
      }

      System.out.println("Number of times " + numberToCount + " present = " + count);
      System.out.println("Do you want to continue? type Y or y");
      console = new Scanner(System.in).next();

    }while(console.equalsIgnoreCase("y"));
  }
}
