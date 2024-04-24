package failfast_failsafe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator {

  public static void main(String[] args) {

    List<Integer> intArray = new ArrayList<>();

    intArray.addAll(Arrays.asList(1,2,3));

    Iterator<Integer> iterator = intArray.iterator();
    while(iterator.hasNext()) {
      Integer next = iterator.next();
      intArray.add(10);
      System.out.println(next);
    }
  }
}
