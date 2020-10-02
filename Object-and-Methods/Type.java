//Type promotion
class Type
{
  public void meth1(long l)
  {
    System.out.println("Int to long promoted!");
  }
  public void meth1(double d)
  {
    System.out.println("Float to double promoted!d");
  }
  public static void main(String args[])
  {
      System.out.println("Name : Jayant Uppal\n" + "Roll Number : R134218074");
      Type T1 = new Type();
      T1.meth1(4);
      T1.meth1(4.5f);
  }
}
