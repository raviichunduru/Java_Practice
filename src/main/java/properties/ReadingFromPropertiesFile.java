package properties;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadingFromPropertiesFile {
  public static void main(String[] args) throws IOException {

    final String CONFIG_FILE_PATH = System.getProperty("user.dir") + "/src/main/java/config.properties";

    Properties properties = new Properties();
    properties.load(new FileReader(new File(CONFIG_FILE_PATH)));

    System.out.println("username : " + properties.getProperty("username"));
  }
}
