package whileLoop;
import java.util.Scanner;

public class SumEven_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		=> creating the Scanner object.
		Scanner input = new Scanner(System.in);
		
//		=> taking the input
		System.out.println("=> Enter the 'Integer value'");
		int value = input.nextInt();
		
//		=> calculating the result
		int oddSum =0;
		int evenSum =0;
		int temp = value;
		int x;

		while (temp>0) {	
			x = temp % 10;
			if (x%2 != 0) {
				oddSum += x;
			}else {
				evenSum += x;
			}
			temp /=10;
	}           
		
		System.out.println("Sum of even number:\t"+ evenSum);
		System.out.println("Sum of odd number:\t"+ oddSum);

	}

}
