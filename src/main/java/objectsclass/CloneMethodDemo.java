package objectsclass;

import java.util.Objects;

public class CloneMethodDemo {
  static class Student implements Cloneable {
    private String name;
    private int age;

    public Student(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
      return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      CloneMethodDemo.Student student = (CloneMethodDemo.Student) obj;
      return age == student.age && Objects.equals(name, student.name);
    }
  }
  public static void main(String[] args) throws CloneNotSupportedException {
    // Create Student & cloned object
    CloneMethodDemo.Student student = new CloneMethodDemo.Student("Alice", 20);
    Student clonedStudent = (Student) student.clone();

    //Must be false as objects must have different memory addresses
    System.out.println("is student and its clone object referring same memory location :- " +(student==clonedStudent));

    //cross-check by checking hash code, if memory address are different
    System.out.println("is hash code same for student and its clone object :- " +(student.hashCode()==clonedStudent.hashCode()));

    // checking if both object property values are same, using overridden equals method
    System.out.println("is student and its clone object equals when compared with property values :- " +(student.equals(clonedStudent)));

    // Check memory addresses (identity hash codes) for name strings
    System.out.println("Memory address (name) for student: " + System.identityHashCode(student.getName()));
    System.out.println("Memory address (name) for clonedStudent: " + System.identityHashCode(clonedStudent.getName()));

    //printing name for both objects before modification
    System.out.println("Student name : " + student.getName() + " " + "Cloned Student name : " +clonedStudent.getName());

    //modify name for cloned object
    clonedStudent.setName("updated_name_for_cloned_student");

    // Check memory addresses (identity hash codes) for name strings
    System.out.println("Memory address (name) for student: " + System.identityHashCode(student.getName()));
    System.out.println("Memory address (name) for clonedStudent: " + System.identityHashCode(clonedStudent.getName()));

    //printing name for both objects after modification of cloned student name
    System.out.println("Student name : " + student.getName() + " " + "Cloned Student name : " +clonedStudent.getName());

    //modify name for student object
    student.setName("updated_name_for_student");

    // Check memory addresses (identity hash codes) for name strings
    System.out.println("Memory address (name) for student: " + System.identityHashCode(student.getName()));
    System.out.println("Memory address (name) for clonedStudent: " + System.identityHashCode(clonedStudent.getName()));

    //printing name for both objects after modification of student name
    System.out.println("Student name : " + student.getName() + " " + "Cloned Student name : " +clonedStudent.getName());

    //Must be false as objects must have different memory addresses
    System.out.println("is student and its clone object referring same memory location :- " +(student==clonedStudent));

    //cross-check by checking hash code, if memory address are different
    System.out.println("is hash code same for student and its clone object :- " +(student.hashCode()==clonedStudent.hashCode()));

    // checking if both object property values are same, using overridden equals method
    System.out.println("is student and its clone object equals when compared with property values :- " +(student.equals(clonedStudent)));
  }
}
