package collections;

import POJO.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort_List_Of_Employees {
  public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<Employee>();

    employeeList.add(new Employee("d", 5));
    employeeList.add(new Employee("g", 1));
    employeeList.add(new Employee("a", 9));


    Comparator<Employee> sortByEmployeeName = (e1,e2) -> e1.name.compareTo(e2.name);
    //Comparator<Employee> sortByEmployeeId = Comparator.comparingInt(e -> e.employeeId);

    Collections.sort(employeeList, sortByEmployeeName);
    //Collections.sort(employeeList, sortByEmployeeId);

    employeeList.forEach(a-> System.out.println(a));

  }
}