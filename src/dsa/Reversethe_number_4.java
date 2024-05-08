package dsa;


public class Reversethe_number_4 {
	public static void main(String args[]) {
	int n=12345;
	int rev=0;
	
	while(n>0) {
		rev = (rev*10) + (n%10);//Get last digit
		n=n/10; //Remove last digit and update
	}
	System.out.println(rev);

	}
}
