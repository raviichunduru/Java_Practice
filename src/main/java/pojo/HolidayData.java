package pojo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder(setterPrefix = "set")
@Data
@ToString
public class HolidayData {

  private String Month;
  private int Year;
  private int NumberOfHolidays;
}
