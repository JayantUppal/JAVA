//TITLE- Inheritance
//Write a Java program to show that private member of a super class cannot be accessed from derived classes.
class Parent
{
  private void display()
  {
    System.out.println("Function called!");
  }
}

class Child extends Parent
{
  void print()
  {
    System.out.println("Child class!");
  }
}

class One
{
  public static void main(String[] args)
  {
    Child c1 = new Child();
    c1.print();
    c1.display();
  }
}
