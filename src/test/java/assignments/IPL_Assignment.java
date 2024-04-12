package assignments;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;

public class IPL_Assignment {

   List<String> teamsWithNConsecutiveWins = new ArrayList<>();
   int numberOfConsecutiveWins = 3;
   static WebDriver driver = null;

  @Test
  public void getWinningTeams () {
    driver = getDriver();
    launchURL(driver);
    filter_Teams_With_N_Consecutive_Wins(driver);
    print_TeamNames(teamsWithNConsecutiveWins);
    driver.quit();
  }

  private  WebDriver getDriver() {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    return driver;
  }
  private  void launchURL(WebDriver driver) {
    driver.get("https://www.iplt20.com/points-table/men/2023");
  }
  private  List<String> filter_Teams_With_N_Consecutive_Wins(WebDriver driver) {
    List<WebElement> rows = driver.findElements(By.xpath("//tbody[@id='pointsdata']/tr"));

    for (WebElement row : rows) {
      String teamName = row.findElement(By.xpath(".//td[3]/div/h2")).getText();
      List<WebElement> matchResults = row.findElements(By.xpath(".//td[12]/div/span"));

      if (hasConsecutiveWins(matchResults)) { // match results should be passed as input
        teamsWithNConsecutiveWins.add(teamName);
      }
    }
    return teamsWithNConsecutiveWins;
  }
  private  boolean hasConsecutiveWins(List<WebElement> matchResults) {
    int consecutiveWinsCount = 0;

    // Start from the second character
    for (int i = 1; i < matchResults.size()-1; i++) {
      if (matchResults.get(i).getText().equals("W")) {
        String current = matchResults.get(i).getText();
        String previous = matchResults.get(i - 1).getText();

        if (current.equals(previous)) { // Check if the current character is consecutive to the previous one
          consecutiveWinsCount++;

          if (consecutiveWinsCount == (numberOfConsecutiveWins -1)) {
            return true;  // Return true if three consecutive wins are found
          }
        } else {  // resetting consecutiveWins counter to zero when ever 2 consecutive wins not exist
          consecutiveWinsCount = 0;
        }
      } else {   // Also resetting consecutiveWins counter to zero when ever Loss exist before 3 consecutive wins not found
        consecutiveWinsCount = 0;
      }
    }
    return false; // Return false if three consecutive wins are not found
  }
  private  void print_TeamNames(List<String> teams_With_N_Consecutive_Wins) {
    System.out.println("teams With " + numberOfConsecutiveWins + " Consecutive Wins = " +teams_With_N_Consecutive_Wins);
  }
}
