package org.example.excel;

import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {
  public ExcelWriter()
  {
    try (Workbook workbook = new XSSFWorkbook())
    {
      Sheet sheet = workbook.createSheet("Sheet1");
      Row row = sheet.createRow(0);
      Cell cell = row.createCell(0);
      cell.setCellValue("Hello, Excel! I am Mehmet Kırımlı ");

      try (FileOutputStream fileOut = new FileOutputStream("C://data//output.xlsx"))
      {
        workbook.write(fileOut);
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
}
