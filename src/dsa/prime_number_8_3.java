package dsa;

import java.util.*;
public class prime_number_8_3 {
	
	//Time complexity=> O(nlog(log(n)))
	
	static void prime(int n) {
		boolean[] prime = new boolean[n+1]; //Array of numbers
		
		for(int i=2;i<Math.sqrt(n);i++) { //Check for half of numbers. 1st factor will be in half of the numbers itself.
			if(prime[i]==false)   //Unmarked == false 
			{
				for(int j=i*i;j<=n;j=j+i) //Find multiplies of the number whihc is unmarked and make it as marked as true.
				{
					prime[j]=true;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(prime[i]==false) {
				System.out.println(i);  //Print all those which are not marked that means false..
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
