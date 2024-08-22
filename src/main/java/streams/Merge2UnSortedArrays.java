package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Merge2UnSortedArrays {
  public static void main(String[] args) {

    int[] array1 = {235, 535, 53535, 242, 455};
    int[] array2 = {42542, 536365, 53575535, 23545342, 477555, 455,535};

    IntStream.concat(Arrays.stream(array1),Arrays.stream(array2)).sorted().distinct().forEach(a-> System.out.println(a));
  }
}
