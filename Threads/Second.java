class MyRunnable implements Runnable
{
  int count = 0;
  public void run()
  {
    count++;
    System.out.println("Count: " + count);
  }
}

class Second
{
  public static void main(String[] args)
  {
    System.out.println("Name: Jayant Uppal\nRoll number: R134218074");
    MyRunnable mr = new MyRunnable();
    Thread t1 = new Thread(mr);
    t1.start();
    Thread t2 = new Thread(mr);
    t2.start();
    Thread t3 = new Thread(mr);
    t3.start();
  }
}
