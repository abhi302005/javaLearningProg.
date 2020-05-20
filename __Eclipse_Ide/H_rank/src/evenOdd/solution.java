package evenOdd;
import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		=> creating Scanner object.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value to check is even or not.");
		int value = input.nextInt();
		
		if ( value %2 != 0) {
			System.out.println("*the value is ODD.");
		} else {
			System.out.println("*the value is EVEN");
		}
	}

}
