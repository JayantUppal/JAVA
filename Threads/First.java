class MyThread extends Thread
{
  int count = 0;
  public void run()
  {
    count++;
    System.out.println("Count: " + count);
  }
}

class First
{
  public static void main(String[] args)
  {
    System.out.println("Name: Jayant Uppal\nRoll number: R134218074");
    MyThread t1 = new MyThread();
    t1.start();
    MyThread t2 = new MyThread();
    t2.start();
    MyThread t3 = new MyThread();
    t3.start();
  }
}
