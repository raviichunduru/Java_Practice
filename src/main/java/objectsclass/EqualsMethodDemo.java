package objectsclass;

import java.util.Objects;

public class EqualsMethodDemo {
  static class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
      this.name = name;
      this.age = age;
    }

    // getters, setters, and other methods

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      Student student = (Student) obj;
      return age == student.age && Objects.equals(name, student.name);
    }
  }
  public static void main(String[] args) {
    // Create some Student objects
    Student student1 = new Student("Alice", 20);
    Student student2 = new Student("Bob", 22);
    Student student3 = new Student("Alice", 20);

    // Test the equals method
    System.out.println("student1.equals(student2): " + student1.equals(student2));
    System.out.println("student1.equals(student3): " + student1.equals(student3));

    /*System.out.println("student 1 equals student 2 : " +(student1==student2));
    System.out.println("student 1 equals student 3 : " +(student1==student3));
    System.out.println("student 2 equals student 3 : " +(student2==student3));


    System.out.println("student1.hashCode() = " + student1.hashCode());
    System.out.println("student2.hashCode() = " + student2.hashCode());
    System.out.println("student3.hashCode() = " + student3.hashCode());*/
  }
}
