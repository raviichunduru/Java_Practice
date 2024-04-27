package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatterDemo {
  public static void main(String[] args) {
    DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;

    String formattedDate = formatter.format(LocalDate.now());
    System.out.println("date to string = " +formattedDate);
    TemporalAccessor parse = formatter.parse(formattedDate);
    System.out.println("string to date = " + parse);
  }
}
