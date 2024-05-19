package strings;

import java.util.List;
import java.util.stream.Collectors;

public class Count_String_Occurances {
  public static void main(String[] args) {
        List<String> names = List.of("Sathish", "Soumil", "Amit", "Kishore", "Sathish");

    names.stream()
      .filter(name -> name.startsWith("S"))
      .collect(Collectors.groupingBy(names1->names1, Collectors.counting()))
      .forEach((name,count) -> System.out.println(name + " " + count));
      }
    }
