//Implement Multiple and multilevel Inheritance using Interface.
interface A
{
  void print();
}
interface B
{
  void display();
}
interface C extends A, B
{
  void show();
}
class M implements C
{
  public void print()
  {
    System.out.println("Print method called!");
  }
  public void display()
  {
    System.out.println("Display method called!");
  }
  public void show()
  {
    System.out.println("Show method called");
  }
}

class Three
{
  public static void main(String[] args)
  {
  	System.out.println("Name : Jayant Uppal\n" + "Roll Number : R134218074");
    M m1 = new M();
    m1.print();
    m1.display();
    m1.show();
  }
}



