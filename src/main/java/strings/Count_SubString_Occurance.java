package strings;

public class Count_SubString_Occurance {
  public static void main(String[] args) {

    String theString = "is this good or is this bad?";
    String substring = "is";
    int count = 0;

    int index = theString.indexOf(substring);
    while (index != -1) {
      count++;
      index = theString.indexOf(substring, index + 1);
    }
    System.out.println("Number of times substring found " + count);
  }
}
