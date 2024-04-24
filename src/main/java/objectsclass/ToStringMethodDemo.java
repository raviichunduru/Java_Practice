package objectsclass;

public class ToStringMethodDemo {

  static class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
      this.name = name;
      this.age = age;
    }


    // Getters and setters

    @Override
    public String toString() {
      return "{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
    }
  }

    public static void main(String[] args) {
      // Create some Student objects
      Student student1 = new Student("Alice", 20);
      Student student2 = new Student("Bob", 22);
      Student student3 = new Student("Alice", 20);

      // Test the toString method
      System.out.println("ToString of student1: " + student1.toString());
      System.out.println("ToString of student2: " + student2.toString());
      System.out.println("ToString of student3: " + student3.toString());
    }
  }
