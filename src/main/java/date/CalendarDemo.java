package date;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarDemo {
  public static void main(String[] args) {
    java.util.Calendar calendar = Calendar.getInstance();

    int year        = calendar.get(Calendar.YEAR);
    int month       = calendar.get(Calendar.MONTH);
    int dayOfMonth  = calendar.get(Calendar.DAY_OF_MONTH); // Jan = 0, not 1
    int dayOfWeek   = calendar.get(Calendar.DAY_OF_WEEK);
    int weekOfYear  = calendar.get(Calendar.WEEK_OF_YEAR);
    int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);
    int hour        = calendar.get(Calendar.HOUR);        // 12 hour clock
    int hourOfDay   = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
    int minute      = calendar.get(Calendar.MINUTE);
    int second      = calendar.get(Calendar.SECOND);
    int millisecond = calendar.get(Calendar.MILLISECOND);

    // Print each value on a separate line
    System.out.println("Year: " + year +
      "\nMonth: " + month +
      "\nDay of Month: " + dayOfMonth +
      "\nDay of Week: " + dayOfWeek +
      "\nWeek of Year: " + weekOfYear +
      "\nWeek of Month: " + weekOfMonth +
      "\nHour: " + hour +
      "\nHour of Day: " + hourOfDay +
      "\nMinute: " + minute +
      "\nSecond: " + second +
      "\nMillisecond: " + millisecond);


    // setting or changing values

    calendar.set(Calendar.YEAR, 2009);
    calendar.set(Calendar.MONTH, 11); // 11 = december
    calendar.set(Calendar.DAY_OF_MONTH, 31); //

    //add one day
    calendar.add(Calendar.DAY_OF_MONTH, 1);

    // date is now jan. 1st 2010
        System.out.println("Year: " + calendar.get(Calendar.YEAR) +
      "\nMonth: " + calendar.get(Calendar.MONTH) +
      "\nDay of Month: " + calendar.get(Calendar.DAY_OF_MONTH));
  }
}
