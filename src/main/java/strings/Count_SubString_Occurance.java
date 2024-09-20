package strings;

public class Count_SubString_Occurance {
  public static void main(String[] args) {

    String theString = "is this good or is this bad?";
    String substring = "this";
    int count=0;

    String[] split = theString.split(" ");

    for (int i=0; i<split.length; i++) {
      if(split[i].equalsIgnoreCase(substring)) {
        count++;
      }
    }
    System.out.println("\"is\" appeared " + count + " times");

  }
}
