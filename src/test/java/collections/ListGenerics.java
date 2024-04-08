package collections;

import POJO.Employee;

import java.util.ArrayList;
import java.util.List;

public class ListGenerics {
  public static void main(String[] args) {
    NonGenericArrayList();
    GenericArrayList();
  }

  private static void NonGenericArrayList() {
    List list = new ArrayList<>();
    list.add(new Employee("myname", 123));

    // explicit casting is needed as ArrayList is not specified with Employee type object
    Employee employee = (Employee) list.get(0);
    System.out.println("employee = " + employee);
  }

  private static void GenericArrayList() {
    List<Employee> list = new ArrayList<Employee>();
    list.add(new Employee("myname", 123));

    // here casting not needed as we declared arraylist going to accept employee type objects alone
    Employee employee = list.get(0);
    System.out.println("employee = " + employee);
  }
}
