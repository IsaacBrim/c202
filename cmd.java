import java.util.*;

public class cmd
{
	public static void main(String[] args)
	{
		if(args[0].equals("-a"))
		{
			System.out.println(args[1] + ", " + args[2] + ", " + args[3]);
		}
		
		if(args[0].equals("-i"))
		{
			int ans = Integer.parseInt(args[2]);
			ans++;
			System.out.println(ans);

			double ans2 = Double.parseDouble(args[4]);
			ans2++;
			System.out.println(ans2);
		}

		if(args[0].equals("-ai") || args[0].equals("-ia"))
		{
			System.out.println();
		}			
		
			

		
	}//main
}//cmd

