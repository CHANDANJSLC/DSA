package dsa;
import java.util.*;
public class prime_factors_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();    //900
		int i=2;
		while(n>1)      
		{
			while(n%i==0)        //Untill if it is divisible.
			{	
				System.out.println(i);
				n=n/i;         
			}
			i++;
		}
		
		
		scan.close();

	}

}
