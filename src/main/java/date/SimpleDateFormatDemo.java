package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
  public static void main(String[] args) throws ParseException {
    Date date = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy - MM -dd");

    System.out.println("printing date in default format = " + date);

    String format = simpleDateFormat.format(new Date());
    System.out.println("after formatting date into needed format = " + format);

    Date parse = simpleDateFormat.parse(format);
    System.out.println("after parsing string to date = " + parse);
  }
}
