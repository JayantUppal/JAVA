import java.util.Scanner;

class First
{
  public static void main(String[] args)
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Name: Jayant Uppal\nRoll number: R134218074");
    String[] name = new String[10];
    int[] roll_no = new int[10];
    System.out.print("\nEnter number of students: ");
    int n = s.nextInt();

    try
    {
      //Adding student details
      for(int i=0;i<n;i++)
      {
        System.out.print("\nEnter name: ");
        name[i] = s.next();
        System.out.print("Enter roll number: ");
        roll_no[i] = s.nextInt();
      }
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println(e);
    }

    try
    {
      //Displaying student details
      System.out.println("\nStudent details:-");
      for(int i=0;i<n;i++)
        System.out.println("Name: " + name[i] + "| Roll no: " + roll_no[i]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println(e);
    }
  }
}
