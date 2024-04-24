package collections.arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseListOfNumbersBySwap {
  public static void main(String[] args) {
    ArrayList<Integer> integerArrayList = new ArrayList<>();
    integerArrayList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

    for (int i = 0; i < (integerArrayList.size()/2); i++) {
      int start = i;
      int end = integerArrayList.size()-1-i;
      swap (integerArrayList, start, end);
    }
    System.out.println("reveseArrayList = " + integerArrayList);
  }

  private static void swap(ArrayList<Integer> integerArrayList, int start, int end) {
    int temp = integerArrayList.get(start);
    integerArrayList.set(start, integerArrayList.get(end));
    integerArrayList.set(end, temp);
  }
}
