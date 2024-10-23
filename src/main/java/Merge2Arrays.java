import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Merge2Arrays {
  public static void main(String[] args) {
    int[] array1 = new int[10];
    int[] array2 = new int[10];

    for (int i = 0; i < array1.length; i++) {
      array1[i]=i+1;
      array2[i]=i+11;
    }

    List<Integer> arrayList1 = Arrays.stream(array1).boxed().collect(Collectors.toList());
    List<Integer> arrayList2 = Arrays.stream(array2).boxed().collect(Collectors.toList());

    arrayList1.addAll(arrayList2);

    arrayList1.forEach(System.out::println);
  }
}
