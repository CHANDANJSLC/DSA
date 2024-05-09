package dsa;
import java.util.*;
public class LCM_7 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int a =scan.nextInt(); //2
		int b =scan.nextInt(); //5  
		
		
		int res = Math.max(a,b); //Find max of a or b.
		while(true) {
			if(res%a==0 && res%b==0) {  //max/a and max/b both should be zero , then prtint res
				break;
			}
			res++; //increment res unitll both are zero.
		}
		System.out.println(res);  //Outpu is 10 LCM.
		scan.close();
		
	}
}
