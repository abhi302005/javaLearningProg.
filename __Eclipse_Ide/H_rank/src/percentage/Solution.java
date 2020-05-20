package percentage;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		=> creating the Scanner object
		Scanner input = new Scanner(System.in);
		
//		=> variable declaration
		System.out.println("Enter the quiz Score.");
		float quiz = input.nextFloat();
		
		System.out.println("Enter the mid-Score.");
		float midScore = input.nextFloat();
		
		System.out.println("Enter the final-Score.");
		float finalScore = input.nextFloat();
		
		if( quiz >100 || midScore >100 || finalScore >100) {
			System.out.println("=> plz check the data you Enter.");
			
//			=>terminating the program due to in-correct input. 
			System.exit(0);
		}
		
		float result = ((quiz + midScore + finalScore)/300)*100;
		
//		=> putting the desired condition's.
		
		if( result >= 90 ) {
			System.out.println("Grade A");
		} else if ( result >=70 && result < 90) {
			System.out.println("Grade B");
		} else if ( result >=50 && result < 70) {
			System.out.println("Grade C");
		}else {
			System.out.println("Grade F");
		}

	}// end of main()

}
