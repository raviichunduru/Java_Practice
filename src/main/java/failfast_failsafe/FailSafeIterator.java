package failfast_failsafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class FailSafeIterator {
  public static void main(String[] args) {
    List<Integer> intArray = new ArrayList<>();

    intArray.addAll(Arrays.asList(1,2,3));

    ListIterator<Integer> integerListIterator = intArray.listIterator();
    while(integerListIterator.hasNext()) {
      Integer next = integerListIterator.next();
      integerListIterator.add(10);
    }
    intArray.forEach(a-> System.out.println(a));
  }
}
