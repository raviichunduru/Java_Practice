// To demonstrate that we can create a copy of arrays using CopyOf and Clone methods
// any changes to new array created won't affect other...

package Arrays;

import java.util.Arrays;

public class Array_CopyOf_Clone_Demo {
  public static void main(String[] args) {
    // Using Arrays.copyOf
    int[] intArray = {1, 2, 3, 4, 5};
    int[] newArray = Arrays.copyOf(intArray, intArray.length); // Create a copy of intArray

    // Modify intArray
    intArray[0] = 100;

    // Display both arrays
    System.out.println("Using Arrays.copyOf:");
    System.out.println("Original intArray: " + Arrays.toString(intArray));
    System.out.println("New array: " + Arrays.toString(newArray));

    // Using clone method
    int[] intArray1 = {1, 2, 3, 4, 5};
    int[] cloneArray = intArray1.clone(); // Create a clone of intArray1

    // Modify intArray1
    intArray1[0] = 200;

    // Display both arrays
    System.out.println("\nUsing clone method:");
    System.out.println("Original intArray1: " + Arrays.toString(intArray1));
    System.out.println("Clone array: " + Arrays.toString(cloneArray));
  }
}
