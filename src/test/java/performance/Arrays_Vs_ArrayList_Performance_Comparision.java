package performance;

import java.util.ArrayList;
import java.util.List;

public class Arrays_Vs_ArrayList_Performance_Comparision {

  public static void main(String[] args) {
    final int SIZE = 1000000;

    // Array performance test
    long startTime = System.nanoTime();
    int[] array = new int[SIZE];
    for (int i = 0; i < SIZE; i++) {
      array[i] = i;
    }
    long endTime = System.nanoTime();
    long arrayCreationTime = endTime - startTime;
    System.out.println("Array creation time: " + arrayCreationTime + " ns");

    // ArrayList performance test
    startTime = System.nanoTime();
    List<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < SIZE; i++) {
      arrayList.add(i);
    }
    endTime = System.nanoTime();
    long arrayListCreationTime = endTime - startTime;
    System.out.println("ArrayList creation time: " + arrayListCreationTime + " ns");
  }
}
