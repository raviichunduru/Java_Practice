import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinimumPossibleWeights {

  public static void main(String[] args) {
    List<Integer> chocolates = new ArrayList<>();
    chocolates.addAll(List.of(20,30,40));
    int days = 5;
    minimumPossibleWeights (chocolates,days);
  }

  private static void minimumPossibleWeights(List<Integer> chocolates, int d) {
    for (int i=0; i<d; i++) {
      chocolates.sort(Comparator.reverseOrder());
      chocolates.set(0,chocolates.get(0)/2);
    }
    System.out.println("minimum possible weights = " + chocolates.toString());
  }
}
