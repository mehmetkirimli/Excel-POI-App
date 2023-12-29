package org.example.thread;

public class OrderMatic implements Runnable
{
  private volatile int orderNo;
  //volatile cathc yerine geçip aynı threadden bir sonraki threadin de devam etmesini garantileyen bir anahtar kelime.
  private final Object LOCK = new Object();

  public OrderMatic()
  {
    this.orderNo=0;
  }

  public int getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(int orderNo) {
    this.orderNo = orderNo;
  }

  @Override
  public void run()
  {
    try
    {
      Thread.sleep(2000);
    } catch (InterruptedException e)
    {
      throw new RuntimeException(e);
    }

    //synchronized (LOCK)
    //{
    // this.orderNo++;
    //  System.out.println( Thread.currentThread().getName()+" -Order No :  " + this.getOrderNo());
    //}

    increaseOrder();
  }

  public synchronized void increaseOrder()
  {
    this.orderNo++;
    System.out.println( Thread.currentThread().getName()+" -Order No :  " + this.getOrderNo());

  }
}
