//	inserting the element in the array if it will  not exist
// 	position: {=> given by user}

package array.insertion;

import java.util.Scanner;

public class AtGivenPosition_RepNotAllowed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

//		creating the Scanner object
		Scanner input = new Scanner(System.in);
		
//		taking the input
		System.out.println("Enter the Size of array");
		final int SIZE = input.nextInt();
		int [] array = new int [SIZE];
		
		for(int index =0 ; index < array.length; index++) {
			System.out.print((index+1)+" =>");
			array[index] = input.nextInt();
		}
		
//		checking the condition
		while(true) {
		System.out.println("please enter the postion");
		int position = input.nextInt();
		position--;
		if(position< array.length) {
			int element;
			while(true) {
		
				System.out.println("\n Enter the element to change");
				element = input.nextInt();
				int index=0;
				for(; index< array.length; index++) {
			
					if(element == array[index] ) break;
		
				}
				if(index == array.length) {
					array[position] = element;
					break;
				} else continue;
		
		}
			break;
		}else continue;
		}
//		printing the final output on console
		System.out.println("the array elements are:");
		
		for(int index=0; index<array.length; index++) {
			System.out.println((index+1)+" => "+ array[index]);
		}

	}

}
