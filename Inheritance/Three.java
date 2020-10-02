/*Write a class Worker and derive classes DailyWorker and SalariedWorker from it. Every worker has a name and a salary rate.
Write method ComPay (int hours) to compute the week pay of every worker. A Daily Worker is paid on the basis of the number of days he/she works.
The Salaried Worker gets paid the wage for 40 hours a week no matter what the actual hours are.
Test this program to calculate the pay of workers. You are expected to use the concept of polymorphism to write this program.*/
import java.util.*;

class Worker
{
  int salary_per_hour;
  int ComPay(int sal)
  {
    salary_per_hour = sal;
    return salary_per_hour;
  }
}

class DailyWorker extends Worker
{
  DailyWorker(int s)
  {
    salary_per_hour = s;
  }
  String name;
  int salary;
  int ComPay(int hours)  //Method over-riding (Run-time polymorphism)
  {
    salary = hours*salary_per_hour;
    return salary;
  }
}

class SalariedWorker extends Worker
{
  SalariedWorker(int s)
  {
    salary_per_hour = s;
  }
  String name;
  int salary;
  int ComPay()
  {
    salary = 40*salary_per_hour;
    return salary;
  }
}


class Three
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter salary per hour: ");

    Worker w1 = new Worker();
    int sal = s.nextInt();
    System.out.println("Salary given per hour: " + w1.ComPay(sal));
		
		DailyWorker d1 = new DailyWorker(sal);
		SalariedWorker s1 = new SalariedWorker(sal);
    System.out.print("Enter number of hours of Daily Worker: ");
    System.out.println("Daily Worker's salary: " + d1.ComPay(s.nextInt()));
    System.out.println("Salaried Worker's salary: " + s1.ComPay());
  }
}





