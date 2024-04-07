import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Runner {
  public static void main(String[] args) {
    // Create an ArrayList of strings
    ArrayList<String> list = new ArrayList<>();

    // Add elements to the ArrayList
    list.add("banana");
    list.add("apple");
    list.add("orange");

    list.sort((o1, o2) -> -1);
    //list.sort(null);

    System.out.println("list = " + list);

  }
    }
