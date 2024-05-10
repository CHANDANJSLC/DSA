package dsa;

import java.util.*;
public class prime_number_8_3 {
	
	
	
	static void prime(int n) {
		boolean[] prime = new boolean[n+1];
		
		for(int i=2;i<Math.sqrt(n);i++) {
			if(prime[i]==false) 
			{
				for(int j=i*i;j<=n;j=j+i)
				{
					prime[j]=true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(prime[i]==false) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		
		prime(n);
		
		
		
		
		scan.close();
		

	}

}
