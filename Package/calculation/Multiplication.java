package calculation;

public class Multiplication
{
  public double a, b;
  public Multiplication(double p, double q)
  {
    a = p;
    b = q;
  }
  public void display()
  {
    System.out.println("Multiplication: " + (a*b));
  }
}
