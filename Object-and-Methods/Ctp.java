//Method overloading
class Ctp
{
  public void meth1(int a)
  {
    System.out.println("Int args method");
  }
  public void meth1(String s)
  {
    System.out.println("String args method");
  }
  public static void main(String args[])
  {
      System.out.println("Name : Jayant Uppal\n" + "Roll Number : R134218074");
      Ctp C1 = new Ctp();
      C1.meth1(4);
      C1.meth1("Jayant");
  }
}
