package dsa;

import java.util.Scanner;

public class GCD_HCF_Euclid_6_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();  //20
		int b= scan.nextInt();  //15
		
		while(a!=b) { //If both the numbers a and b are same then come out of loop.
			if(a>b) { //Larger number 
				a=a-b; //Substract and replace with larger number.
			} else {
				b=b-a;
			}
		}
		System.out.println(a); //print any of the one a or b.
		scan.close();
	}

}
