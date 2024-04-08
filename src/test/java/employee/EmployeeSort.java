package employee;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSort {
  public static void main(String[] args) {
    Employee[] employeeArray = new Employee[3];

    employeeArray[0] = new Employee("Xander", 1);
    employeeArray[1] = new Employee("John", 3);
    employeeArray[2] = new Employee("Anna", 2);

    SortByEmployeeName(employeeArray);
    SortByEmployeeId(employeeArray);
  }

  private static void SortByEmployeeName(Employee[] employeeArray) {
    Arrays.sort(employeeArray, new Comparator<Employee>() {
      @Override
      public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
      }
    });
    System.out.println("Employees sorted by name");

    for (int i = 0; i < employeeArray.length; i++) {
      System.out.println(employeeArray[i].name);
    }
    System.out.println();
  }

    private static void SortByEmployeeId(Employee[] employeeArray) {
      Arrays.sort(employeeArray, new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
          return e1.employeeId - e2.employeeId;
        }
      });
      System.out.println("Employees sorted by id");

      for (int i = 0; i < employeeArray.length; i++) {
        System.out.println(employeeArray[i].employeeId + " "  +employeeArray[i].name);
      }
  }
}
