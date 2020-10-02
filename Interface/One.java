//Title - Interfaces
//Write a program to create interface named test. In this interface the member function is square.
//Implement this interface in arithmetic class. Create one new class called ToTestInt. In this class use the object of arithmetic class.
interface Test
{
  void square(int s);
}

class Arithmetic implements Test
{
  int perimeter, area;
  public void square(int s)
  {
    perimeter = 4*s;
    area = s*s;
  }
}

class ToTestInt
{
  void display(Arithmetic a)
  {
    System.out.println("Perimeter: " + a.perimeter);
    System.out.println("Area: " + a.area);
  }
}

class One
{
  public static void main(String args[])
  {
  	System.out.println("Name : Jayant Uppal\n" + "Roll Number : R134218074");
    Arithmetic a1 = new Arithmetic();
    a1.square(10);

    ToTestInt t1 = new ToTestInt();
    t1.display(a1);
  }
}


