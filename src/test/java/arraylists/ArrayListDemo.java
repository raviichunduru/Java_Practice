package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Integer> arrayList = new ArrayList<>(1); // initializing an arraylist with capability 1.

    arrayList.add(1);
    arrayList.add(2);
    System.out.println("after adding 2 elements = " + arrayList);  // though initial capacity is 1... array size will be expanded as we insert elements beyond capacity.

    arrayList.set(1,3);
    System.out.println("change element at index 1 = " + arrayList);  // change element by passing index value and value to set at specified index

    arrayList.remove(1);
    System.out.println("remove element at index 1 = " + arrayList);  // remove element at mentioned index

    for (int i = 0; i < 3; i++) {
      System.out.println("Enter number");
      arrayList.add(scanner.nextInt());               // adding elements using loop which accept user input
    }


    for (int i = 0; i < arrayList.size(); i++) {
      System.out.println(i + "th Element = " + arrayList.get(i));   // print element using for loop
    }


  }
}
