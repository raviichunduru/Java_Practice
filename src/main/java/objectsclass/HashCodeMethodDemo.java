package objectsclass;

import java.util.Objects;

public class HashCodeMethodDemo {
  static class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
      this.name = name;
      this.age = age;
    }

    // getters, setters, and other methods

    @Override
    public int hashCode() {
      return Objects.hash(name, age);
    }
  }

    public static void main(String[] args) {
      // Create some Student objects
      Student student1 = new Student("Alice", 20);
      Student student2 = new Student("Bob", 22);
      Student student3 = new Student("Alice", 20);

      // Test the hashCode method
      System.out.println("HashCode of student1: " + student1.hashCode());
      System.out.println("HashCode of student2: " + student2.hashCode());
      System.out.println("HashCode of student3: " + student3.hashCode());
    }
  }
