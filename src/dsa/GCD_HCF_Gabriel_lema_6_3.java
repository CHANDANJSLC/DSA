package dsa;
import java.util.*;
public class GCD_HCF_Gabriel_lema_6_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //20 
		int b = scan.nextInt(); //15
		
		while(a!=0 && b!=0) {  // If any one of a or b becomes 0 , then exit from loop.
			if(a>b) {
				a=a%b;  //Divide and find the reamainder
			} else { // Replace remainder with larger number.
				b=b%a;
			}
		}
		if(a!=0) {  //print the non zero which of the one that ia a or b.
			System.out.println(a);
		} else {
			System.out.println(b);
		}
		
		scan.close();
	}

}
