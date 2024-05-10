package dsa;

import java.util.*;
public class Prime_number_8_2 {

	public static boolean prime(int n) {
		
		if(n==1) {
			return false;
		}
		if(n==2 || n==3) { // 2 and 3 are prime 
			return true;
		}
		if(n%2==0 || n%3==0) {  //Check for other rows: if they divide by 2 and 3 is zero, then divisble by 2 and 3, then return false.
			return false;
		}
		
		for(int i=5;i< Math.sqrt(n);i=i+6) { // Start from 5 and go on +2and +6 is true (5+2=7), (5+6=11), these are prime i,i+2,i+6 are prime .buyt start from 5.
			if(n%i==0 || n%(i+2)==0) {  //Same check for i and i+2 is it divisible or not 
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
