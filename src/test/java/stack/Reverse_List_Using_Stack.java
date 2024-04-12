package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Reverse_List_Using_Stack {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.addAll(Arrays.asList("A","B","C"));

    Iterator<String> listIterator = list.iterator();
    Stack<String> stack = new Stack<>();

    while(listIterator.hasNext()) {
      stack.push(listIterator.next());
    }

    Iterator stackIterator = stack.iterator();
    List<String> reverseList = new ArrayList<>();

    while(stackIterator.hasNext()) {
      reverseList.add(stack.pop());
    }

    reverseList.forEach(a-> System.out.println(a));
  }
}
