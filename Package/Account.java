package balance;

public class Account
{
  public double balance;
  public Account(double b)
  {
    balance = b;
  }
  public void displayBalance()
  {
    System.out.println("Current balance: " + balance);
  }
}
