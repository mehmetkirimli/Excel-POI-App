package org.example.enumaration;

public enum Gunler
{
  PAZARTESI(1,"PAZARTESİ"),
  SALI(2,"SALI"),
  CARSAMBA(3,"ÇARŞAMBA"),
  PERSEMBE(4,"PERŞEMBE"),
  CUMA(5,"CUMA"),
  CUMARTESI(6,"CUMARTESI"),
  PAZAR(7,"PAZAR");

  private Integer day ;
  private String name;

  Gunler(Integer day,String name)
  {
    this.day=day;
    this.name=name;
  }

  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
