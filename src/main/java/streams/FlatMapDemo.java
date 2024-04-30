
// flatmap used to map a single element into multiple elements
// in below example we're splitting down each string into string array consisting each word of original string

package streams;

import java.util.Arrays;
import java.util.List;

public class FlatMapDemo {
  public static void main(String[] args) {
    String str = "Hi Hello Bye";
    List<String> stringList = Arrays.asList("Hi Hello Bye", "Ravi Raju Ramu");

    stringList.
      stream().
      flatMap((value) ->{
      String[] s = value.split(" ");
      return Arrays.asList(s).stream();
      })
      .forEach(value -> System.out.println(value));
  }
}
