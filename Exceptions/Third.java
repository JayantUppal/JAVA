class NonNumericOperandException extends Exception
{
  NonNumericOperandException()
  {
    super("The value is non-numeric");
  }
}

class Third
{
  public static boolean check(String p, String q)
  {
    try
    {
      int a = Integer.parseInt(p);
      int b = Integer.parseInt(q);
    }
    catch(NumberFormatException e)
    {
      return false;
    }
    return true;
  }
  public static void main(String[] args)
  {
  	System.out.println("Name: Jayant Uppal\nRoll number: R134218074");
    try
    {
      if(check(args[0], args[1]))
        System.out.println("Modulus: " + ((Integer.parseInt(args[0]))%(Integer.parseInt(args[1]))));
      else
        throw new NonNumericOperandException();
    }
    catch(NonNumericOperandException e)
    {
      System.out.println(e);
    }
  }
}
