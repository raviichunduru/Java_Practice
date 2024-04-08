package POJO;

public class Employee {
  public String name;
  public int employeeId;

  public Employee(String name, int id) {
    this.name = name;
    this.employeeId = id;
  }

  @Override
  public String toString() {
    return "Employee{" +
      "name='" + name + '\'' +
      ", id=" + employeeId +
      '}';
  }
}
