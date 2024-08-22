package strings;

// print in expected format

public class String_Words_Reverse {
  public static void main(String[] args) {

    String original = "i am xyz employee";
    StringBuilder stringBuilder =  new StringBuilder();

    String[] strArray = original.split(" ");

    for (String word : strArray) {
      String reversedWord = new StringBuilder(word).reverse().toString();
      String reversedWordWithFirstCharUpper = Character.toUpperCase(reversedWord.charAt(0)) + reversedWord.substring(1);
      stringBuilder.append(reversedWordWithFirstCharUpper + " ");
    }
    System.out.println("string with reverse words = " + stringBuilder.toString());
  }
}
