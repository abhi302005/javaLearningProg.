package forLoop;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		=> creating Scanner object.
		Scanner input = new Scanner(System.in);
		
		System.out.println("=> Enter the value of which you want to find the 'factorial'");
		System.out.println("=> the value should be an Integer.");
		int value = input.nextInt();
		int result = value;
		for (int index = 1; index <= value; index++) {
			result *= result;	
		}
		System.out.println("final output:\t"+ result);
	}

}
