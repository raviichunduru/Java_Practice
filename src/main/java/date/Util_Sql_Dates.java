package date;

import java.sql.Timestamp;
import java.util.Date;

public class Util_Sql_Dates {
  public static void main(String[] args) {

    long timeNow = System.currentTimeMillis();
    Date date = new Date();  // current date and time
    System.out.println("timeNow in milli seconds = " + timeNow);
    System.out.println("date from util package = " + date);

    int i = date.compareTo(new Date());  // compare with another date. check class preview what return value means
    System.out.println(i);

    java.sql.Date sqlDate = new java.sql.Date(timeNow);  // this is same as util.date,, time will be cut off
    System.out.println("sqlDate = " + sqlDate);

    java.sql.Timestamp timestamp = new Timestamp(timeNow);  // this is same as sqlDate,, but with hh:mm:ss.ms
    System.out.println("timestamp from sql package = " + timestamp);


  }
}
