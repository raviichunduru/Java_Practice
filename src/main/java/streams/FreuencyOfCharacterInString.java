package streams;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreuencyOfCharacterInString {
  public static void main(String[] args) {

    String s = "raghavaiah";

    Map<Character, Long> charCount = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    charCount.entrySet().stream().forEach(System.out::println);
    System.out.println();

    Long max_occurance_count = charCount.values().stream().sorted(Comparator.reverseOrder()).findFirst().get();
    charCount.entrySet().stream().filter(entry->entry.getValue().equals(max_occurance_count)).forEach(System.out::println);
    }
  }

