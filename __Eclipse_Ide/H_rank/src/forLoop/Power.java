package forLoop;
import java.util.Scanner;

public class Power {
	public static void main (String[] args) {
		
//		=> creating the Scanner object
		Scanner input = new Scanner(System.in);
		
//		=> taking the input
		System.out.println("=> Enter the value");
		int value = input.nextInt();
		System.out.println("=> Enter the power");
		int power = input.nextInt();
		
//		=> for storing the final result
		int result =1;
		
//		=> calculating the power.
		for (int index = 1; index <= power; index++) {
			result *= value;
		}
		
		System.out.println("final result:\t"+result);
}
}
