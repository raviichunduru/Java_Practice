package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_List_Of_Strings {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("a");
    list.addAll(List.of("c","b","a","z","n"));

    //Collections.sort(list);   //natural sort
    Collections.sort(list,Collections.reverseOrder());  //reverse sort

    list.forEach(a-> System.out.println(a));
  }
}
