import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class Runner {
  public static void main(String[] args) throws ParseException, IOException {

    final String CONFIG_FILE_PATH = System.getProperty("user.dir") + "/src/main/java/config.properties.properties";

    Properties properties = new Properties();
    properties.load(new FileReader(new File(CONFIG_FILE_PATH)));

    System.out.println("properties.properties.getProperty(\"username\") = " + properties.getProperty("username"));
  }
}
