package org.example.thread;

public class Strike implements Runnable
{
  private String name;
  @Override
  public void run()
  {
    System.out.println(this.getName() + " sayacı başladı");
    for(int i =0;i<=100;i++)
    {
      System.out.println(this.getName() + " : " + i);
    }
  }

  public Strike(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
