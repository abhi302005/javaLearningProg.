package string;

import java.util.Scanner;

public class Prog_1 {

	public static void main(String[] args) {
//		=> Creating the scanner Object;
		Scanner input = new Scanner(System.in);
		
//		string input.
		System.out.println("Enter the name:");
		String str = input.nextLine();
		
//		=> working with the some String method
		
////		=> displaying the character using the indexing
//		System.out.println(str.charAt(4));
		
////		=> concating two string using the inbuilt method
//		System.out.println(str.concat(" sharma"));
		
////		=> using the endsWith method
//		System.out.println(str.endsWith("ya"));
		
//		=> using the indexOf method
//		System.out.println(str.indexOf("y"));
		
//		printing the string
		System.out.print("your name is:\t"+ str);
		

	}

}
