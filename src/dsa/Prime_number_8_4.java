package dsa;
import java.util.*;
public class Prime_number_8_4 {
	
	public static boolean prime(int n) 
	{
		for(int i=2;i<Math.sqrt(n);i++)
			{
				if(n%i==0) 
				{
				return false;
				}
			}
		return true;
	
	}
	
	public static void printprime(int n)
	{
		for(int i=2;i<n;i++) {
			if(prime(i)) 
			{
				System.out.print(i +" ");
			}
		}
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		printprime(n); 
		scan.close();
	} 


}
