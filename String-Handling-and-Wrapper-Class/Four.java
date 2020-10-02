class Conversion
{
  void float_to_Float(float f)
  {
    Float F = f;  //Auto-boxing
    System.out.println("float: " + f + " to Float: " + F);
  }
  void Float_to_String(Float F)
  {
    String s = F.toString();
    System.out.println("Float: " + F + " to String: " + s);
  }
  void String_to_float(String s)
  {
    float f = Float.parseFloat(s);
    System.out.println("String: " + s + " to float: " + f);
  }
  void float_to_String(float f)
  {
    String s = String.valueOf(f);
    System.out.println("float: " + f + " to String: " + s);
  }
  void String_to_Float(String s)
  {
    Float F = Float.valueOf(s);
    System.out.println("String: " + s + " to Float: " + F);
  }
  void Float_to_float(Float F)
  {
     float f = F.floatValue();
     System.out.println("Float: " + F + " to float: " + f);
  }
}

class Four
{
  public static void main(String[] args)
  {
    System.out.println("Name: Jayant Uppal\nRoll number: R134218074");
    Conversion c = new Conversion();
    float f = 20.5f;
    Float F = new Float(40.6);  //Boxing
    String s = "34.7";

    c.float_to_Float(f);
    c.Float_to_String(F);
    c.String_to_float(s);
    c.float_to_String(f);
    c.String_to_Float(s);
    c.Float_to_float(F);
  }
}













