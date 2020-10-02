class Largest
{
	public static void main(String args[])
	{
		System.out.println("Name : Jayant Uppal\n" + "Roll Number : R134218074");
		int a=3, b=5, c=4, largest;
		System.out.println("Given numbers: " + a + " " + b + " " + c);
		System.out.print("Largest: ");
		if(a>b && a>c)
			largest = a;
		else if(b>a && b>c)
			largest = b;
		else
			largest = c;
		System.out.println(largest);
	}
}
