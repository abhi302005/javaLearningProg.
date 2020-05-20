//	inserting the element in the array if it will  exits or not
// 	position: {=> given by user}

package array.insertion;

import java.util.Scanner;

public class AtGivenPos_RepationAllow {

	public static void main(String[] args) {
		
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
		
		while(true) {
		System.out.println("please enter the postion");
		int position = input.nextInt();
		position--;
		if(position< array.length) {
		System.out.println("\n Enter the element to change");
		int element = input.nextInt();
		
		array[position] = element;
		}else continue;
		break;
		}
		
//		printing the final output on console
		System.out.println("the array elements are:");
		
		for(int index=0; index<array.length; index++) {
			System.out.println(index+" => "+ array[index]);
		}

	}

}
