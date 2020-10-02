class MyThread extends Thread
{
  public void run()
  {
    System.out.println("Inside run method!");
  }
}

class Fifth
{
  public static void main(String[] args)
  {
    System.out.println("Name: Jayant Uppal\nRoll number: R134218074");
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();
    MyThread t3 = new MyThread();

    t1.setPriority(6);
    t2.setPriority(3);
    t3.setPriority(10);

    if(t1.isAlive())
      System.out.println("Thread-1 is alive!");
    else
      System.out.println("Thread-1 is not alive!");

    t2.start();
    if(t2.isAlive())
      System.out.println("Thread-2 is alive!");
    else
      System.out.println("Thread-2 is not alive!");

    if(t3.isAlive())
      System.out.println("Thread-3 is alive!");
    else
      System.out.println("Thread-3 is not alive!");
  }
}
