package pojo;

import lombok.Data;

import java.util.Objects;

@Data
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee employee = (Employee) o;
    return employeeId == employee.employeeId && Objects.equals(name, employee.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, employeeId);
  }
}
