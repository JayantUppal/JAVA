//Experiment - 4 (Class, object and methods)
//1. WAP that demonstrate the working of class, methods and objects.
//2. WAP to implement compile-time polymorphism.
//3. WAP to implement type promotion in method overloading.
import java.util.*;

class Test  //Class 1
{
  public double a, b;
  public void addition(double a, double b)  //Method 1
  {
    System.out.println("Addition: " + (a+b));
  }
  public void subtraction(double a, double b)  //Method 2
  {
    System.out.println("Subtraction: " + (a-b));
  }
}

class Oops  //Class 2
{
  public static void main(String args[])
  {
    System.out.println("Name : Jayant Uppal\n" + "Roll Number : R134218074");
    Test T1 = new Test();  //Object 1
    Test T2 = new Test();  //Object 2

    double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);

    T1.addition(a, b);
    T2.subtraction(a, b);
  }
}
