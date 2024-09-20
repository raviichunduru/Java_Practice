import java.util.ArrayList;
import java.util.List;

public class PrintCharCount {
  public static void main(String[] args) {
    int count = 1;
    List<Character> countedChar = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    String s = "TTTAAAAAADDDDEEEEE";

    for (int i = 0; i < s.length(); i++) {
      if (countedChar.contains(s.charAt(i)))
        continue;
      for (int j = i + 1; j < s.length(); j++) {
        if (s.charAt(i) == s.charAt(j)) {
          count++;
        }
      }
      if (count > 5) {
        sb.append(s.charAt(i));
        sb.append(count / 2);
        sb.append(s.charAt(i));
        sb.append(count / 2);
      } else {
        sb.append(s.charAt(i));
        sb.append(count);
      }

      countedChar.add(s.charAt(i));
      count = 1;
    }
    System.out.println("sb = " + sb);
  }
}