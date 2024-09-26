package Dayanidhikb.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateWords_FromSentence {
  public static void main(String[] args) {

    String originalSentence = "Hello I am Praveen Praveen am";

    String[] split = originalSentence.split(" ");

    String sentenceWithOutDuplicateWords = Arrays.stream(split).distinct().collect(Collectors.joining(" "));
    System.out.println("sentenceWithOutDuplicateWords = " + sentenceWithOutDuplicateWords);
  }
}
