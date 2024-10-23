package DayanidhiKB.strings;

public class ReverseWholeSentence {
  public static void main(String[] args) {

    String str = "Hello I am Praveen";
    String[] split = str.split(" ");

    StringBuilder sb = new StringBuilder();

    for (int i = split.length-1; i >= 0; i--) {
      sb.append(split[i]).append(" ");
    }
    System.out.println(sb.toString());
  }
}
