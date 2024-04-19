package collections.list;

import java.util.Arrays;
import java.util.List;

public class ArraysToList {

  public static void main(String[] args) {
    String[] stringArray = new String[]{"abc", "def", "ghi"};
    //String[] stringArray = {"abc", "def", "ghi"};
    List<String> list = Arrays.asList(stringArray);
    list.forEach(System.out::println);
  }
}
