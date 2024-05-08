package dsa;

public class count_number_of_digits_3 {
	public static void main(String args[]) {
		int n = 1234;
		int count=0;
		
		while(n>0) 
		{
			n=n/10; //Remove last digit
			count++; //and then count the removed last digit
		}
		System.out.println(count);
	
	}
}
