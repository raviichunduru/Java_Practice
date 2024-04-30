package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
  public static void main(String[] args) {

    //Demonstrating_Terminal_NonTerminal_Operations();
    //NonTerminalOperations();
    TerminalOperations();
  }

  private static void Demonstrating_Terminal_NonTerminal_Operations() {
    List<String> stringList = Arrays.asList("ccc", "aaa", "bbb");

    //started in non-terminal operation, resulting another stream
    //foreach is terminal operation printing a result
    stringList.stream().sorted().forEach(str -> System.out.println(str));

    // in order to perform another operation on same collection, you need to create stream again.
    // if you try to do another non-terminal operation on same stream it will result into IllegalStateException  exception
    System.out.println("count " + stringList.stream().sorted().count());
  }

  private static void NonTerminalOperations() {

    List<Integer> integerList = Arrays.asList(31341, 1414, 44141, 1414, 101, 201);

    integerList.stream()
      .sorted() //
      .distinct()
      .map(i -> i / 10) // perform mentioned operation on each stream element, uses function interface
      .filter(i -> i < 1000) // filters elements based on predicate
      .limit(1) // limiting stream elements to maxsize defined
      .forEach(i -> System.out.println(i)); // perform operation using consumer interface
  }

  private static void TerminalOperations() {

    List<String> stringList = new ArrayList<String>();

    stringList.add("One flew over the cuckoo's nest");
    stringList.add("To kill a muckingbird");
    stringList.add("Gone with the wind");
    stringList.add("One Two");

    System.out.println("Is Match Found in any string :  " +
      stringList.stream().anyMatch(value -> value.startsWith("One")));

    System.out.println("Is Match Found in all strings :  " +
      stringList.stream().allMatch(value -> value.startsWith("One")));

    System.out.println("is stringList empty :  " + !stringList.stream().findFirst().isPresent());

    stringList.stream().min(Comparator.comparingInt(value -> value.length()))
      .ifPresentOrElse(value -> System.out.println(value), () -> System.out.println("stringList is empty"));

    stringList.stream().reduce((value, combinedvalue) -> {
      return combinedvalue + " " + value;
    }).ifPresent(value -> System.out.println("Combined String : " +value));

    stringList.stream().sorted().collect(Collectors.toList()).forEach(value-> System.out.println(value));
  }
}
