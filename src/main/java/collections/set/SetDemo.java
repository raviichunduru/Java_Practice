package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
  public static void main(String[] args) {

    Set<String> set = new HashSet<>();
    set.add("A");
    set.add("B");
    set.add("C");

    //set.addAll(Set.of("aaa", "bbb", "ccc"));
    //System.out.println("set = " + set);
  }
}