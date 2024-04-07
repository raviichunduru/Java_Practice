import POJO.HolidayData;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Year;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;


public class RedBusAssignment {

  private static final By calendarButton = By.xpath("//div[@class = 'labelCalendarContainer']/i");
  private static final By holidayInfoElement = By.xpath("//div[@class = 'DayNavigator__IconBlock-qj8jdz-2 iZpveD'][2]");
  private static final By nextButton = By.xpath("//div[@class = 'DayNavigator__IconBlock-qj8jdz-2 iZpveD'][2]/following-sibling::div");

  private ChromeDriver driver = null;

  @BeforeEach
  void setUpDriver () {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    options.addArguments("disable-notifications");
    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get("https://www.redbus.in/");
  }

  @Test
  public void getHolidaysInfoMonthlyWise () {
      driver.findElement(calendarButton).click();
      Map<String,Integer> map = new HashMap<>();

    do {
        HolidayData monthHolidayInfo = getCurrentMonthHolidayInfo(driver);
        map.put(monthHolidayInfo.getMonth(), monthHolidayInfo.getNumberOfHolidays());
        driver.findElement(nextButton).click();
      } while(getCurrentMonthHolidayInfo(driver).getYear() == Year.now().getValue());

      BiConsumer<String, Integer> printMap = (month,holidayCount) -> {
        System.out.println(holidayCount + " Holidays in " +month);
      };

     map.forEach(printMap);
    }

    @Test
    public void getWeekEndDates () {
      List<WebElement> elements = driver.findElements(By.cssSelector("[style*='color: rgb(216, 78, 85);']"));
      System.out.println("elements.size() = " + elements.size());
    }

    @AfterEach
    void tearDown () {
    driver.quit();
    }

    private static HolidayData getCurrentMonthHolidayInfo(ChromeDriver driver) {
      String[] split = driver.findElement(holidayInfoElement).getText().split("\n");
      String[] s = split[0].split(" ");
      String Month = s[0];
      int Year = Integer.parseInt(s[1]);

      int NumberOfHolidays = 0;
      if (split.length > 1) {
        String[] s1 = split[1].split(" ");
        if (s1.length > 0) {
          NumberOfHolidays = Integer.parseInt(s1[0]);
        }
      }
      return HolidayData.builder().setMonth(Month).setYear(Year).setNumberOfHolidays(NumberOfHolidays).build();
    }
  }
