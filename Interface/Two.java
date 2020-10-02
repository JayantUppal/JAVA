//Write a program to create interface A, in this interface we have two method meth1 and meth2.
//Implements this interface in another class named MyClass.
interface A
{
  void meth1();
  void meth2();
}

class MyClass implements A
{
  public void meth1()
  {
    System.out.println("meth1 called!");
  }
  public void meth2()
  {
    System.out.println("meth2 called!");
  }
}

class Two
{
  public static void main(String[] args)
  {
  	System.out.println("Name : Jayant Uppal\n" + "Roll Number : R134218074");
    MyClass m1 = new MyClass();
    m1.meth1();
    m1.meth2();
  }
}
