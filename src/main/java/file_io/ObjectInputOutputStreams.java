package file_io;

import java.io.*;

public class ObjectInputOutputStreams {

  public static class Person implements Serializable {
    public String name = null;
    public int    age  =   0;
  }


  public static void main(String[] args) throws IOException, ClassNotFoundException {

    ObjectOutputStream objectOutputStream =
      new ObjectOutputStream(new FileOutputStream("C:\\Users\\admin\\obj.txt"));

    Person person = new Person();
    person.name = "Jakob Jenkov";
    person.age  = 40;

    objectOutputStream.writeObject(person);
    objectOutputStream.close();

    ObjectInputStream objectInputStream =
      new ObjectInputStream(new FileInputStream("C:\\Users\\admin\\obj.txt"));

    Person personRead = (Person) objectInputStream.readObject();

    objectInputStream.close();

    System.out.println(personRead.name);
    System.out.println(personRead.age);
  }
}
