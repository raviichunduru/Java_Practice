public class StaticVariableExample {

  static int staticVariable = 10;

  public static void main(String[] args) {
    StaticVariableExample obj1 = new StaticVariableExample();
    StaticVariableExample obj2 = new StaticVariableExample();

    // Print initial values
    System.out.println("Initial values:");
    System.out.println("obj1.staticVariable = " + obj1.staticVariable);
    System.out.println("obj2.staticVariable = " + obj2.staticVariable);

    // Change staticVariable through obj1
    obj1.staticVariable = 20;

    // Print values after change
    System.out.println("\nValues after changing staticVariable through obj1:");
    System.out.println("obj1.staticVariable = " + obj1.staticVariable);
    System.out.println("obj2.staticVariable = " + obj2.staticVariable);

    // Change staticVariable through obj2
    obj2.staticVariable = 30;

    // Print values after change
    System.out.println("\nValues after changing staticVariable through obj2:");
    System.out.println("obj1.staticVariable = " + obj1.staticVariable);
    System.out.println("obj2.staticVariable = " + obj2.staticVariable);
  }
}
