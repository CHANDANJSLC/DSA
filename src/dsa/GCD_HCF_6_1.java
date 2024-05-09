package dsa;
import java.util.*;
public class GCD_HCF_6_1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		//Brute force approach
		int a = scan.nextInt(); //20
		int b= scan.nextInt();//15
		int min;
		
		if(a<b) { //Find minimum which (a or b) 
			min = a;
		} else {
			min = b;
		}
		
		for(int i=min;i>1;i--) {  //Loop from reverse order and find the GCD.
			if(a%i==0 && b%i==0) {
				System.out.println(i); 
				break;
			}
			
		}
		scan.close();
	}
	
}
