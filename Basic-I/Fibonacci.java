class Fibonacci
{  
	public static void main(String args[])  
	{    
		System.out.println("Name : Jayant Uppal\n" + "Roll Number : R134218074");
 		int a=0, b=1, c, i, n=10;    
 		System.out.print("Fibonacci Series: " + a + " " + b);    
 		for(i=2;i<n;i++)    
 		{    
  		c=a+b;    
  		System.out.print(" " + c);    
  		a=b;    
  		b=c;    
 		} 
 		System.out.println();   
  }
}
