package collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
  public static class Student {

    String subjectName;
    int marks;

    @Override
    public String toString() {
      return "" +
        "subjectName='" + subjectName + '\'' +
        ", marks=" + marks;
    }

    public Student(String subjectName, int marks) {
      this.subjectName = subjectName;
      this.marks = marks;

    }
  }

  public static void main(String[] args) {
    Map<String, Student> studentMap = new HashMap<>();
    studentMap.put("Ravi", new Student("english",90));
    studentMap.put("Raju", new Student("maths",80));
    studentMap.put("Ram", new Student("telugu",85));

    System.out.println("Print student info using for each loop");

    for (String studentName: studentMap.keySet()) {
      Student student = studentMap.get(studentName);
      System.out.println(studentName + "  "+ student.toString());
    }
    System.out.println();

    System.out.println("Print student info using streams");

    studentMap
      .entrySet()
      .stream()
      .map(entry ->entry.getKey() + "  " + entry.getValue())
      .forEach(System.out::println);
  }
}