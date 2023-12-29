package org.example.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Homework implements Runnable
{
  private String name ;
  private int adet;
  private List<Integer> list1 ;
  private List<Integer> list2 ;
  private List<Integer> list3 ;
  private List<Integer> list4 ;

  private List<Integer> tekSayilar;
  private List<Integer> ciftSayilar;


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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAdet() {
    return adet;
  }

  public void setAdet(int adet) {
    this.adet = adet;
  }

  public List<Integer> getList1() {
    return list1;
  }

  public void setList1(List<Integer> list1) {
    this.list1 = list1;
  }

  public List<Integer> getList2() {
    return list2;
  }

  public void setList2(List<Integer> list2) {
    this.list2 = list2;
  }

  public List<Integer> getList3() {
    return list3;
  }

  public void setList3(List<Integer> list3) {
    this.list3 = list3;
  }

  public List<Integer> getList4() {
    return list4;
  }

  public void setList4(List<Integer> list4) {
    this.list4 = list4;
  }

  public Homework(String name,int adet)
  {
    this.name = name;
    this.adet=adet;
    this.bolme4(adet);
  }

  @Override
  public void run()
  {
    try
    {
      Thread.sleep(1000);
      System.out.println("Start metodu başladı , Tek ve Çift Sayılar ayrıştırılıyor...");
      tekCift(this.adet);
    }
    catch (InterruptedException e)
    {
      throw new RuntimeException(e);
    }

  }

  public synchronized void tekCift(int adet)
  {
    int bolen = 4 ;

    for ()
  }


  public String bolme4(int adet)
  {
    if(adet % 4 != 0)
    {
      System.out.println("Bu liste için girilen adet sayısı 4'e bölünemediği için işlem devam etmez ");
      return "Error";
    }
    List<Integer> list = new ArrayList<>();
    for(int i=1;i<=adet;i++)
    {
      list.add(i);
    }
    int bolen = 4 ;
    int parcaUzunlugu = list.size() / bolen ;

    for (int i=0;i<bolen;i++)
    {
      int startIndex = i * parcaUzunlugu;
      int endIndex = (i+1) * parcaUzunlugu;

      List<Integer> parca = list.subList(startIndex,endIndex);
      if (i == 0) list1=parca;
      else if (i == 1) list2=parca;
      else if (i == 2) list3=parca;
      else if (i == 3) list4=parca;
    }
    System.out.println("Oluşturulan liste boyutu : " + list.size() + " olarak kaydedildi . Bu  " + adet + " adetlik liste 4 eşit parçaya ayrıldı");
    return "Okey";
  }
}
