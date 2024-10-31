package Comparator;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingEmployeesUsingComparator {

  @Data
  @Builder(setterPrefix = "set")
  public static class Employee {
    private int empNum;
    private String empName;
  }

  public static void main (String[] args) {

    Employee emp1 = Employee.builder().setEmpNum(11).setEmpName("bbb").build();
    Employee emp2 = Employee.builder().setEmpNum(02).setEmpName("aaa").build();
    Employee emp3 = Employee.builder().setEmpNum(-3).setEmpName("zzz").build();

    List<Employee> employees = new ArrayList<Employee>();
    employees.addAll(Arrays.asList(emp1,emp2,emp3));

    System.out.println("Before Sort");
    employees.forEach(System.out::println);
    System.out.println();

    Collections.sort(employees, new Comparator<Employee>() {
      @Override
      public int compare(Employee o1, Employee o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
        //Integer.compare(o1.getEmpNum(), o2.getEmpNum());
      }
    });

    System.out.println("After Sort");
    employees.forEach(System.out::println);
  }
}