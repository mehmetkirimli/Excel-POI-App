package org.example.thread;

public class Sleep implements Runnable
{
  private String name;
  private int id;
  private boolean isRun=true;

  @Override
  public void run()
  {
    System.out.println(this.name + " Çalıştı");
    int i = 1;
    while (isRun) {
        System.out.print(this.name + " : " + i++ + " , ");
        try {
          Thread.sleep(1000L * this.id);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }

    }
  }

  public void stop()
  {
    this.isRun=false;
  }
  public Sleep(String name,int id) {
    this.name = name;
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public boolean isRun() {
    return isRun;
  }

  public void setRun(boolean run) {
    isRun = run;
  }
}
