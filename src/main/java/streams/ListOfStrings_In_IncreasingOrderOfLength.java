package streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStrings_In_IncreasingOrderOfLength {
  public static void main(String[] args) {

    List<String> stringList = List.of("abc", "ddwdw", "a", "aa");
    System.out.println(
      "Strings In Increasing Order Of Length  :  " +
        stringList.stream().sorted(Comparator.comparing(string -> string.length())).collect(Collectors.toList()).toString());
  }
}
