package org.example;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.excel.ExcelReader;
import org.example.excel.ExcelWriter;
import org.example.thread.Counter;
import org.example.thread.OrderMatic;
import org.example.thread.Sleep;
import org.example.thread.Strike;

public class Main
{
  private static final Logger logger = LogManager.getLogger(Main.class);
  public static void main(String[] args)
  {
    try
    {
      OrderMatic orderMatic = new OrderMatic();
      List<Thread> threadList = new ArrayList<>();
      for(int i=0;i<100;i++)
      {
        Thread t = new Thread(orderMatic);
        threadList.add(t);
        t.start();
      }


      //Sleep s1 = new Sleep("s1",1);
      //Thread t1 = new Thread(s1);
      //t1.start();
      //System.out.println("Start oldu");
      //Thread.sleep(6000);
      //System.out.println("6 saniye bekledi");
      //s1.stop();
      //System.out.println("isRun " + s1.isRun() + " oldu ." );


      //Strike s1 = new Strike("s1");
      //Strike s2 = new Strike("s2");
      //Strike s3 = new Strike("s3");

      //Thread t1 = new Thread(s1);
      //Thread t2 = new Thread(s2);
      //Thread t3 = new Thread(s3);
      //t1.start();
      //t2.start();
      //t3.start();

      //Counter c1 = new Counter("Thread 1");
      //Counter c2 = new Counter("Thread 2");
      //c1.start();
      //c2.start();

      //new ExcelReader("C://data//excel.xlsx");
      //new ExcelWriter();
    }
    catch (Exception e)
    {
      logger.warn(e);
    }
  }
}