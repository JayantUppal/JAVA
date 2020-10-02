class Two
{
  public static void main(String[] args)
  {
    System.out.println("Name: Jayant Uppal\nRoll number: R134218074"); 
    String s1 = "Jayant";
    System.out.println("s1: " + s1);
    //hashCode 
    System.out.println("I.hashCode(): " + (s1.hashCode()));
    //trim
    System.out.println("\"    Jayant    \".trim(): " + ("    Jayant    ".trim()));
    //intern
    String s2 = new String("Jayant");
    String s3 = new String("Uppal");
    String s4 = s1.intern();
    String s5 = s2.intern();
    System.out.println("s3==s4 : " + (s3==s4)); //False 
    System.out.println("s1==s5 : " + (s1==s5)); //True
    //length
    System.out.println("s1.length() : " + (s1.length()));
    //replace
    System.out.println("s1.replace('a', 'z') : " + s1.replace('a', 'z'));
    //substring
    System.out.println("s1.substring(4) : " + s1.substring(4));
    System.out.println("s1.substring(2, 4) : " + s1.substring(2, 4));
  }
}





