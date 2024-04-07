public class String_Immutability {
  public static void main(String[] args) {
    String s1 = "Ravi";
    s1 = "Ravi_New";  // here s1 will point to new string & "Ravi" will be garbage collected
    System.out.println("s1 = " + s1);

    String s4 = "Ravi";
    String s5 = "Ravi";

    System.out.println(s4 == s5); // both reference variables are pointing to same object. also it checks if references are same, not values
    System.out.println(s4.equals(s5)); // this compares values


    String s2 = new String("Raju");
    String s3 = new String("Raju");


    System.out.println(s2 == s3); // both reference variables are pointing to same object different objects of same value
    System.out.println(s2.equals(s3)); // when we compare value, it will be equal
  }
}
