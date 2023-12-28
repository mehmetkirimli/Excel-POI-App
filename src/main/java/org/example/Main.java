package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.excel.ExcelReader;
import org.example.excel.ExcelWriter;
import org.example.thread.Counter;

public class Main
{
  private static final Logger logger = LogManager.getLogger(Main.class);
  public static void main(String[] args)
  {
    try
    {
      Counter c1 = new Counter("Thread 1");
      Counter c2 = new Counter("Thread 2");

      c1.start();
      c2.start();

      //new ExcelReader("C://data//excel.xlsx");
      //new ExcelWriter();
    }
    catch (Exception e)
    {
      logger.warn(e);
    }
  }
}