package date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeDemo {
  public static void main(String[] args) {
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println("zonedDateTime = " + zonedDateTime);

    Set<String> zoneId = ZoneId.getAvailableZoneIds();
    System.out.println("zoneId = " + zoneId);

    ZoneId asiazoneid = ZoneId.of("Asia/Aden");
    System.out.println("asiazoneid = " + asiazoneid);


    ZonedDateTime zonedDateTime1 = ZonedDateTime.now(asiazoneid);
    System.out.println("zonedDateTime1 = " + zonedDateTime1);

  }
}
