import java.util.Scanner;

public class Number_Palindrome_Check {

  public static void main(String[] args) {
    String consent = null;

    do {
      Scanner console = new Scanner(System.in);
      System.out.println("Enter Number");
      int number = console.nextInt();
      int reverse_number = 0;
      int temp_number = number;

      while (temp_number > 0 )
      {
        int remainder = temp_number % 10;
        reverse_number=reverse_number*10 + remainder;
        temp_number = temp_number/10;
      }

      System.out.println("number = " + number);
      System.out.println("reverse_number = " + reverse_number);

      if (number==reverse_number)
        System.out.println(number + " is palindrome");
      else
        System.out.println(number + " is not palindrome");

      System.out.println("Do you want to continue? type Y or y");
      consent = console.next();
    }while(consent.equalsIgnoreCase("Y"));
  }
}
