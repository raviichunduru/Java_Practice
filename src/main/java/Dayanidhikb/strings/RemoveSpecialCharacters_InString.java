package Dayanidhikb.strings;

public class RemoveSpecialCharacters_InString {
  public static void main(String[] args) {

    String s="@@$$%%%'';;/./ Selenium";
    String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
    System.out.println(s1);
  }
}
