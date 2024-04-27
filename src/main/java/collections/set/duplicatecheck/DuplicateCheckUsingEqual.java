package collections.set.duplicatecheck;

import objectsclass.EqualsMethodDemo;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCheckUsingEqual {

  public static void main(String[] args) {
    // Create some Student objects
    Student student1 = new Student("Alice", 20);
    Student student2 = new Student("Bob", 22);
    Student student3 = new Student("Alice", 20);

    Set<Student> studentSet = new HashSet<>();
    studentSet.add(student1);
    studentSet.add(student2);
    studentSet.add(student3);
    //studentSet.addAll(Set.of(student1,student2,student3));
    System.out.println("studentSet = " + studentSet);

    // Test the equals method
    System.out.println("student1.equals(student2): " + student1.equals(student2));
    System.out.println("student1.equals(student3): " + student1.equals(student3));

    System.out.println("student 1 equals student 2 : " +(student1==student2));
    System.out.println("student 1 equals student 3 : " +(student1==student3));
    System.out.println("student 2 equals student 3 : " +(student2==student3));

    System.out.println("student1.hashCode() = " + student1.hashCode());
    System.out.println("student2.hashCode() = " + student2.hashCode());
    System.out.println("student3.hashCode() = " + student3.hashCode());
  }
}
