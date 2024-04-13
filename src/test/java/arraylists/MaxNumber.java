package arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNumber {
  public static void main(String[] args) {

    ArrayList<Integer> integerArrayList = new ArrayList<>();
    integerArrayList.addAll(Arrays.asList(11,2,53,21,24,311,53,2,76,44,412));

    MaxValue(integerArrayList);
    MaxValueWithInRange(integerArrayList, 3, 9);
  }

  private static void MaxValue(ArrayList<Integer> integerArrayList) {
    int maxValue = integerArrayList.get(0);  // assume number at index zero is maximum

    for (int i = 1; i < integerArrayList.size(); i++) {
      if (integerArrayList.get(i) > maxValue)
        maxValue = integerArrayList.get(i);
    }
    System.out.println("maxValue = " + maxValue);
  }

  private static void MaxValueWithInRange(ArrayList<Integer> integerArrayList, int start, int end) {
    int maxValue = integerArrayList.get(start);  // assume number at index zero is maximum

    for (int i = start; i < end; i++) {
      if (integerArrayList.get(i) > maxValue)
        maxValue = integerArrayList.get(i);
    }
    System.out.println("maxValue = " + maxValue);
  }


}
