import java.util.*;


public class fac
{
	 public static long fact(int q) 
    	 {
       		 if (q == 0) // Base case
       		 {
           		 return 1;
       		 }
       		 else
       		 {
           		 return q * fact(q - 1); // Recursive call
       		 }
    	 }//factorial

/////////////////////////////////////////////////////////////////////

	public static long lastdigi(int r)
	{
		if(r == 3)
		{
			return 6;
		}
		if(r == 2)
		{
			return 2;
		}
		if(r == 4)
		{
			return 4;
		}
		if(r == 1)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

////////////////////////////////////////////////////////////////////
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		fac ans = new fac();
		System.out.println("Enter a digit: "); 
		int yourans = input.nextInt();
		System.out.println("factorial of " + yourans + " is: " + fact(yourans));

		System.out.println("The last digit of the factorial is: " + lastdigi(yourans));	
	}
}
