package generics;

import org.apache.poi.ss.formula.functions.T;

public class GenericMethod {
  public static void main(String[] args) {

    Integer[] intArray = {1,2,3};
    String[] strArray = {"aaa","bbb","ccc"};

    printValues(intArray);
    printValues(strArray);
  }

  static <T> void printValues(T[] array) {
    for (T element : array) {
      System.out.println("element = " + element);
    }
    System.out.println();
  }
}
