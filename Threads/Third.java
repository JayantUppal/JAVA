class EvenNumbers extends Thread
{
  Thread t;
  EvenNumbers()
  {
    t = new Thread(this);
    start();
  }
  public void run()
  {
    for(int i=0;i<=100;i+=2)
      System.out.print(i + " ");
  }
}

class OddNumbers extends Thread
{
  Thread t;
  OddNumbers()
  {
    t = new Thread(this);
    start();
  }
  public void run()
  {
    for(int i=1;i<=101;i+=2)
      System.out.print(i + " ");
  }
}

class Third
{
  public static void main(String[] args)
  {
    System.out.println("Name: Jayant Uppal\nRoll number: R134218074");
    EvenNumbers e = new EvenNumbers();
    OddNumbers o = new OddNumbers();
  }
}
