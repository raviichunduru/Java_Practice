package DayanidhiKB.strings;

public class Count_Of_Particular_Character_in_given_String {
  public static void main(String[] args) {

    String s = "raghavaiah";
    char charToCount = 'a';
    int count = 0;

    char[] charArray = s.toCharArray();

    for (char c : charArray) {
      if (c== charToCount) {
        count ++ ;
      }
    }
    System.out.println("character "+charToCount +" appeared "+count + " times");
  }
}
