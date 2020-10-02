package calculation;

public class Division
{
  public double a, b;
  public Division(double p, double q)
  {
    a = p;
    b = q;
  }
  public void display()
  {
    System.out.println("Division: " + (a/b));
  }
}
