package streams;

public class Print_Last_4_Characters_In_String {
  public static void main(String[] args) {

    String s = "raghavaiah";

    s.chars().mapToObj(c -> (char)c).skip(4).forEach(c-> System.out.println(c));
  }
}
