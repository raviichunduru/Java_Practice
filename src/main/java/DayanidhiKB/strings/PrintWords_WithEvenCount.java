package DayanidhiKB.strings;

public class PrintWords_WithEvenCount {
  public static void main(String[] args) {

    String inputSentence = "Java I am testing this program";

    String[] split = inputSentence.split(" ");
    for (String s : split) {
      if (s.length()%2==0) {
        System.out.println(s);
      }
    }
  }
}
