package pojo;

public class Book implements Comparable<Book> {
  String title;
  String author;

  public Book (String title, String author) {
    this.title = title;
    this.author = author;
  }

  @Override
  public String toString() {
    return "Book{" +
      "title='" + title + '\'' +
      ", author='" + author + '\'' +
      '}';
  }

  @Override
  public int compareTo(Book Other) {
    return this.title.compareTo(Other.title);
  }
}
