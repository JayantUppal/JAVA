import calculation.*;

class Three
{
  public static void main(String[] args)
  {
    Addition a1 = new Addition(10, 2);
    a1.display();
    Subtraction s1 = new Subtraction(10, 2);
    s1.display();
    Division d1 = new Division(10, 2);
    d1.display();
    Multiplication m1 = new Multiplication(10, 2);
    m1.display();
  }
}
