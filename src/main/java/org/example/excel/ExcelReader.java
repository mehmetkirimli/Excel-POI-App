package org.example.excel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader
{
  private static final Logger logger = LogManager.getLogger(ExcelReader.class);

  public ExcelReader(String path) {
    try {
      Workbook workbook = new XSSFWorkbook(path);
      Sheet sheet = workbook.getSheetAt(0);

      for (Row row : sheet) {
        for (Cell cell : row) {
          System.out.println(cell.toString() + "\t");
        }
        System.out.println();
      }
    }
    catch (Exception e)
    {
      logger.warn( "Excel Okuma hatası : " + e.getMessage());
    }

  }
}
