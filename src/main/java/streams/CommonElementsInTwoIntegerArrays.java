package streams;

import java.util.List;

public class CommonElementsInTwoIntegerArrays {

  public static void main(String[] args) {

    List<Integer> integerList1 = List.of(1, 9, 7, 5, 4);
    List<Integer> integerList2 = List.of(1, 9, 8, 6, 4);

    integerList1.stream().filter(integerList2::contains).forEach(n-> System.out.println(n));
  }
}
