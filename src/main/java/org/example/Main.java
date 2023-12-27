package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.excel.ExcelReader;
import org.example.excel.ExcelWriter;

public class Main
{
  private static final Logger logger = LogManager.getLogger(Main.class);
  public static void main(String[] args)
  {
    try {
      new ExcelReader("C://data//excel.xlsx");
      new ExcelWriter();
    }catch (Exception e)
    {
      logger.warn(e);
    }
  }
}