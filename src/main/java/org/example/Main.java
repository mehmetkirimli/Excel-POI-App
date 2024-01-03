package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.enumaration.Gun;
import org.example.enumaration.Gunler;
import org.example.lambda.Book;

public class Main
{
  private static final Logger logger = LogManager.getLogger(Main.class);
  public static void main(String[] args)
  {
    try
    {
      Book b1 = new Book("Harry Potter ve Felsefe Taşı", 270L,"J.K.Rowling",new Date(1997,1,1));
      Book b2 = new Book("Harry Potter ve Sırlar Odası", 170L,"J.K.Rowling",new Date(1998,1,1));
      Book b3 = new Book("Harry Potter ve Azkaban Tutsağı", 290L,"J.K.Rowling",new Date(1999,1,1));
      Book b4 = new Book("Harry Potter ve Ateş Kadehi", 370L,"J.K.Rowling",new Date(2000,1,1));
      Book b5 = new Book("Harry Potter ve Zümrüdüanka Yoldaşlığı", 199L,"J.K.Rowling",new Date(2003,1,1));
      Book b6 = new Book("Harry Potter ve Melez Prens", 240L,"J.K.Rowling",new Date(2005,1,1));
      Book b7 = new Book("Harry Potter ve Ölüm Yadigarları", 360L,"J.K.Rowling",new Date(2007,1,1));
      Book b8 = new Book("Harry Potter ve Lanetli Çocuk", 270L,"J.K.Rowling",new Date(2016,1,1));
      Book b9 = new Book("Otomatik Portakal", 176L,"Authony Burgess",new Date(1961,1,1));
      Book b10 = new Book("Amat", 547L,"İhsan Oktay Anar",new Date(2005,1,1));

      ArrayList<Book> library = new ArrayList<>();
      library.add(b1);
      library.add(b2);
      library.add(b3);
      library.add(b4);
      library.add(b5);
      library.add(b6);
      library.add(b7);
      library.add(b8);
      library.add(b9);
      library.add(b10);

      library.stream().forEach(i-> System.out.println(i.getPage()));

      Map<String,String> kitaplar = new HashMap<>();

      library.stream().forEach(i->kitaplar.put(i.getName(),i.getAuthor()));

      System.out.println(kitaplar); // Map şeklinde yazıyor

      library.stream().filter(i -> i.getPage()<200).forEach(i-> System.out.println(i.getName() + " : Page =  " + i.getPage() ));

      //System.out.println(Gunler.CUMA.getName());

      //System.out.println(Gun.PAZARTESI.getDay());

      /*
      ArrayList<Integer> list = new ArrayList<>();
      for(int i = 0 ; i<5 ; i++)
      {
        list.add(i+1);
      }

      for( int i = 0 ; i<list.size();i++)
      {
        System.out.println(list.get(i));
      }

      for(Integer i : list)
      {
        System.out.print(i + " , ");
      }

      list.stream().forEach(i -> System.out.println(i));

      list.stream().filter(number -> number>3).forEach(i -> System.out.println(i));

      boolean control = list.stream().anyMatch(i -> i==2);
      System.out.println(control);

      boolean control2 = list.stream().allMatch(i -> i==1);
      System.out.println(control2);

      list.stream().map(i -> i*3).forEach(i -> System.out.println(i));

      System.out.println(list.get(2));

       */


      //------------------------------------------------------------------


      //Homework h1 = new Homework("hw1",40);
      //Thread t1 = new Thread(h1);
      //t1.start();

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