package date;

import java.time.LocalDate;

public class LocalDateDemo {
  public static void main(String[] args) {

    // creating instance of local date
    LocalDate localDate1 = LocalDate.now();
    System.out.println("localDate1 = " + localDate1);
    LocalDate localDate2 = LocalDate.of(2024,01,20);
    System.out.println("localDate2 = " + localDate2);

    //fetching values from date
    System.out.println("localDate1.getMonthValue() = " + localDate1.getMonth());
    System.out.println("localDate1.getDayOfWeek() = " + localDate1.getDayOfWeek());

    // adding days/years/months
    System.out.println("localDate2.plusDays(10) = " + localDate2.plusDays(10));
    System.out.println("localDate2.minusYears(1) = " + localDate2.minusYears(1));
  }
}
