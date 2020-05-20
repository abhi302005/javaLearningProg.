package whileLoop;
import java.util.Scanner;

public class PrimeOR_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		=> creating the Scanner object
		Scanner input = new Scanner(System.in);
		
//		=> taking input
		System.out.println("=> Enter the value");
		int value = input.nextInt();
		int index = 2;
		
		while (index != value) {
			if(value %2 != 0) {
				index++;
				continue;
			}else {
				break;
			}
		}
		
		if (index == value) {
			System.out.println("*the number you enter is prime");
		}else System.out.println("*the number is not prime");
				
	
		

	}

}
