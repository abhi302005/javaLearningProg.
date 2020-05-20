//	we are to to insert the integer value wether if if exits or not 
//	position: {=> at last index}
package array.insertion;
import java.util.Scanner;

public class RepationAllow {
	public static void main(String args[]) {
	
//		creating the Scanner object
		Scanner input = new Scanner(System.in);
		
//		taking the input
		System.out.println("Enter the Size of array");
		final int SIZE = input.nextInt();
		int [] array = new int [SIZE];
		
		for(int index =0 ; index < array.length; index++) {
			System.out.print(index+" =>");
			array[index] = input.nextInt();
		}
		
		System.out.println("\n Enter the element to change");
		int element = input.nextInt();
		
		array[array.length-1] = element;
		
//		printing the final output on console
		System.out.println("the array elements are:");
		
		for(int index=0; index<array.length; index++) {
			System.out.println(index+" => "+ array[index]);
		}
		
		
		
	}

}
