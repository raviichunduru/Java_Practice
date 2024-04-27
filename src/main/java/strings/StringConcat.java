package strings;

public class StringConcat {
  public static void main(String[] args) {
    String series="";

    for (int i=0; i<26; i++) {
      char ch = (char) ('a' + i);
      series+=ch;  // as strings are immutable, every time you altering,, a new string gets created here
    }
    System.out.println("series = " + series);
  }
}
