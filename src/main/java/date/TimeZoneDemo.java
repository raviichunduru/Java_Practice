package date;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TimeZoneDemo {
  public static void main(String[] args) {
    Calendar calendar = Calendar.getInstance();

    //getting time zone
    System.out.println("calendar.getTimeZone() = " + calendar.getTimeZone().getDisplayName());

    //get available time zones
    //System.out.println("TimeZone.getAvailableIDs() = " + Arrays.toString(TimeZone.getAvailableIDs()));

    // changing time zone
    calendar.setTimeZone(TimeZone.getTimeZone("Africa/Brazzaville"));
    System.out.println("calendar.getTimeZone() = " + calendar.getTimeZone().getDisplayName());

    // checking time zone difference
    TimeZone timeZone1 = TimeZone.getTimeZone("America/Los_Angeles");
    TimeZone timeZone2 = TimeZone.getTimeZone("Europe/Copenhagen");

    Calendar calendar1 = new GregorianCalendar();

    calendar1.setTimeZone(timeZone1);

    long timeCPH = calendar1.getTimeInMillis();
    System.out.println("timeCph  = " + timeCPH);
    System.out.println("hour     = " + calendar1.get(Calendar.HOUR_OF_DAY));

    calendar1.setTimeZone(timeZone2);

    long timeLA = calendar1.getTimeInMillis();
    System.out.println("timeLA   = " + timeLA);
    System.out.println("hour     = " + calendar1.get(Calendar.HOUR_OF_DAY));
  }
}
