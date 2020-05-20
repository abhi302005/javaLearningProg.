package whileLoop;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		=> creating the Scanner object.
		Scanner input = new Scanner(System.in);
		
//		=> taking the input
		System.out.println("=> Enter the 'Integer value'");
		int value = input.nextInt();
		
//		=> calculating the result
		int result =0;
		int temp = value;
		int x;
//		int temp_1 =0 ;
		while (temp>0) {	
			x = temp % 10;
			result += x;
			result *=10;
			temp /=10;
	}           
		result /=10;
		System.out.println("final result:\t"+result);

}
}
