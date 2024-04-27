package objectsclass;

public class GetClassMethodDemo {
  public static void main(String[] args) {
    String string = "A String";
    Class<? extends String> stringClass = string.getClass();
    System.out.println("\" " +string + "\" is an object of " +stringClass.getName() + " class");
  }
}
