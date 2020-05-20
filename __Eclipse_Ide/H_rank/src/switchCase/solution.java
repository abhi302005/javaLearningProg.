package switchCase;
import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		=> creating the Scanner Object.
		Scanner input = new Scanner(System.in);
		
//		=> taking input
		System.out.println("=>Enter your rating to regarding our service.");
		int rating = input.nextInt();
		
		switch(rating) {
		
		case 1: 
		case 2: System.out.println("*poor");
			break;
		case 3: System.out.println("*avg.");
			break;
		case 4:
		case 5: System.out.println("*good");
			break;
			
		default: System.out.println("plz enter correct data");;
		}

	}

}
