package objectsclass;// Java program to demonstrate working of finalize()

public class FinalizeMethodDemo {
  public static void main(String[] args)
  {
    FinalizeMethodDemo t = new FinalizeMethodDemo();
    System.out.println(t.hashCode());

    t = null;

    // calling garbage collector
    System.gc();

    System.out.println("end");
  }

  @Override protected void finalize(){
    System.out.println("finalize method called");
  }
}
