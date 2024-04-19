package assignments;
/*
Assume you have bookstore app
 - add new book to inventory with title and author
 - after adding a new book, print all available books
 - Ensure no duplicate book is added
 - Books to be sorted automatically in Lexicography order or alphabatical order of title
 */

import POJO.Book;
import java.util.TreeSet;

public class BookStore {

  public static void main(String[] args) {

    TreeSet<Book> bookStore = new TreeSet<>();
    bookStore.add(new Book("java bb","robert"));
    bookStore.add(new Book("java aa","martin"));
    bookStore.add(new Book("java bb","robert"));

    bookStore.forEach(book -> System.out.println(book.toString()));
  }
}

