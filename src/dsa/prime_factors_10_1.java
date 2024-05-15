package dsa;
import java.util.Scanner;
public class prime_factors_10_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i=2;
		while(i*i<=n)         
		{
			while(n%i==0) 
			{
				System.out.println(i);
				n=n/i;
			}
			i++;
		}
		if(n>1)
		{
			System.out.println(n);
		}
		scan.close();
	}
}
