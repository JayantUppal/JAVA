class Calc
{
  public static void main(String args[])
  {
    System.out.println("Name : Jayant Uppal\n" + "Roll Number : R134218074");
    double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[2]);
    char operator = args[1].charAt(0);
    if(operator=='+')
      System.out.println("Addition is: " + (a+b));
    if(operator=='-')
      System.out.println("Subtraction is: " + (a-b));
    if(operator=='*')
      System.out.println("Multiplication is: " + (a*b));
    if(operator=='/')
      System.out.println("Division is: " + (a/b));
  }
}
