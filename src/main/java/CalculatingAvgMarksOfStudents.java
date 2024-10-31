import java.util.*;

public class CalculatingAvgMarksOfStudents {
  public static class Student {
    int rollNum;
    String studentName;
    int studentMarks;
    Double studentGrade;

    public Student(int rollNum,String studentName,int studentMarks,Double studentGrade) {
      this.rollNum = rollNum;
      this.studentName = studentName;
      this.studentMarks = studentMarks;
      this.studentGrade = studentGrade;
    }
  }

  public static void main(String[] args) {

    List<Integer> studentMarksList = new ArrayList<>();
    Integer sumOfMarks=0;

    Student student1 = new Student(1,"aaa",15,4.0);
    Student student2 = new Student(2,"bbb",25,5.0);
    Student student3 = new Student(3,"ccc",35,3.0);

    Map<Integer,Student> map = new HashMap<>();
    map.put(1,student1);
    map.put(2,student2);
    map.put(3,student3);

    for( Map.Entry<Integer,Student> entry : map.entrySet()) {
      studentMarksList.add(entry.getValue().studentMarks);
      sumOfMarks+=entry.getValue().studentMarks;
    }
    System.out.println("Average of student marks : "+(sumOfMarks/studentMarksList.size()));
  }
}