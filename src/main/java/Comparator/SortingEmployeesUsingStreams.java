package Comparator;

import lombok.Builder;
import lombok.Data;
import java.util.*;
import java.util.stream.Collectors;

public class SortingEmployeesUsingStreams {

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

    List<Employee> sortedEmployees = employees
      .stream()
      .sorted(Comparator.comparing(Employee::getEmpName))
      .collect(Collectors.toList());

    System.out.println("After Sort");
    sortedEmployees.forEach(System.out::println);
  }
}