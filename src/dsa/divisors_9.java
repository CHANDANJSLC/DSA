package dsa;
import java.util.*;

public class divisors_9 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i=0;
		for(i =1;i<n;i++) 
		{
			if(n%i==0)
			{
				System.out.println(i);
				if (i != n / i) {
                    System.out.println(n / i); 
                }
			}
		}
		scan.close();
	}
}
