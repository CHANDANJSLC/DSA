package dsa;

import java.util.*;
public class Prime_number_8 {
	
	static void isPrime(int n) {
		if(n==0 || n==1) {
			System.out.println("Not a prime number");
			return;
			}
			
			for(int i=2;i<=n/2;i++) //Math.sqrt(n):use it for lesser time complexity.
			{
				if(n%i==0) 
				{
					System.out.println("It is not a prime number");
					return;
				} 	
			}
			System.out.println("It is a prime number");
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		isPrime(n);	

			scan.close();
		}
		

}
