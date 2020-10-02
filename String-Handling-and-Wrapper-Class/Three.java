class Conversions
{
  void int_to_Integer(int i)
  {
    Integer I = i;  //Auto-boxing
    System.out.println("int: " + i + " to Integer: " + I);
  }
  void Integer_to_String(Integer I)
  {
    String s = I.toString();
    System.out.println("Integer: " + I + " to String: " + s);
  }
  void String_to_int(String s)
  {
    int i = Integer.parseInt(s);
    System.out.println("String: " + s + " to int: " + i);
  }
  void int_to_String(int i)
  {
    String s = String.valueOf(i);
    System.out.println("int: " + i + " to String: " + s);
  }
  void String_to_Integer(String s)
  {
    Integer I = Integer.valueOf(s);
    System.out.println("String: " + s + " to Integer: " + I);
  }
  void Integer_to_int(Integer I)
  {
     int i = I.intValue();
     System.out.println("Integer: " + I + " to int: " + i);
  }
}

class Three
{
  public static void main(String[] args)
  {
    System.out.println("Name: Jayant Uppal\nRoll number: R134218074");
    Conversions c = new Conversions();
    int i = 10;
    Integer I = new Integer(30);  //Boxing
    String s = "24";

    c.int_to_Integer(i);
    c.Integer_to_String(I);
    c.String_to_int(s);
    c.int_to_String(i);
    c.String_to_Integer(s);
    c.Integer_to_int(I);
  }
}





