package dsa;
import java.util.*;

public class divisors_9_2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1; i<=Math.sqrt(n) ;i++)  
		{	
			if(n%i==0)
			{
				System.out.println(i);	
				System.out.println(n/i);
			}
		}
		scan.close();
	}
}
