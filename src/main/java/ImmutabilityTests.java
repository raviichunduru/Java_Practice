import org.testng.annotations.Test;

public class ImmutabilityTests {

  ImmutableValue immutableValue = new ImmutableValue(10);

  @Test
  public void test () {
    immutableValue.add(20);
    System.out.println("immutableValue from test = " + immutableValue.getValue());
  }

  @Test
  public void test1 () {
    immutableValue.add(30);
    System.out.println("immutableValue from test1 = " + immutableValue.getValue());
  }

  @Test
  public void test2 () {
    immutableValue.add(40);
    System.out.println("immutableValue from test2 = " + immutableValue.getValue());
  }
}
