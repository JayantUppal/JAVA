class Employee
{
  String name;
  int age;
  Employee(String n, int a)
  {
    System.out.println("Employee object is created");
    this.name = n;
    this.age = a;
  }
}

class MyException extends Exception
{
  MyException(String s)
  {
    super(s);
  }
}

class Fourth
{
  public static boolean checkName(String name)
  {
    try
    {
      int a = Integer.parseInt(name);
    }
    catch(NumberFormatException e)
    {
      return true;
    }
    return false;
  }
  public static boolean checkAge(String age)
  {
    int a = Integer.parseInt(age);
    if(a<=50)
      return true;
    else
      return false;
  }
  public static void main(String[] args)
  {
  	System.out.println("Name: Jayant Uppal\nRoll number: R134218074");
    Employee e1;
    try
    {
      if(!checkName(args[0]))
        throw new MyException("Name is a number");
      if(!checkAge(args[1]))
        throw new MyException("Age is greater than 50");
      if(checkName(args[0]) && checkAge(args[1]))
        e1 = new Employee(args[0], Integer.parseInt(args[1]));
    }
    catch(MyException e)
    {
      System.out.println(e);
    }
  }
}





