/*Design a class employee of an organization. An employee has a name, empid, and salary.
Write the default constructor, a constructor with parameters (name, empid, and salary) and methods to return name and salary.
Also write a method increaseSalary that raises the employee’s salary by a certain user specified percentage.
Derive a subclass Manager from employee. Supply a test program that uses theses classes and methods.*/
import java.util.*;

class Employee
{
  String name, empid;
  double salary;
  Employee()
  {
    System.out.println("New employee has joined!");
  }
  Employee(String n, String e, double s)
  {
    System.out.println("New employee has joined!");
    name = n;
    empid = e;
    salary = s;
  }
  String getName()
  {
    return name;
  }
  double getSalary()
  {
    return salary;
  }
  void increaseSalary(double percentage)
  {
    salary += (percentage*salary)/100;
  }
}

class Manager extends Employee
{
  Manager()
  {
    super();
  }
  Manager(String n, String e, double s)
  {
    super(n, e, s);
  }
  void employeeInfo()
  {
    System.out.println("\nEmployee Info:-");
    System.out.println("Employee name: " + getName());
    System.out.println("Employee salary: " + getSalary());
  }
}

class Four
{
  public static void main(String[] args)
  {
    Manager m1 = new Manager();
    Manager m2 = new Manager("Jayant Uppal", "E001", 10000.0);
    m2.employeeInfo();

    Scanner s = new Scanner(System.in);
    System.out.print("\nEnter percentage: ");
    m2.increaseSalary(s.nextDouble());

    m2.employeeInfo();
  }
}




