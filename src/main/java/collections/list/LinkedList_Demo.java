package collections.list;// a person with name and age,, sort them by age.

import pojo.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LinkedList_Demo {
  public static void main(String[] args) {
    Person person1 = new Person(10,"Ravi");
    Person person2 = new Person(6,"Amar");
    Person person3 = new Person(18,"Kavi");

    List<Person> personList = new ArrayList<>();
    personList.add(person1);
    personList.add(person2);
    personList.add(person3);

    personList.sort(new Comparator<Person>() {
      @Override
      public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
      }
    });

    personList.forEach(a-> System.out.println(a.getAge()));
  }
}
