package streams;
// insert student name and marks into map and print average marks

import java.util.HashMap;
import java.util.Map;

public class Calculate_Average_Marks_From_MapValues {
  public static void main(String[] args) {

    Map<String, Integer> studentMap = new HashMap<>();

    studentMap.put("Ravi1",20);
    studentMap.put("Ravi2",30);
    studentMap.put("Ravi3",40);


    for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
      System.out.println(entry.getKey() + "  " + entry.getValue());
    }

    Double sumOfMarks = (double) studentMap.values().stream().mapToInt(Integer::intValue).sum();
    System.out.println("Average Marks = " + (sumOfMarks / studentMap.size()));

  }
}
