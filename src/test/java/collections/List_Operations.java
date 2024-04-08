package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Operations {
  public static void main(String[] args) {

    List list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");


    System.out.println("list elements = " + list);

    System.out.println("element at 2 index in list = " + list.get(2));
    System.out.println("printing list = " + list);

    List list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);

    boolean isCollectionElementsAdded = list.addAll(list1);
    System.out.println("is List1 Collection Elements Added = " + isCollectionElementsAdded);
    System.out.println("list elements after adding another list1 elements = " + list);

    List list3 = new ArrayList<>(List.of("a",3));
    list.removeAll(list3);

    System.out.println("Printing list elements after removing a and 3");
    list.forEach(a-> System.out.println(a));

    list.retainAll(new ArrayList<>(List.of("c",1)));

    System.out.println("Printing list elements after retaining only c and 1");
    list.forEach(a-> System.out.println(a));

    list.add(null);
    System.out.println("list after adding null = " + list);

    list.add(1,"new element");
    System.out.println("list after adding \"new element\" at index 1 :  " + list);

    Object[] array = list.toArray();
    for (Object object : array) {
      System.out.println(object);
    }

    list.remove(2);

    String[] stringArray = (String[]) list.toArray(new String[0]);
    for (String string : stringArray) {
      System.out.println(string);
    }
    System.out.println("stringArray.length = " + stringArray.length);

    Iterator iterator = list.iterator();
    while (iterator.hasNext())
    {
      System.out.println("iterator.next() = " + iterator.next());
    }
  }
}
