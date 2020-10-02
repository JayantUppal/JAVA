//Online Banking Management System
import java.sql.*;
import javax.swing.*;

class BMS
{
  public static void main(String[] args) throws Exception
  {
    int c1, c2, action;
    String sql, name, password;

    String driverClassName = "com.mysql.jdbc.Driver";
  	String url="jdbc:mysql://localhost:3306/jdbc?useSSL=false";
  	String user="root";
  	String pwd= "";

  	Class.forName(driverClassName).newInstance();

  	Connection con = DriverManager.getConnection(url,user,pwd);
    PreparedStatement pst;
    ResultSet rs;
    JPasswordField jpwd = new JPasswordField(10);

    //Displaying table
    System.out.println("Before:-");
    sql = "SELECT * FROM bms";
    pst = con.prepareStatement(sql);
    rs = pst.executeQuery();
    System.out.printf("%-12s %-15s %s\n", "CustomerID", "CustomerName", "Balance");
    while(rs.next())
      System.out.printf("%s%-7s %-15s %s\n", "BS_00", rs.getInt("CustomerID"), rs.getString("CustomerName"), rs.getFloat("Balance"));
    System.out.println();

    c1 = 0;
    while(c1!=4)
    {
      c1 = Integer.parseInt(JOptionPane.showInputDialog("Welcome to Bank of Spain\n" + "Press 1 if you are an existing user\n" +
                        "Press 2 if you are a new user\n" + "Press 3 to delete account\n" + "Press 4 to exit\n" + "Enter choice: "));
      switch(c1)
      {
        case 1:
          name = JOptionPane.showInputDialog("LOGIN\n" + "Enter name: ");
          jpwd = new JPasswordField(10);
          action = JOptionPane.showConfirmDialog(null, jpwd, "Enter Password: ", JOptionPane.OK_CANCEL_OPTION);
          password = String.valueOf(jpwd.getPassword());
          sql = "SELECT Balance FROM bms WHERE CustomerName = ? AND Password = ?";
          pst = con.prepareStatement(sql);
          pst.setString(1, name);
          pst.setString(2, password);

          rs = pst.executeQuery();
          if(rs.next())
          {
            float balance = rs.getFloat("Balance");
            JOptionPane.showMessageDialog(null, "Current Balance: " + balance);
            c2 = 0;
            while(c2!=3)
            {
              c2 = Integer.parseInt(JOptionPane.showInputDialog("Press 1 to deposit money\n" +
                                    "Press 2 to withdraw money\n" + "Press 3 to log out\n" + "Enter choice: "));

              if(c2==1) //Deposit money
              {
                float deposit = Float.parseFloat(JOptionPane.showInputDialog("Enter amount to be deposited: "));
                balance += deposit;
                sql = "UPDATE bms SET Balance=? WHERE CustomerName=? AND Password=?";
                pst = con.prepareStatement(sql);
                pst.setFloat(1, balance);
                pst.setString(2, name);
                pst.setString(3, password);
                pst.executeUpdate();
                //Display balance
                sql = "SELECT CustomerName, Balance FROM bms WHERE CustomerName = ? AND Password=?";
                pst = con.prepareStatement(sql);
                pst.setString(1, name);
                pst.setString(2, password);
                rs = pst.executeQuery();
                if(rs.next())
                  JOptionPane.showMessageDialog(null, "Updated balance: " + rs.getFloat("Balance"));
              }
              else if(c2==2) //Withdraw money
              {
                float withdraw = Float.parseFloat(JOptionPane.showInputDialog("Enter amount to withdraw: "));
                if(withdraw<=balance)
                {
                  balance -= withdraw;
                  sql = "UPDATE bms SET Balance=? WHERE CustomerName=? AND Password=?";
                  pst = con.prepareStatement(sql);
                  pst.setFloat(1, balance);
                  pst.setString(2, name);
                  pst.setString(3, password);
                  pst.executeUpdate();
                  //Display balance
                  sql = "SELECT CustomerName, Balance FROM bms WHERE CustomerName = ? AND Password=?";
                  pst = con.prepareStatement(sql);
                  pst.setString(1, name);
                  pst.setString(2, password);
                  rs = pst.executeQuery();
                  if(rs.next())
                    JOptionPane.showMessageDialog(null, "Updated balance: " + rs.getFloat("Balance"));
                }
                else
                  JOptionPane.showMessageDialog(null, "No sufficient balance");
              }
            }
          }
          else
            JOptionPane.showMessageDialog(null, "No account with given details");
          break;

        case 2:
          //Creating a account
          name = JOptionPane.showInputDialog("SIGNUP\n" + "Enter name: ");
          jpwd = new JPasswordField(10);
          action = JOptionPane.showConfirmDialog(null, jpwd, "Enter Password: ", JOptionPane.OK_CANCEL_OPTION);
          password = String.valueOf(jpwd.getPassword());
          float balance = Float.parseFloat(JOptionPane.showInputDialog("Enter balance: "));
          sql = "INSERT INTO bms(CustomerName, Password, Balance) VALUES(?,?,?)";
          pst = con.prepareStatement(sql);
          pst.setString(1, name);
          pst.setString(2, password);
          pst.setFloat(3, balance);
          pst.executeUpdate();
          JOptionPane.showMessageDialog(null, "Account created successfully");
          break;

        case 3:
          //Delete account
          name = JOptionPane.showInputDialog("DELETE ACCOUNT:-\n" + "Enter name: ");
          jpwd = new JPasswordField(10);
          action = JOptionPane.showConfirmDialog(null, jpwd, "Enter Password: ", JOptionPane.OK_CANCEL_OPTION);
          password = String.valueOf(jpwd.getPassword());
          sql = "SELECT CustomerName, Balance FROM bms WHERE CustomerName = ? AND Password=?";
          pst = con.prepareStatement(sql);
          pst.setString(1, name);
          pst.setString(2, password);
          rs = pst.executeQuery();
          if(rs.next())
          {
            sql = "DELETE FROM bms WHERE CustomerName=? AND Password=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, password);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Account deleted successfully");
          }
          else
            JOptionPane.showMessageDialog(null, "No account with given details");
          break;

        default:
          break;
      }
    }
    //Displaying table
    System.out.println("After:-");
    sql = "SELECT * FROM bms";
    pst = con.prepareStatement(sql);
    rs = pst.executeQuery();
    System.out.printf("%-12s %-15s %s\n", "CustomerID", "CustomerName", "Balance");
    while(rs.next())
      System.out.printf("%s%-7s %-15s %s\n", "BS_00", rs.getInt("CustomerID"), rs.getString("CustomerName"), rs.getFloat("Balance"));
    rs.close();
    pst.close();
    con.close();
  }
}







