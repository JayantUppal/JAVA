class Second
{
  public static void main(String[] args)
  {
    System.out.println("Name: Jayant Uppal\nRoll number: R134218074");
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    
    try
    {
      System.out.println("Answer: " + (a/b));
    }
    catch(ArithmeticException e)
    {
      System.out.println("Divide by zero exception!");
    }
  }
}
