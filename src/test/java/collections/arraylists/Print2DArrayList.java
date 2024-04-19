package collections.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Print2DArrayList {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

    // initializing array list of 3 elements
    for (int i = 0; i < 3; i++) {
      arrayList.add(new ArrayList<>());
    }

    //adding elements into array list running for loop
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("Enter Number");
        arrayList.get(i).add(scanner.nextInt());
      }
    }

    // printing all elements in form of 2D array
    for (int row = 0; row < arrayList.size(); row++) {
      for (int column = 0; column < arrayList.get(row).size(); column++) {
        System.out.print(arrayList.get(row).get(column));
      }
      System.out.println();
    }
  }
}
