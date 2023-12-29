package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.excel.ExcelReader;
import org.example.excel.ExcelWriter;
import org.example.thread.Counter;
import org.example.thread.Homework;
import org.example.thread.OrderMatic;
import org.example.thread.Sleep;
import org.example.thread.Strike;

public class Main
{
  private static final Logger logger = LogManager.getLogger(Main.class);
  public static  List<Integer> list1 = new ArrayList<>();
  public static  List<Integer> list2 = new ArrayList<>();
  public static  List<Integer> list3 = new ArrayList<>();
  public static  List<Integer> list4 = new ArrayList<>();

  public static String bolme4(int adet,List<Integer> list)
  {
    if(adet % 4 != 0)
    {
      System.out.println("Bu liste için girilen adet sayısı 4'e bölünemediği için işlem devam etmez ");
      return "Error";
    }

    int bolen = 4 ;
    int parcaUzunlugu = list.size() / bolen ;

    for (int i=0;i<bolen;i++)
    {
      int startIndex = i * parcaUzunlugu;
      int endIndex = (i+1) * parcaUzunlugu;

      List<Integer> parca = list.subList(startIndex,endIndex);
      if (i==0) list1=parca;
      else if (i==1) list2=parca;
      else if (i==2) list3=parca;
      else if (i==3) list4=parca;
    }
    System.out.println("Oluşturulan liste boyutu : " + list.size() + " olarak kaydedildi . Bu  " + adet + " adetlik liste 4 eşit parçaya ayrıldı");
    return "Okey";
  }
  public static void main(String[] args)
  {
    try
    {
      List<Integer> bigList = new ArrayList<>();
      for(int i=1;i<=10000;i++)
      {
        bigList.add(i);
      }

      bolme4(10000,bigList);

      Homework h1 = new Homework(list1);
      Thread t1 = new Thread(h1);
      t1.start();

      Thread t2 = new Thread(h1);
      t2.start();

      Thread t3 = new Thread(h1);
      t3.start();

      Thread t4 = new Thread(h1);
      t4.start();





      //------------------------------------------------------------------

      //OrderMatic orderMatic = new OrderMatic();
      //ExecutorService pool = Executors.newFixedThreadPool(10);

      //for(int i=0;i<100;i++)
      //{
      //  pool.execute(orderMatic);
      //}
      //System.out.println(orderMatic.getOrderNo());

      //------------------------------------------------------------------

      //OrderMatic orderMatic = new OrderMatic();
      //List<Thread> threadList = new ArrayList<>();
      //for(int i=0;i<100;i++)
      //{
      //  Thread t = new Thread(orderMatic);
      //  threadList.add(t);
      //  t.start();
      //}

      //------------------------------------------------------------------

      //Sleep s1 = new Sleep("s1",1);
      //Thread t1 = new Thread(s1);
      //t1.start();
      //System.out.println("Start oldu");
      //Thread.sleep(6000);
      //System.out.println("6 saniye bekledi");
      //s1.stop();
      //System.out.println("isRun " + s1.isRun() + " oldu ." );

      //------------------------------------------------------------------

      //Strike s1 = new Strike("s1");
      //Strike s2 = new Strike("s2");
      //Strike s3 = new Strike("s3");

      //Thread t1 = new Thread(s1);
      //Thread t2 = new Thread(s2);
      //Thread t3 = new Thread(s3);
      //t1.start();
      //t2.start();
      //t3.start();

      //------------------------------------------------------------------

      //Counter c1 = new Counter("Thread 1");
      //Counter c2 = new Counter("Thread 2");
      //c1.start();
      //c2.start();

      //------------------------------------------------------------------

      //new ExcelReader("C://data//excel.xlsx");
      //new ExcelWriter();
    }
    catch (Exception e)
    {
      logger.warn(e);
    }
  }
}