package org.example.thread;


import java.util.ArrayList;
import java.util.List;

public class Homework implements Runnable
{
  private List<Integer> bigList ;
  private List<Integer> tekSayilar = new ArrayList<>();
  private List<Integer> ciftSayilar = new ArrayList<>();

  public List<Integer> getBigList() {
    return bigList;
  }
  public void setBigList(List<Integer> bigList) {
    this.bigList = bigList;
  }
  public List<Integer> getTekSayilar() {
    return tekSayilar;
  }
  public void setTekSayilar(List<Integer> tekSayilar) {
    this.tekSayilar = tekSayilar;
  }
  public List<Integer> getCiftSayilar() {
    return ciftSayilar;
  }
  public void setCiftSayilar(List<Integer> ciftSayilar) {
    this.ciftSayilar = ciftSayilar;
  }

  public Homework(List<Integer> bigList) {
    this.bigList = bigList;
  }

  public synchronized void tekCift()
  {
    for (Integer i : this.bigList )
    {
      if(i%2 == 0)
      {
        ciftSayilar.add(i);
      }
      else
      {
        tekSayilar.add(i);
      }
    }
  }

  @Override
  public void run()
  {
    try
    {
      Thread.sleep(1000);
      System.out.println("Tek ve Çift Sayılar Ayrışıyor");
      tekCift();
      System.out.println("Ayrıştı");
    }
    catch (InterruptedException e)
    {
      throw new RuntimeException(e);
    }

  }

}
