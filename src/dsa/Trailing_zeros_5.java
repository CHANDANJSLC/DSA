package dsa;


public class Trailing_zeros_5 {

	public static void main(String[] args) {
		int n = 5;  //factorial of 5!= 120, so the no of zeros in last is 1 Zero . Soooutput is 1.
		int res = 0;
		int powof5 = 5; //No of 5's is equal to number of trailing Zeroes.
		
		while(n<=powof5) //Numerator is less than denominator => numerator/5 then enter the loop.
		{ 
			res = res+ (n/powof5);
			powof5 = powof5 * 5;  //5,25,125,625......
		}
		
		System.out.println(res);
	}
}
