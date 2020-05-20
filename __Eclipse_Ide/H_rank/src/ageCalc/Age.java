package ageCalc;
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		=> creating the Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your age.");
		int age = input.nextInt();
		
//		=> checking the conditions
		
		if ( age >= 18 ) {
			System.out.println("*you are eligible to vote");
		} else {
			System.out.println("*first become 18+");
		}
		
		
		

	}

}
