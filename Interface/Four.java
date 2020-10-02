// Write a program to create an Interface having two methods division and modules. Create a class, which overrides these methods.
interface A
{
  void division(double a, double b);
  void modulus(double a, double b);
}
class B implements A
{
  public void division(double a, double b)
  {
    System.out.println("Division: " + (a/b));
  }
  public void modulus(double a, double b)
  {
    System.out.println("Modulus: " + (a%b));
  }
}

class Four
{
  public static void main(String[] args)
  {
  	System.out.println("Name : Jayant Uppal\n" + "Roll Number : R134218074");
    B b1 = new B();
    b1.division(10.0, 2.0);
    b1.modulus(11.0, 2.0);
  }
}




