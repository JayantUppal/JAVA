class One
{
  public static void main(String[] args)
  {
    System.out.println("Name: Jayant Uppal\nRoll number: R134218074");
    String s1 = "Jayant";
    String s2 = "Uppal";
    System.out.println("s1: " + s1);
    System.out.println("s2: " + s2);
    //concat
		System.out.println("s1.concat(s2): " + s1.concat(s2)); //JayantUppal
		System.out.println("s1: " + s1); //Still remains Jayant
		//equals  
    System.out.println("s1.equals(s2): " + (s1.equals(s2)));  //false
    System.out.println("s1.equals(\"Jayant\"): " + (s1.equals("Jayant")));  //true     
		//equalsIgnoreCase
		System.out.println("s1.equalsIgnoreCase(\"jayant\"): " + (s1.equalsIgnoreCase("jayant")));  //true
    System.out.println("s1.equalsIgnoreCase(\"JAYANT\"):  " + (s1.equalsIgnoreCase("JAYANT")));  //true
    //toUpperCase
    System.out.println("s1.toUpperCase(): " + (s1.toUpperCase()));  //JAYANT
    System.out.println("s2.toUpperCase(): " + (s2.toUpperCase()));  //UPPAL
    //charAt
    System.out.println("s1.charAt(4): " + (s1.charAt(4))); //n
    System.out.println("s1.charAt(4): " + (s1.charAt(0))); //J
    //compareTo
    System.out.println("s1.compareTo(s2): " + (s1.compareTo(s2))); //> 0 value
    System.out.println("s1.compareTo(\"Jayant\"): " + (s1.compareTo("Jayant"))); //0 value
    System.out.println("s2.compareTo(s1): " + (s2.compareTo(s1))); //< 0 value 
  }
}





