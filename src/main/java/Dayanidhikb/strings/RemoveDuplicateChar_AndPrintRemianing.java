package Dayanidhikb.strings;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicateChar_AndPrintRemianing {

  public static void main(String[] args) {
    String original = "School";
    Set<Character> withOuDuplicates = new HashSet<>();

    for (int i = 0; i < original.length(); i++) {
      withOuDuplicates.add(original.charAt(i));
    }
    System.out.println("withOuDuplicates = " + withOuDuplicates.toString());
  }
  }


