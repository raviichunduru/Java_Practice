import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.time.Duration;

public class SeleniumTest {

  @Test
  public void SeleniumTest1() {

    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
    chromeOptions.setAcceptInsecureCerts(true);
    chromeOptions.setPageLoadTimeout(Duration.ofSeconds(10));
    chromeOptions.setScriptTimeout(Duration.ofSeconds(3));

    chromeOptions.addArguments("--start-maximized");
    WebDriver driver = new ChromeDriver(chromeOptions);
    driver.get("https://google.com");
  }
}
