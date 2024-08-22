package assignments;

public class Reverse_String_InSentence {
    public static void main(String[] args) {
      String input = "11223hello822what";

      // Split the input using "\\d+" (one or more digits)
      String[] words = input.split("\\d+");
      System.out.println(words.length);
      for (String word : words) {
        System.out.println(word);
      }

      // Create a StringBuilder to store the reversed sentence
      StringBuilder reversedSentence = new StringBuilder();

      // Iterate through each word and reverse it
      for (String word : words) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        reversedSentence.append(reversedWord);
      }

      System.out.println("Reversed sentence: " + reversedSentence);
    }
  }
