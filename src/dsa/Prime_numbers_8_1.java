package dsa;

import java.util.*;
public class Prime_numbers_8_1 {
	
	static boolean isPrime(int n) {
		if(n==0 || n==1) {
			return false;
			}
			
			for(int i=2;i<Math.sqrt(n);i++)  //Math.sqrt(n):use it for lesser time complexity.
			{
				if(n%i==0) 
				{
					return false;
				} 	
			}
			return true;
		}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
//		System.out.println(isPrime(n));
		
		if(isPrime(n)) {
			System.out.println("Is prime number");
		} else {
			System.out.println("Not a prime number");
		}

			scan.close();
		}
		

}
