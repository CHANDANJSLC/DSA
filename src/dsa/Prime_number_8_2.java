package dsa;

import java.util.*;
public class Prime_number_8_2 {

	public static boolean prime(int n) {
		
		if(n==1) {
			return false;
		}
		if(n==2 || n==3) {
			return true;
		}
		if(n%2==0 || n%3==0) {
			return false;
		}
		
		for(int i=5;i< Math.sqrt(n);i=i+6) { // Start from 5
			if(n%i==0 || n%(i+2)==0) {
				return true;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		System.out.println(prime(n)); 
		
		
		
		
		scan.close();

	}

}
