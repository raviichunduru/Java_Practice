package generics;

import java.util.ArrayList;

public class CustomArrayList {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();

    list.add(1);
    list.add(2);
    list.get(0);
    list.set(1,123);
    System.out.println(list);
  }
}
