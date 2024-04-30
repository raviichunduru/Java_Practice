public class Runner {

  public static void main(String[] args)  {
    try {
      System.out.println("Division_Operation(100,0) = " + Division_Operation(100, 0));
    } catch (ArithmeticException e) {
      System.out.println("Error: Division by zero.");
    }
  }

  public static double Division_Operation(double dividend, double diviser){
    if (diviser == 0) {
      throw new ArithmeticException("Division by zero is not allowed.");
    }
    return dividend / diviser;
  }
}
