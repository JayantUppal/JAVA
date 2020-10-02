class Integers
{
	public static void main(String args[])
	{
		System.out.println("Name : Jayant Uppal\n" + "Roll Number : R134218074");
		int sum=0;
		for(int i=41;i<250;i++)
		{
			if(i%5==0)
				sum += i;
		}
		System.out.println("Sum of all integers (>40 & <250) which are divisible by 5 : " + sum);
	}
}
