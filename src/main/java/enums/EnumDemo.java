package enums;

import java.util.EnumMap;
import java.util.EnumSet;

public class EnumDemo {

  public static void main(String[] args) {
    EnumSet<Browser> enumSet = EnumSet.of(Browser.CHROME, Browser.FIREFOX);
    enumSet.add(Browser.valueOf("IE"));
    System.out.println(enumSet);

    EnumMap<Browser, String> enumMap = new EnumMap<>(Browser.class);
    enumMap.put(Browser.CHROME, "Chrome");
    enumMap.put(Browser.FIREFOX, "Firefox");
    System.out.println(enumMap);
  }
}
