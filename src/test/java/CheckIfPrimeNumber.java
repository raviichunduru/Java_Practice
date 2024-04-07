import java.util.Scanner;

public class CheckIfPrimeNumber {

  public static void main(String[] args) {
    String consent = null;

    do {
      Scanner console = new Scanner(System.in);
      System.out.println("enter number");
      int number = console.nextInt();

      boolean isPrime = true;

      for(int i=2; i<Math.sqrt(number); i++)
      {
        if(number%i == 0)
        {
          isPrime = false;
          break;
        }
      }

      if (isPrime)
        System.out.println(number + " is prime number");
      else
        System.out.println(number + " is not prime number");

      System.out.println("Do you want to continue? type Y or y");
      consent = console.next();
    }while(consent.equalsIgnoreCase("Y"));
  }
}
