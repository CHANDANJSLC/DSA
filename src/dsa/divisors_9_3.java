package dsa;
import java.util.*;

public class divisors_9_3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();  //40
		scan.close();
		int i=0;
		for(i=1; i<=Math.sqrt(n) ;i++)  
		{	
			if(n%i==0) 
			{
				System.out.println(i);	// 1 2 4 8
				
			}
		}
			for(; i>=1 ;i--)  //Ascending order.
			{
				if(n%i==0)
				{
					System.out.println(n/i);  //8 10 20 40
					
				}
			}

		}
		
}
