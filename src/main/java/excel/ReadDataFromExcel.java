package excel;

import lombok.SneakyThrows;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadDataFromExcel {
  @SneakyThrows
  public static void main(String[] args) {
    String filePath = System.getProperty("user.dir")+"/Book1.xlsx";

    FileInputStream fis = new FileInputStream(filePath);

    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheet("Sheet1");

    int rowCount = sheet.getLastRowNum();
    int columnCount = sheet.getRow(0).getLastCellNum();

    Map<String,String> map = null;
    List<Map<String,String>> list = new ArrayList<>();

    for (int i = 0; i < rowCount ; i++) {
      map = new HashMap<>();

      for (int j = 0; j < columnCount; j++) {
        String key = sheet.getRow(0).getCell(j).getStringCellValue();
        String value = sheet.getRow(i+1).getCell(j).getStringCellValue();
        map.put(key,value);
      }
      list.add(map);
    }

    /*for (Map<String,String> map1 : list) {
      Set<String> strings = map1.keySet();
      for (String s : strings) {
        System.out.println(s+" "+map1.get(s));
      }
    }*/

    list.stream().forEach(System.out::println);
  }
}
