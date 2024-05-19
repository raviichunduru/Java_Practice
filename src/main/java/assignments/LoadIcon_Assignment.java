package assignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoadIcon_Assignment {
  public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://google.com");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement loadIcon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

    long startTime = 0;
    if (loadIcon.isDisplayed()) {
      startTime = System.currentTimeMillis();
    }

    while (loadIcon.isDisplayed()) {
      driver.findElement(By.xpath(""));
    }

    long endTime = System.currentTimeMillis();

    System.out.println("LoadIcon displayed for" + (endTime - startTime) + "milliseconds");

  }
}
