class Sleep implements Runnable
{
	Thread t;
	public void run()
	{
		for (int i = 0; i < 4; i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + i);
      try
      {
        Thread.sleep(2000);
      }
      catch(Exception e)
      {
        System.out.println(e);
      }
		}
	}
}

class Join implements Runnable
{
  public void run()
  {
    Thread t = Thread.currentThread();
    System.out.println("Thread started: " + t.getName());
    try
    {
      Thread.sleep(2000);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    System.out.println("Thread ended: " + t.getName());
  }
}

class Fourth
{
  public static void main(String[] args)
  {
    System.out.println("Name: Jayant Uppal\nRoll number: R134218074");
    //Sleep
    Thread t1 = new Thread(new Sleep());
		t1.start();
		Thread t2 = new Thread(new Sleep());
		t2.start();
    Thread t3 = new Thread(new Sleep());
		t3.start();

    //Join
    Thread t4 = new Thread(new Join(), "t4");
    Thread t5 = new Thread(new Join(), "t5");
    Thread t6 = new Thread(new Join(), "t6");
    t4.start();
    try
    {
      t4.join();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    t5.start();
    try
    {
      t5.join();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    t6.start();
    try
    {
      t6.join();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
