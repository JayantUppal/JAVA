package calculation;

public class Addition
{
  public double a, b;
  public Addition(double p, double q)
  {
    a = p;
    b = q;
  }
  public void display()
  {
    System.out.println("Addition: " + (a+b));
  }
}
