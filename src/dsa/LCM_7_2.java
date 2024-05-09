package dsa;

import java.util.Scanner;

public class LCM_7_2 {
	
	static int findLCM(int a,int b)  
	{	
		return a*b/euclidGcd(a, b);		//LCM=a*b/GCD(a,b)
	}
	
	static int euclidGcd(int a, int b) { //GCD
		while(a!=0 && b!=0) {  // If any one of a or b becomes 0 , then exit from loop.
			if(a>b) {
				a=a%b;  //Divide and find the reamainder
			} else { // Replace remainder with larger number.
				b=b%a;
			}
		}
		if(a!=0) {  //print the non zero which of the one that ia a or b.
			return a;
		} else {
			return b;
		}
	}


	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int a =scan.nextInt(); //2
		int b =scan.nextInt(); //5  
		
		System.out.println(euclidGcd(a, b)); //GCD
		System.out.println(findLCM(a,b));  //LCM
		scan.close();
}
}

