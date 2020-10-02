import java.util.*;

class Student
{
  String name, roll;
  double marks;
  public void setData(String n, String r, double m)
  {
    roll = r;
    name = n;
    marks = m;
  }
  public void getData()
  {
    System.out.println("Name: " + name);
    System.out.println("Roll number: " + roll);
    System.out.println("CGPA: " + marks);
  }
  public static void main(String args[])
  {
    System.out.println("Name : Jayant Uppal\n" + "Roll Number : R134218074");

		Scanner s = new Scanner(System.in);
    Student S1 = new Student();
    
    System.out.print("\nEnter name: ");
    String name = s.nextLine();
    System.out.print("Enter roll number: ");
    String roll = s.next();
    System.out.print("Enter CGPA: ");
    double marks = s.nextDouble();
    
    S1.setData(name, roll, marks);
    System.out.println("\nStudent Details:-");
    S1.getData();
  }
}
