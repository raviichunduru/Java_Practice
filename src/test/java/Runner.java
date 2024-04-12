import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class Runner {
  public static void main(String[] args) {

   List<String> list = new ArrayList<>(Arrays.asList("a","b","c","a"));
   Set<String> set = new HashSet<>();
   set.clear();
   set.addAll(list);
   list.forEach(a-> System.out.println(a));
   set.forEach(a-> System.out.println(a));
  }
}
